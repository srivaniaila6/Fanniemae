package com.techouts.fanniemae.test.page.actions;

import static com.techouts.fanniemae.webelement.ops.WebElementOperations.captureScreenShotOnPass;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.click;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.corporaterSearch;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.dropDownByTextVisibility;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.getAttributeValue;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.getText;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.park;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.sendKeys;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.switchToDefaultContentFrame;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.switchToFrame;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.verifyPageTitle;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.waitForPageLoad;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.enterByRobot;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.waitForElementClickable;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.techouts.fanniemae.consts.FanniemaeConstants;
import com.techouts.fanniemae.exceptions.FannieMaeBusinessException;
import com.techouts.fanniemae.page.elements.WebElementFactory;
import com.techouts.fanniemae.page.elements.WebElementFactory1;
import com.techouts.fanniemae.test.AbstractTest;
import com.techouts.fanniemae.util.Assert;
import com.techouts.fanniemae.util.PathProvider;

/**
 * 
 * @author TO-WVLD-12
 *
 */
public class HomePageActions {
	
	private static final Logger LOG = Logger.getLogger(HomePageActions.class.getName());
	public static final String ADD_FILES_EXE = PathProvider.getForTestData()+"/AddFiles.exe";
	private WebElementFactory elementFactory;
	private WebElementFactory1 elementFactory1;
	private WebDriver driver = null;
	
	public HomePageActions(WebElementFactory elementFactory, WebDriver driver) {
		super();
		this.elementFactory = elementFactory;
		this.driver = driver;
	}
	
	public HomePageActions(WebElementFactory1 elementFactory1, WebDriver driver) {
		super();
		this.elementFactory1 = elementFactory1;
		this.driver = driver;
	}
	
	private static int pRWatchers = FanniemaeConstants.C;
	private static int itemDescription = FanniemaeConstants.M;
	private static int itemPrice = FanniemaeConstants.N;
	private static int itemQuantity = FanniemaeConstants.O;
	private static int gLAccount = FanniemaeConstants.P;
	private static int costCentre = FanniemaeConstants.Q;
	private static int requisitionName = FanniemaeConstants.R;
	private static int justification = FanniemaeConstants.S;
	private static int unitOfMeasure = FanniemaeConstants.W;
	private static int peopleSoftProjectID = FanniemaeConstants.AC;
	private static int supplierType = FanniemaeConstants.AD;
	private static int contractTitle =FanniemaeConstants.AZ;
	private static int contractType =FanniemaeConstants.BA;
	private static int supplier=FanniemaeConstants.BC;
	private static int costcenter=FanniemaeConstants.BD;
	private static int pepolesoftproject=FanniemaeConstants.BE;
	private static int primaryCategory=FanniemaeConstants.BF;
	private static int productsServicesDescription=FanniemaeConstants.BG;
	private static int contractStatusIndicator=FanniemaeConstants.BI;
	private static int statusUpdateNextSteps=FanniemaeConstants.BJ;
	private static int thirdPartyData=FanniemaeConstants.BO;
	private static int transactionLegalSME=FanniemaeConstants.BP;
	private static int chargedtheloan=FanniemaeConstants.BQ;
	private static int legal=FanniemaeConstants.BR;
	private static int createdfromPR=FanniemaeConstants.BS;
	private static int getBudgetBUApprovalProvidedinFieldglass=FanniemaeConstants.BU;
	
	
	public boolean login(String username,String password,String pageTitle){
		try {
			sendKeys(driver, elementFactory.getUsernameProcureOne(), username);
			park(0.5);
			sendKeys(driver, elementFactory.getPasswordProcureOne(), password);
			park(0.5);
			click(driver, elementFactory.getLoginProcureOne());
			waitForPageLoad(driver,15);
			Assert.assertTrue(verifyPageTitle(driver, pageTitle),"Page title is not matched with expected title.");
			return true;
		} catch (Exception e) {
			LOG.error("Login failed");
			return false;
		}
	}
	
	public void autoSuggestionHandle(WebElement inputBox, String inputText ){
		try {
			sendKeys(driver, inputBox,inputText);
			park(2);
			click(driver, elementFactory.getCostCentreList());
		} catch (Exception e) {
			LOG.error("Failed to select a value from AutoFill suggestion");
		}
	}
	
	public String[] createRequisition(String method,String serialNo, String sheetName){
		try {
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
			park(2);
			click(driver, elementFactory.getProcurement());
			click(driver, elementFactory.getCreateRequisition());
			captureScreenShotOnPass(driver, method);
			park(2);
			waitForPageLoad(driver, 15);
			sendKeys(driver, elementFactory.getRequisitionName(), AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo,requisitionName, sheetName));
			String requester = getAttributeValue(driver, elementFactory.getHeaderInformationRequester());
			park(2);
			sendKeys(driver, elementFactory.getHeaderInformationPRWatchers(),  AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo,pRWatchers, sheetName));
			park(2);
			sendKeys(driver, elementFactory.getJustification(), AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo,justification, sheetName));
			//park(5);
			waitForElementClickable(driver, 10, elementFactory.getCostCentreList());
			click(driver,elementFactory.getCostCentreList());
			click(driver, elementFactory.getClickDragToAddFiles());
			captureScreenShotOnPass(driver, method);
			park(2);
			Runtime.getRuntime().exec(ADD_FILES_EXE);
			park(4);
			click(driver, elementFactory.getSaveButton());
			park(2);
			return new String[]{getText(driver, elementFactory.getBasketNo()) , requester};	
		} catch (Exception e) {
			LOG.error("Failed to create Requisition ",e);
			return new String[] {null};
		}
		
	}
	
	public boolean addItemDetails(String method,String serialNo,String requester, String sheetName){
		try {
			park(2);
			click(driver, elementFactory.getAddItem());
			park(2);
			captureScreenShotOnPass(driver, method);
			switchToFrame(driver, 0);
			sendKeys(driver, elementFactory.getItemDescription(), AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, itemDescription, sheetName));
			park(2);
			sendKeys(driver, elementFactory.getItemPrice(), AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, itemPrice, sheetName));
			park(2);
			sendKeys(driver, elementFactory.getItemQuantity(), AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, itemQuantity, sheetName));
			park(2);
			dropDownByTextVisibility(driver, elementFactory.getUnitOfMeasure(), AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, unitOfMeasure, sheetName));
			park(2);
			click(driver, elementFactory.getCategoryButton());
			park(2);
			captureScreenShotOnPass(driver, method);
			switchToDefaultContentFrame(driver);
			switchToFrame(driver, 1);
			click(driver, elementFactory.getLabelIcon());
			park(2);
			switchToDefaultContentFrame(driver);
			switchToFrame(driver, 0);
			park(2);
			captureScreenShotOnPass(driver, method);
			return true;
		} catch (Exception e) {
			LOG.info("Fails to add item details");
			return false;
		}
	}
	
	public boolean costAllocationAndCommentUpdate(String method,String serialNo, String sheetName){
		try {
			click(driver, elementFactory.getLabelSaveButton());
			park(3);
			waitForPageLoad(driver,10);
			switchToDefaultContentFrame(driver);
			switchToFrame(driver, 0);
			captureScreenShotOnPass(driver, method);
			click(driver, elementFactory.getGlAccountButton());
			switchToDefaultContentFrame(driver);
			switchToFrame(driver, 1);
			captureScreenShotOnPass(driver, method);
			sendKeys(driver, elementFactory.getAccountSelectionKeyWords(), AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, gLAccount, sheetName));
			click(driver, elementFactory.getAccountSelectionSearch());
			park(2);
			captureScreenShotOnPass(driver, method);
			click(driver, elementFactory.getAccountSelectionLabelIcon());
			switchToDefaultContentFrame(driver);
			switchToFrame(driver, 0);
			park(2);
			sendKeys(driver, elementFactory.getCostCenter(), AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, costCentre, sheetName));
			//park(4);
			waitForElementClickable(driver, 15, elementFactory.getCostCentreList());
			click(driver, elementFactory.getCostCentreList());
			waitForPageLoad(driver,10);
			park(4);
			sendKeys(driver, elementFactory.getPeopleSoftProjectID(), AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, peopleSoftProjectID, sheetName));
			//park(4);
			waitForElementClickable(driver, 15, elementFactory.getCostCentreList());
			click(driver, elementFactory.getCostCentreList());
			waitForPageLoad(driver,10);
			captureScreenShotOnPass(driver, method);
			park(4);
			click(driver, elementFactory.getSaveandCloseButton());
			park(4);
			waitForPageLoad(driver,10);
			captureScreenShotOnPass(driver, method);
			switchToDefaultContentFrame(driver);
			return true;
		} catch (Exception e) {
			LOG.error("Fails to add comment or Cost Allocation");
			return false;
		}
	}
	
	public boolean datePickerWithAllOptions() {
		click(driver, elementFactory.getDatePickerOneDayBtn());
		park(0.5);
		click(driver, elementFactory.getDatePickerTodayBtn());
		park(1);
		click(driver, elementFactory.getDatePickerCrossMark());
		return true;
	}
	
	public boolean logout(String testCaseName){
		try {
			click(driver, elementFactory.getLoginMenu());
			park(2);
			captureScreenShotOnPass(driver, testCaseName);
			click(driver, elementFactory.getLogOutButton());
			park(2);
			waitForPageLoad(driver, 15);
			captureScreenShotOnPass(driver, testCaseName);
			return true;
		} catch (Exception e) {
			throw new FannieMaeBusinessException("unable to perform logout operation in TestCase["+testCaseName+"].");
		}
	}
	
	public boolean searchAndVerifyCreatedOne(String testCaseName,String testCaseNumber,String legalNameUpdate, String sheetName){
		try {
			park(3);
			waitForPageLoad(driver, 15);
			click(driver, elementFactory.getCreateSupplierSupplierLink());
			park(0.5);
			click(driver, elementFactory.getCreateSupplierBrowseSuppliers());
			captureScreenShotOnPass(driver, testCaseName);
			park(3);
			waitForPageLoad(driver, 15);
			click(driver, elementFactory.getCreateSupplierStatusCroseMark());
			dropDownByTextVisibility(driver, elementFactory.getSearchSupplierSupplierType(),AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, supplierType, sheetName));
			sendKeys(driver, elementFactory.getSearchSupplierSearchKeyword(), legalNameUpdate);
			click(driver, elementFactory.getSearchSupplierSearchButton());
			waitForPageLoad(driver, 15);
			captureScreenShotOnPass(driver, testCaseName);
			Assert.assertTrue(corporaterSearch(driver, elementFactory.getSearchSupplierResultGridSupplierId(), legalNameUpdate),"Search operation fails");
			park(3);
			waitForPageLoad(driver, 15);
			//click(driver, elementFactory.getCreateSupplierExitButton());
			return true;
		} catch (Exception e) {
			LOG.debug("search and verify failed");
			return false;
		}
	}
	
	public boolean createMasterServicesAgreement(String testCaseName,String testCaseNumber, String DEFAULT_SHEET_NAME){
		try {
			park(2);
			click(driver, elementFactory.getContracts());
			click(driver, elementFactory.getCreatecontract());
			waitForPageLoad(driver,15);
			captureScreenShotOnPass(driver, testCaseName);
			click(driver, elementFactory.getCspviolation());
			captureScreenShotOnPass(driver, testCaseName);
			sendKeys(driver, elementFactory.getContractTitle(), AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, contractTitle, DEFAULT_SHEET_NAME));
			dropDownByTextVisibility(driver, elementFactory.getContractType(),AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, contractType, DEFAULT_SHEET_NAME));
			park(5);
			sendKeys(driver, elementFactory.getSupplier(), AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, supplier, DEFAULT_SHEET_NAME));
			park(2);
			enterByRobot();
			park(3);
			waitForPageLoad(driver,15);
			sendKeys(driver, elementFactory.getCostcenter(), AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, costcenter, DEFAULT_SHEET_NAME));
			park(2);
			enterByRobot();
			park(3);
			waitForPageLoad(driver,15);
			sendKeys(driver, elementFactory.getPepolesoftproject(), AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, pepolesoftproject, DEFAULT_SHEET_NAME));
			park(2);
			enterByRobot();
			park(3);
			waitForPageLoad(driver,15);
			click(driver, elementFactory.getFileattach());
			captureScreenShotOnPass(driver, testCaseName);
			Runtime.getRuntime().exec(ADD_FILES_EXE);
			park(2);
			sendKeys(driver, elementFactory.getPrimaryCategory(), AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, primaryCategory, DEFAULT_SHEET_NAME));
			park(2);
			enterByRobot();
			park(3);
			waitForPageLoad(driver,15);
			sendKeys(driver, elementFactory.getProductsServicesDescription(), AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, productsServicesDescription, DEFAULT_SHEET_NAME));			
			dropDownByTextVisibility(driver, elementFactory.getContractStatusIndicator(),AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, contractStatusIndicator, DEFAULT_SHEET_NAME));
			sendKeys(driver, elementFactory.getStatusUpdateNextSteps(), AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, statusUpdateNextSteps, DEFAULT_SHEET_NAME));		
			//Approvals
			park(1);
			dropDownByTextVisibility(driver, elementFactory.getThirdPartyData(),AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, thirdPartyData, DEFAULT_SHEET_NAME));
			park(1);
			dropDownByTextVisibility(driver, elementFactory.getTransactionLegalSME(),AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, transactionLegalSME, DEFAULT_SHEET_NAME));
			park(1);
			dropDownByTextVisibility(driver, elementFactory.getChargedtheloan(),AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, chargedtheloan, DEFAULT_SHEET_NAME));
			park(4);
			dropDownByTextVisibility(driver, elementFactory.getLegal(),AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, legal, DEFAULT_SHEET_NAME));
			park(2);
			dropDownByTextVisibility(driver, elementFactory.getCreatedfromPR(),AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, createdfromPR, DEFAULT_SHEET_NAME));		
			park(3);
			dropDownByTextVisibility(driver, elementFactory.getBudgetBUApprovalProvidedinFieldglass(),AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, getBudgetBUApprovalProvidedinFieldglass, DEFAULT_SHEET_NAME));			
			park(5);
			return true;
		} catch (Exception e) {
			LOG.error("Failed to createMasterServicesAgreement ",e);
			return false;
		}
		
	}
	
	public boolean clickOnThreeDotsAndSelectData(String testCaseName,WebElement button,String searchText){
		try {
			click(driver,button);
			switchToFrame(driver, 0);
			captureScreenShotOnPass(driver, testCaseName);
			sendKeys(driver,elementFactory.getCreateSupplierBankInfoSearchBox(),searchText);
			click(driver,elementFactory.getCreateSupplierBankInfoSearchBtn());
			click(driver,elementFactory.getCreateSupplierBankInfoClickOnResult());
			switchToDefaultContentFrame(driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}