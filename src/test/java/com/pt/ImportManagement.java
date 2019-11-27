package com.pt;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.techouts.fanniemae.page.elements.WebElementFactory1;
import com.techouts.fanniemae.consts.FanniemaeConstants;
import com.techouts.fanniemae.test.AbstractTest;
import com.techouts.fanniemae.util.Assert;
import com.techouts.fanniemae.webelement.ops.WebElementOperations;

public class ImportManagement extends AbstractTest{
	private static final Logger LOG=Logger.getLogger(ImportManagement.class.getName());
	private String sheetname = FanniemaeConstants.SHEET_NAME;
	
	private int userName = FanniemaeConstants.C;
	private int password = FanniemaeConstants.D;
	private int landingPageTitle = FanniemaeConstants.N;
	private int keywords = FanniemaeConstants.E;
	private int importType = FanniemaeConstants.F;
	private int anomalies = FanniemaeConstants.G;
	private int date = FanniemaeConstants.H;
	private int dateTo = FanniemaeConstants.I;
	private int system = FanniemaeConstants.J;
	private int keywords1 = FanniemaeConstants.K;
	private int status = FanniemaeConstants.L;
	private int  deployed= FanniemaeConstants.M;
	@Test
	public void importManagement() {
		String testCaseName="ImportManagement";
		String serialNo="1";
		getFannieMaePage();
		WebElementOperations.park(2);
		Assert.assertTrue(WebElementOperations.verifyPageTitle(getDriver(), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME)));
		HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(serialNo, userName, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, password, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME));
		WebElementOperations.click(getDriver(),getWebElementFactory1().getIntegration());
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(getDriver(), 15);
		WebElementOperations.click(getDriver(),getWebElementFactory1().getImportManagement());
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(getDriver(), 15);
		WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getKeywordsInImportManagement(), REPOSITORY.getCellDataOnTestCase(serialNo, keywords, DEFAULT_SHEET_NAME));
		WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getImportType(), REPOSITORY.getCellDataOnTestCase(serialNo, importType, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.enterByRobot();
		WebElementOperations.park(2);
		WebElementOperations.dropDownByTextVisibility(getDriver(),getWebElementFactory1().getAnomalies(),REPOSITORY.getCellDataOnTestCase(serialNo, anomalies, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getDateInImportManagement(), REPOSITORY.getCellDataOnTestCase(serialNo, date, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.enterByRobot();
		WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getDateToInImportManagement(), REPOSITORY.getCellDataOnTestCase(serialNo, dateTo, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.enterByRobot();
		WebElementOperations.park(2);
		WebElementOperations.dropDownByTextVisibility(getDriver(),getWebElementFactory1().getSystem(),REPOSITORY.getCellDataOnTestCase(serialNo, system, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.click(getDriver(), getWebElementFactory1().getCreateAnImport());
		WebElementOperations.park(2);
		WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getKeywordsInCreateAnImport(), REPOSITORY.getCellDataOnTestCase(serialNo, keywords1, DEFAULT_SHEET_NAME));
		WebElementOperations.dropDownByTextVisibility(getDriver(), getWebElementFactory1().getDeployedInCreateAnImport(), REPOSITORY.getCellDataOnTestCase(serialNo, deployed, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2); 
		WebElementOperations.dropDownByTextVisibility(getDriver(), getWebElementFactory1().getStatusInCreateAnImport(), REPOSITORY.getCellDataOnTestCase(serialNo, status, DEFAULT_SHEET_NAME));
	    WebElementOperations.park(2); 
	    HOMEPAGE_ACTIONS.logout(testCaseName);
	}

}

