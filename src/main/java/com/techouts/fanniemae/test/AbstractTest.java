package com.techouts.fanniemae.test;



import java.io.FileOutputStream;
import java.nio.file.Path;
import java.util.Date;
import java.util.Objects;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.techouts.fanniemae.consts.FanniemaeConstants;
import com.techouts.fanniemae.dao.WorkbookOperations;
import com.techouts.fanniemae.driver.WebDriverProducer;
import com.techouts.fanniemae.dto.mail.MailParam;
import com.techouts.fanniemae.dto.testcase.SuiteResult;
import com.techouts.fanniemae.dto.testcase.TestCaseResult;
import com.techouts.fanniemae.enums.Browser;
import com.techouts.fanniemae.exceptions.FannieMaeBusinessException;
import com.techouts.fanniemae.mail.DefaultMailService;
import com.techouts.fanniemae.mail.MailContentPreparer;
import com.techouts.fanniemae.page.elements.WebElementFactory;
import com.techouts.fanniemae.page.elements.WebElementFactory1;
import com.techouts.fanniemae.registry.Registry;
import com.techouts.fanniemae.registry.RegistryKey;
import com.techouts.fanniemae.repo.TestExcelRepository;
import com.techouts.fanniemae.test.page.actions.HomePageActions;
import com.techouts.fanniemae.util.CommonUtils;
import com.techouts.fanniemae.util.PathProvider;
import com.techouts.fanniemae.util.TestReportGenerator;
import com.techouts.fanniemae.webelement.ops.WebElementOperations;

/**
 * 
 * @author TO-WVLD-12
 *
 */
public abstract class AbstractTest implements AbstractPerformer {
	
	private static final WebDriver DRIVER;
	private static final WebElementFactory WEBELEMENTFACTORY;
	private static final WebElementFactory1 WEBELEMENTFACTORY1;
	protected static final String DEFAULT_SHEET_NAME;
	protected static final String DEFAULT_WORKBOOK_NAME;
	protected static final TestExcelRepository REPOSITORY;
	protected static final WorkbookOperations VIRTUAL_BOOK_REPOSITORY;
	protected static final boolean IS_EXCEL_MOD_IN_BEFORE_CLASS;
	protected static final boolean IS_EXCEL_MOD_IN_BEFORE_SUITE;
	protected static final Path WORKBOOK_PATH;
	protected static final String CHROME_SYS_PROP_KEY = "webdriver.chrome.driver";
	protected static final String FIREFOX_SYS_PROP_KEY = "webdriver.gecko.driver";
	protected static final String IE_SYS_PROP_KEY = "webdriver.ie.driver";
	protected static final HomePageActions HOMEPAGE_ACTIONS;
	protected static final HomePageActions HOMEPAGE_ACTION;
	
	protected static final Logger LOG = Logger.getLogger(AbstractTest.class.getName()); 
	
	static{
		DEFAULT_SHEET_NAME = PathProvider.getDefaultConfiguredWorkbookSheetName();
		DEFAULT_WORKBOOK_NAME = PathProvider.getDefaultConfiguredWorkbookName();
		DRIVER = WebDriverProducer.getWebDriver(CommonUtils.getConfiguredDriverBrowser(), CommonUtils.getConfiguredCapabilities());
		WEBELEMENTFACTORY = PageFactory.initElements(DRIVER, WebElementFactory.class);
		WEBELEMENTFACTORY1 = PageFactory.initElements(DRIVER, WebElementFactory1.class);
		WORKBOOK_PATH = PathProvider.getTestDataFilePath();
		REPOSITORY = new TestExcelRepository();
		VIRTUAL_BOOK_REPOSITORY = new WorkbookOperations(WORKBOOK_PATH);
		HOMEPAGE_ACTIONS = new HomePageActions(WEBELEMENTFACTORY, DRIVER);
		HOMEPAGE_ACTION = new HomePageActions(WEBELEMENTFACTORY1, DRIVER);
		
		IS_EXCEL_MOD_IN_BEFORE_SUITE = CommonUtils.getConfigForExcelModInBeforeSuiteContext();
		IS_EXCEL_MOD_IN_BEFORE_CLASS = (!IS_EXCEL_MOD_IN_BEFORE_SUITE) ? Boolean.TRUE.booleanValue() : Boolean.FALSE.booleanValue();
	}
	
	@BeforeClass
	public void beforeClass(){
		this.performBeforeClass();
	}
	
	@AfterClass
	public void afterClass(){
		this.performAfterClass();
	}
	
	@Override
	public void performBeforeClass(){
		LOG.debug("Performing BeforeClass operation.");
		if(IS_EXCEL_MOD_IN_BEFORE_CLASS){
			boolean isLoaded = REPOSITORY.loadExcelFile(WORKBOOK_PATH);
			if(!isLoaded){
				int exitCode = 1;
				LOG.error("Error occurred while loading ExcelBook. exiting system with ErrorCode:"+exitCode);
				System.exit(exitCode);
			}
		}
	}
	
	@Override
	public void performAfterClass(){
		LOG.debug("Performing AfterClass operation.");
		if(IS_EXCEL_MOD_IN_BEFORE_CLASS)
			REPOSITORY.close();
	}
	
	@Override
	public void init(){
		LOG.debug("TestNG suite execution started. initializing all the application dependencies.");
		Registry.setAttribute(RegistryKey.SUITE_EXE_START_TIME, new Date());
		String timestamp = (String)Registry.getAttribute(RegistryKey.DIR_TIMESTAMP_SUFFIX);
		CommonUtils.checkAndCreateProjStructure();
		CommonUtils.genScreenshotDirsForCurrentExe(timestamp);
		Registry.setAttribute(RegistryKey.DEFAULT_CONFIGURED_BROWSER, CommonUtils.getConfiguredDriverBrowser());
		Registry.setAttribute(RegistryKey.TEST_SUITE_RESULT, new SuiteResult());
		Registry.setAttribute(RegistryKey.MAIL_PARAM, new MailParam());
		Registry.setAttribute(RegistryKey.CURRENT_EXE_SNAP_ROOT_PATH, PathProvider.getCurExecScreenshotRootDir(timestamp));
		Registry.setAttribute(RegistryKey.EXCEL_RESULT_COL_INDEX, CommonUtils.getDefaultConfTestCaseResultExcelColumnIndex());
		Registry.setAttribute(RegistryKey.EXCEL_RESULTCOMMENT_COL_INDEX, CommonUtils.getDefaultConfTestCaseResultCommentExcelColumnIndex());
		Registry.setAttribute(RegistryKey.EXCEL_DEFAULT_CONFIGURED_SHEET_NAME, PathProvider.getDefaultConfiguredWorkbookSheetName());
		Registry.setAttribute(RegistryKey.EXCEL_DEFAULT_CONFIGURED_WORKBOOK_NAME, PathProvider.getDefaultConfiguredWorkbookName());
		Registry.setAttribute(RegistryKey.PDF_REPORT_FILE_PATH, PathProvider.getGenPDFReportFilePath(timestamp));
		if(IS_EXCEL_MOD_IN_BEFORE_SUITE){
			boolean isLoaded = REPOSITORY.loadExcelFile(WORKBOOK_PATH);
			if(!isLoaded){
				int exitCode = 1;
				LOG.error("Error occurred while loading ExcelBook. exiting system with ErrorCode:"+exitCode);
				System.exit(exitCode);
			}
		}
		LOG.debug("Initializing completed for application dependencies.");
	}
	
	@Override
	public void destroy(){
		LOG.debug("Performing post suite execution operation and Destroying all the initialized content.");
		Registry.setAttribute(RegistryKey.SUITE_EXE_END_TIME, new Date());
		WebDriverProducer.closeAll();
		if(IS_EXCEL_MOD_IN_BEFORE_SUITE)
			REPOSITORY.close();
		new TestReportGenerator().generate();
		triggerEmail();
		Object obj = Registry.getAttribute(RegistryKey.PDF_REPORT_OUTPUT_STREAM);
		if(Objects.nonNull(obj))
			IOUtils.closeQuietly((FileOutputStream)obj);
		
		
		Registry.removeAll();
		try{
			Runtime.getRuntime().exec(CommonUtils.getConfiguredWebDriverKillCommand());
		}catch(Exception e){
			LOG.warn("Unable to perform WebDriver process kill operation. kill the process manually to speed-up machine");
		}
		LOG.debug("TestNG suite execution finished.");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		this.init();
	}
	
	@AfterSuite
	public void afterSuite() {
		this.destroy();
	}
	
	
	
	private void triggerEmail(){
		LOG.debug("Preparing neccessary Data for email.");
		new MailContentPreparer().prepare();
		MailParam mailParam = (MailParam)Registry.getAttribute(RegistryKey.MAIL_PARAM);
		SuiteResult suiteResult = (SuiteResult)Registry.getAttribute(RegistryKey.TEST_SUITE_RESULT);
		new DefaultMailService(mailParam, suiteResult).transport();
	}
	
	static{
		LOG.debug("Setting up system properties for Selenium WebDriver.");
		System.setProperty(CHROME_SYS_PROP_KEY, PathProvider.getForDriver(Browser.CHROME).toString());
		System.setProperty(FIREFOX_SYS_PROP_KEY, PathProvider.getForDriver(Browser.FIREFOX).toString());
		System.setProperty(IE_SYS_PROP_KEY, PathProvider.getForDriver(Browser.IE).toString());
	}
	
	protected boolean addFailedTestCaseResult(String testCaseName, String comment) {
		getSuiteResult().setTestCaseResult(getTestCaseResult(testCaseName, FanniemaeConstants.FALSE, comment));
		return true;
	}
	
	protected boolean addPassedTestCaseResult(String testCaseName) {
		getSuiteResult().setTestCaseResult(getTestCaseResult(testCaseName, FanniemaeConstants.TRUE, null));
		return true;
	}
	
	private TestCaseResult getTestCaseResult(String testCaseName, boolean isPassed, String comment) {
		return (StringUtils.isNotBlank(comment)) ? new TestCaseResult(testCaseName, isPassed, comment) : new TestCaseResult(testCaseName, isPassed);
	}
	
	private SuiteResult getSuiteResult() {
		SuiteResult suiteResult = (SuiteResult)Registry.getAttribute(RegistryKey.TEST_SUITE_RESULT);
		if(Objects.isNull(suiteResult)) {
			suiteResult = new SuiteResult();
			Registry.setAttribute(RegistryKey.TEST_SUITE_RESULT, suiteResult);
		}
		return suiteResult;
	}
	
	protected void getPage(String url) {
		DRIVER.get(url);
		DRIVER.manage().window().maximize();
	}
	
	protected void getFannieMaePage() {
		DRIVER.get(PathProvider.getFannieMaeBaseURL());
		DRIVER.manage().window().maximize();
	}

	public void performPostExceptionProcess(String testCaseName, String testCaseIdFromExcel, String comment, Exception e, String sheetName) {
		LOG.info("performPostExceptionProcess for Error occurred at method: " + testCaseName + ". comment:" + comment);
		try {
			addFailedTestCaseResult(testCaseName, comment);
			catchBlockupdate(testCaseName, testCaseIdFromExcel, sheetName);
			HOMEPAGE_ACTIONS.logout(testCaseName);
			throw new FannieMaeBusinessException("throwing exception to make sure capturing testcase result to testNG",e);
		}catch(Exception ex) {
			throw new FannieMaeBusinessException("throwing exception to make sure capturing testcase result to testNG",ex);
		}
		
	}
	
	private void catchBlockupdate(String testCaseName, String testCaseIdFromExcel, String sheetName) {
		try {
			WebElementOperations.captureScreenShotOnFail(DRIVER, testCaseName);
		} catch (Exception e) {
			LOG.error("Error occurred while performing post exception process for testCaseName:"+testCaseName+", testCaseIdFromExcel:"+testCaseIdFromExcel+", to ExcelSheet:"+sheetName);
		}
	}
	
	
	public static WebElementFactory getWebElementFactory(){
		return WEBELEMENTFACTORY ;
	}
	public static WebElementFactory1 getWebElementFactory1(){
		return WEBELEMENTFACTORY1 ;
	}
	
	protected WebDriver getDriver(){
		return DRIVER;
	}
	
	public static TestExcelRepository getExcelRepository(){
		return REPOSITORY;
	}
	
	public static String getDefaultConfiguredWorkbookSheetName(){
		return DEFAULT_SHEET_NAME;
	}
	
	public static String getDefaultConfiguredWorkbookName(){
		return DEFAULT_WORKBOOK_NAME;
	}
	
	public static boolean isExcelModPermissionAvailableInBeforeClass(){
		return IS_EXCEL_MOD_IN_BEFORE_CLASS;
	}
	
	public static boolean isExcelModPermissionAvailableInBeforeSuite(){
		return IS_EXCEL_MOD_IN_BEFORE_CLASS;
	}
}