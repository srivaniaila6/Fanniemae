package com.pt;





import static com.techouts.fanniemae.webelement.ops.WebElementOperations.waitForPageLoad;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.techouts.fanniemae.consts.FanniemaeConstants;
import com.techouts.fanniemae.test.AbstractTest;
import com.techouts.fanniemae.util.Assert;
import com.techouts.fanniemae.webelement.ops.WebElementOperations;

public class ImportTypesList extends AbstractTest {
	
	private static final Logger LOG=Logger.getLogger(ImportTypesList.class.getName()); 
	
	private String sheetname=FanniemaeConstants.SHEET_NAME;
	private int userName=FanniemaeConstants.C;
	private int password=FanniemaeConstants.D;
	private int keywords=FanniemaeConstants.E;
	private int system=FanniemaeConstants.J;
	private int deployed=FanniemaeConstants.M;
	private int importType=FanniemaeConstants.F;
	private int landingPageTitle=FanniemaeConstants.N;
	private int status=FanniemaeConstants.L;
	private int code=FanniemaeConstants.O;
	private int label=FanniemaeConstants.P;
	private int module=FanniemaeConstants.Q;
	private int authorisation=FanniemaeConstants.R;
	private int defaultUpdateStrategy=FanniemaeConstants.S;
	private int transactionType=FanniemaeConstants.T;
	private int correctionOfAnamoliesScreen=FanniemaeConstants.U;
	private int order=FanniemaeConstants.V;
	private int description=FanniemaeConstants.W;
	private int xpathRoot=FanniemaeConstants.X;
	private int firstLineIndex=FanniemaeConstants.Y;
	private int lastRowsToBeImported=FanniemaeConstants.Z;
	private int flatFileFormat=FanniemaeConstants.AA;
	private int textEncoding=FanniemaeConstants.AB;
	private int filesTemplateName=FanniemaeConstants.AC;
	private int importedLines=FanniemaeConstants.AD;
	private int importedFiles=FanniemaeConstants.AE;
	private int logs=FanniemaeConstants.AF;
	
	@Test
	public void importTypesList() {
		 String testCaseName="ImportTypesList";
		 String serialNo="2";
		getFannieMaePage();
		 Assert.assertTrue(WebElementOperations.verifyPageTitle(getDriver(), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME)));
		HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(serialNo, userName, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, password, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME));
		 WebElementOperations.click(getDriver(), getWebElementFactory1().getIntegration());
		 WebElementOperations.park(2);
		 WebElementOperations.click(getDriver(), getWebElementFactory1().getImportTypesList());
		 WebElementOperations.park(2);
		 waitForPageLoad(getDriver(),15);
		 WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getKeywords(), REPOSITORY.getCellDataOnTestCase(serialNo, keywords, DEFAULT_SHEET_NAME));
		 WebElementOperations.park(2);
		 WebElementOperations.dropDownByTextVisibility(getDriver(), getWebElementFactory1().getDeploy(), REPOSITORY.getCellDataOnTestCase(serialNo, deployed, DEFAULT_SHEET_NAME));
		 WebElementOperations.park(2); 
		 WebElementOperations.dropDownByTextVisibility(getDriver(), getWebElementFactory1().getStatusInImportTypesList(), REPOSITORY.getCellDataOnTestCase(serialNo, status, DEFAULT_SHEET_NAME));
		 WebElementOperations.park(2); 
	     WebElementOperations.click(getDriver(), getWebElementFactory1().getDuplicateOnExistingImportType());
	     WebElementOperations.park(5);	
		  WebElementOperations.switchToFrame(getDriver(), 0);
		  WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getSourceImportType(), REPOSITORY.getCellDataOnTestCase(serialNo, importType, DEFAULT_SHEET_NAME));
		  WebElementOperations.enterByRobot();
		  WebElementOperations.park(2);
		  WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getCode(), REPOSITORY.getCellDataOnTestCase(serialNo, code, DEFAULT_SHEET_NAME));
		  WebElementOperations.park(2);
		  WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getLabel(), REPOSITORY.getCellDataOnTestCase(serialNo, label, DEFAULT_SHEET_NAME));
		  WebElementOperations.park(2);
		  WebElementOperations.click(getDriver(), getWebElementFactory1().getClose());
		 WebElementOperations.switchToDefaultContentFrame(getDriver());
		 WebElementOperations.park(2); 
		 WebElementOperations.click(getDriver(), getWebElementFactory1().getCreateANewImportType());
		 WebElementOperations.park(2); 
		 waitForPageLoad(getDriver(),15);
		 WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getCodeIncreateANewImportType(), REPOSITORY.getCellDataOnTestCase(serialNo, code, DEFAULT_SHEET_NAME));
		 WebElementOperations.park(2);
		 WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getLabelIncreateANewImportType(), REPOSITORY.getCellDataOnTestCase(serialNo, label, DEFAULT_SHEET_NAME));
		 WebElementOperations.park(2);
		 WebElementOperations.dropDownByTextVisibility(getDriver(), getWebElementFactory1().getModuleIncreateANewImportType(), REPOSITORY.getCellDataOnTestCase(serialNo, module, DEFAULT_SHEET_NAME));
		 WebElementOperations.park(2); 
		 WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getAuthorisationIncreateANewImportType(), REPOSITORY.getCellDataOnTestCase(serialNo, authorisation, DEFAULT_SHEET_NAME));
		 WebElementOperations.park(2); 
		 WebElementOperations.enterByRobot();
		 WebElementOperations.click(getDriver(), getWebElementFactory1().getVisibleToImportAuthorsOnlyIncreateANewImportType());
		 WebElementOperations.park(2);
		 WebElementOperations.dropDownByTextVisibility(getDriver(), getWebElementFactory1().getSystemIncreateANewImportType(), REPOSITORY.getCellDataOnTestCase(serialNo, system, DEFAULT_SHEET_NAME));
		 WebElementOperations.park(2); 
		 WebElementOperations.dropDownByTextVisibility(getDriver(), getWebElementFactory1().getStatusIncreateANewImportType(), REPOSITORY.getCellDataOnTestCase(serialNo, status, DEFAULT_SHEET_NAME));
		 WebElementOperations.park(2); 
		 WebElementOperations.click(getDriver(), getWebElementFactory1().getAuthoriseInsertionsOnlyIncreateANewImportType());
		 WebElementOperations.park(2);
		 WebElementOperations.dropDownByTextVisibility(getDriver(), getWebElementFactory1().getDefaultUpdateStrategyIncreateANewImportType(), REPOSITORY.getCellDataOnTestCase(serialNo, defaultUpdateStrategy, DEFAULT_SHEET_NAME));
		 WebElementOperations.park(2); 
		 WebElementOperations.dropDownByTextVisibility(getDriver(), getWebElementFactory1().getTransactionTypeIncreateANewImportType(), REPOSITORY.getCellDataOnTestCase(serialNo, transactionType, DEFAULT_SHEET_NAME));
		 WebElementOperations.park(2); 
		 WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getCorrectionOfAnomaliesScreenIncreateANewImportType(), REPOSITORY.getCellDataOnTestCase(serialNo, correctionOfAnamoliesScreen, DEFAULT_SHEET_NAME));
		 WebElementOperations.park(2);
		 WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getOrderIncreateANewImportType(), REPOSITORY.getCellDataOnTestCase(serialNo, order, DEFAULT_SHEET_NAME));
		 WebElementOperations.park(2);
		 WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getDescriptionIncreateANewImportType(), REPOSITORY.getCellDataOnTestCase(serialNo, description, DEFAULT_SHEET_NAME));
		 WebElementOperations.park(2);
		 WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getxpathRootIncreateANewImportType(), REPOSITORY.getCellDataOnTestCase(serialNo, xpathRoot, DEFAULT_SHEET_NAME));
		 WebElementOperations.park(2);
		 WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getFirstLineIndexIncreateANewImportType(), REPOSITORY.getCellDataOnTestCase(serialNo, firstLineIndex, DEFAULT_SHEET_NAME));
		 WebElementOperations.park(2);
		 WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getLastRowsToImportIncreateANewImportType(), REPOSITORY.getCellDataOnTestCase(serialNo, lastRowsToBeImported, DEFAULT_SHEET_NAME));
		// WebElementOperations.dropDownByTextVisibility(getDriver(), getWebElementFactory1().getflatFileFormatIncreateANewImportType(), REPOSITORY.getCellDataOnTestCase(serialNo, flatFileFormat, DEFAULT_SHEET_NAME));
		// WebElementOperations.park(5); 
		// WebElementOperations.dropDownByTextVisibility(getDriver(), getWebElementFactory1().gettextEncodingIncreateANewImportType(), REPOSITORY.getCellDataOnTestCase(serialNo, textEncoding, DEFAULT_SHEET_NAME));
		 WebElementOperations.park(2); 
		 WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getFilesTemplateNameIncreateANewImportType(), REPOSITORY.getCellDataOnTestCase(serialNo,filesTemplateName , DEFAULT_SHEET_NAME));
		 WebElementOperations.park(2);
		 WebElementOperations.click(getDriver(), getWebElementFactory1().getTrimExtraSpacesIncreateANewImportType());
		 WebElementOperations.park(2);
		 WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getImportedLinesIncreateANewImportType(), REPOSITORY.getCellDataOnTestCase(serialNo, importedLines, DEFAULT_SHEET_NAME));
		 WebElementOperations.park(2);
		 WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getImportedFilesIncreateANewImportType(), REPOSITORY.getCellDataOnTestCase(serialNo, importedFiles, DEFAULT_SHEET_NAME));
		 WebElementOperations.park(2);
		 WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getLogsIncreateANewImportType(), REPOSITORY.getCellDataOnTestCase(serialNo, logs, DEFAULT_SHEET_NAME));
		 HOMEPAGE_ACTIONS.logout(testCaseName);
		 
	}
	@Test
	public void importPlush() {
		String testCaseName="ImportTypesList";
		 String serialNo="2";
		getFannieMaePage();
		 Assert.assertTrue(WebElementOperations.verifyPageTitle(getDriver(), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME)));
	   HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(serialNo, userName, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, password, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME));
		WebElementOperations.click(getDriver(), getWebElementFactory1().getIntegration());
		 WebElementOperations.park(2);
		 WebElementOperations.click(getDriver(), getWebElementFactory1().getImportFileplush());
		 WebElementOperations.park(2);
		 waitForPageLoad(getDriver(),15);
		 WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getImportTypeInImportFileplush(),REPOSITORY.getCellDataOnTestCase(serialNo,importType, DEFAULT_SHEET_NAME));
		 WebElementOperations.enterByRobot();
		 HOMEPAGE_ACTIONS.logout(testCaseName);
	}

}

