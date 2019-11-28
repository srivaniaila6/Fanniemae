package com.pt;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.techouts.fanniemae.consts.FanniemaeConstants;
import com.techouts.fanniemae.test.AbstractTest;
import com.techouts.fanniemae.util.Assert;
import com.techouts.fanniemae.webelement.ops.WebElementOperations;

import repackage.Repackage;

public class APIConsole extends AbstractTest {
private static final Logger LOG=Logger.getLogger(ImportManagement.class.getName());
	
	private String sheetname = FanniemaeConstants.SHEET_NAME;
	
	private int userName = FanniemaeConstants.C;
	private int password = FanniemaeConstants.D;
	private int landingPageTitle = FanniemaeConstants.N;
	private int keywords = FanniemaeConstants.E;
	private int module = FanniemaeConstants.Q;
	private int tableType = FanniemaeConstants.AG;
	private int objectID = FanniemaeConstants.BK;
	private int pageNumber = FanniemaeConstants.BM;
	private int pageSize = FanniemaeConstants.BL;
	private int format = FanniemaeConstants.BN;
	private int request = FanniemaeConstants.BO;
	private int response = FanniemaeConstants.BP;
	private int API = FanniemaeConstants.BQ;
	
	
	@BeforeTest
	public void openFanniemae() {
			getFannieMaePage();
			}
	
	   @Test
		public void transcodingPurchasingClassification() {
			 String testCaseName="APIConsole";
				String serialNo="8";
			Assert.assertTrue(WebElementOperations.verifyPageTitle(getDriver(), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME)));
			HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(serialNo, userName, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, password, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME));
			WebElementOperations.click(getDriver(),getWebElementFactory1().getIntegration());
			WebElementOperations.waitForPageLoad(getDriver(), 15);
			WebElementOperations.park(2);
			WebElementOperations.click(getDriver(), getWebElementFactory1().getAPIConsole());
			WebElementOperations.waitForPageLoad(getDriver(), 15);
			WebElementOperations.park(2);
			WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getObjectID(), REPOSITORY.getCellDataOnTestCase(serialNo, objectID, DEFAULT_SHEET_NAME));
			WebElementOperations.park(2);
			WebElementOperations.sendKeys(getDriver(),getWebElementFactory1().getPageSize(), REPOSITORY.getCellDataOnTestCase(serialNo, pageSize, DEFAULT_SHEET_NAME));
			WebElementOperations.park(2);
			WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getPageNumber(), REPOSITORY.getCellDataOnTestCase(serialNo, pageNumber, DEFAULT_SHEET_NAME));
			WebElementOperations.park(2);
			WebElementOperations.dropDownByTextVisibility(getDriver(), getWebElementFactory1().getFormat(), REPOSITORY.getCellDataOnTestCase(serialNo, format, DEFAULT_SHEET_NAME));
			WebElementOperations.park(2);
			WebElementOperations.click(getDriver(), getWebElementFactory1().getTest());
			WebElementOperations.park(2);
			
			WebElementOperations.click(getDriver(), getWebElementFactory1().getManageAPIS());
			WebElementOperations.park(2);
			WebElementOperations.switchToFrame(getDriver(), 0);
			WebElementOperations.park(2);
			WebElementOperations.dropDownByTextVisibility(getDriver(), getWebElementFactory1().getModule(), REPOSITORY.getCellDataOnTestCase(serialNo, module, DEFAULT_SHEET_NAME));
			WebElementOperations.park(2);
			WebElementOperations.dropDownByTextVisibility(getDriver(), getWebElementFactory1().getTable(), REPOSITORY.getCellDataOnTestCase(serialNo, tableType,DEFAULT_SHEET_NAME));
			WebElementOperations.park(2);
			WebElementOperations.click(getDriver(), getWebElementFactory1().getReviewsTransaction());
		 	WebElementOperations.park(2);
		 	WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getKeywords(), REPOSITORY.getCellDataOnTestCase(serialNo, keywords, DEFAULT_SHEET_NAME));
		 	WebElementOperations.park(2);	
			WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getAPIS(), REPOSITORY.getCellDataOnTestCase(serialNo, API, DEFAULT_SHEET_NAME));
			WebElementOperations.park(2);
			WebElementOperations.click(getDriver(), getWebElementFactory1().getSearch());
			WebElementOperations.park(2);
			WebElementOperations.click(getDriver(), getWebElementFactory1().getReset());
			WebElementOperations.park(2);
			WebElementOperations.click(getDriver(), getWebElementFactory1().getClose());
			WebElementOperations.park(2);
			WebElementOperations.switchToDefaultContentFrame(getDriver());
			WebElementOperations.park(5);
			HOMEPAGE_ACTIONS.logout(testCaseName);
		}
}
