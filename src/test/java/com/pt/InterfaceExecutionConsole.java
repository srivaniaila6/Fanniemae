package com.pt;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.techouts.fanniemae.consts.FanniemaeConstants;
import com.techouts.fanniemae.test.AbstractTest;
import com.techouts.fanniemae.util.Assert;
import com.techouts.fanniemae.webelement.ops.WebElementOperations;

public class InterfaceExecutionConsole extends AbstractTest{
private static final Logger LOG=Logger.getLogger(ImportManagement.class.getName());
	
	private String sheetname = FanniemaeConstants.SHEET_NAME;
	
	private int userName = FanniemaeConstants.C;
	private int password = FanniemaeConstants.D;
	private int landingPageTitle = FanniemaeConstants.N;
	private int keywords = FanniemaeConstants.E;
	private int status = FanniemaeConstants.L;
	private int interfaceType = FanniemaeConstants.AO;
	private int executionBetween = FanniemaeConstants.BF;
	private int executionBetweenTime = FanniemaeConstants.BG;
	private int executionBetweenAnd = FanniemaeConstants.BH;
	private int executionBetweenAndTime = FanniemaeConstants.BI;
	private int executionContext = FanniemaeConstants.BJ;
	
	
	@BeforeTest
	public void openFanniemae() {
			getFannieMaePage();
			}
		
		
		@Test
		public void transcodingPurchasingClassification() {
			String testCaseName="InterfaceExecutionConsole";
			String serialNo="7";
			Assert.assertTrue(WebElementOperations.verifyPageTitle(getDriver(), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME)));
			HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(serialNo, userName, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, password, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME));
			WebElementOperations.click(getDriver(),getWebElementFactory1().getIntegration());
			WebElementOperations.waitForPageLoad(getDriver(), 15);
			WebElementOperations.park(2);
			WebElementOperations.click(getDriver(), getWebElementFactory1().getInterfaceExecutionControl());
			WebElementOperations.park(2);
			WebElementOperations.waitForPageLoad(getDriver(), 15);
			WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getKeywords(), REPOSITORY.getCellDataOnTestCase(serialNo, keywords, DEFAULT_SHEET_NAME));
			WebElementOperations.park(2);
			WebElementOperations.dropDownByTextVisibility(getDriver(), getWebElementFactory1().getInterfaceType(), REPOSITORY.getCellDataOnTestCase(serialNo, interfaceType, DEFAULT_SHEET_NAME));
			WebElementOperations.park(2);
			WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getExecutionBetween(),REPOSITORY.getCellDataOnTestCase(serialNo, executionBetween, DEFAULT_SHEET_NAME) );
			WebElementOperations.park(2);
			WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getExecutionBetweenTime(), REPOSITORY.getCellDataOnTestCase(serialNo, executionBetweenTime, DEFAULT_SHEET_NAME));
			WebElementOperations.park(2);
		   WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getExecutionBetweenAnd(), REPOSITORY.getCellDataOnTestCase(serialNo, executionBetweenAnd, DEFAULT_SHEET_NAME));
		   WebElementOperations.park(2);
		   WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getExecutionBetweenAndTime(), REPOSITORY.getCellDataOnTestCase(serialNo, executionBetweenAndTime, DEFAULT_SHEET_NAME));
		   WebElementOperations.park(2);
		   WebElementOperations.dropDownByIndex(getDriver(), getWebElementFactory1().getStatusInInterfaceExeConsole(),1);
		   WebElementOperations.park(5);
		   WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getExecutionContextInInterfaceExeConsole(), REPOSITORY.getCellDataOnTestCase(serialNo, executionContext, DEFAULT_SHEET_NAME));
		   WebElementOperations.park(2);
		   
		   HOMEPAGE_ACTIONS.logout(testCaseName);
		}
}
