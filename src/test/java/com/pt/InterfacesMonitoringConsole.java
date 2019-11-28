package com.pt;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.techouts.fanniemae.consts.FanniemaeConstants;
import com.techouts.fanniemae.page.elements.WebElementFactory1;
import com.techouts.fanniemae.test.AbstractTest;
import com.techouts.fanniemae.util.Assert;
import com.techouts.fanniemae.webelement.ops.WebElementOperations;

public class InterfacesMonitoringConsole extends AbstractTest{
private static final Logger LOG=Logger.getLogger(ImportManagement.class.getName());
	
	private String sheetname = FanniemaeConstants.SHEET_NAME;
	
	private int userName = FanniemaeConstants.C;
	private int password = FanniemaeConstants.D;
	private int landingPageTitle = FanniemaeConstants.N;
	private int module=FanniemaeConstants.Q;
	private int table=FanniemaeConstants.AG;
	private int keywords = FanniemaeConstants.E;
	private int interfaceType = FanniemaeConstants.AO;
	private int lastExecution = FanniemaeConstants.AX;
	private int lastExecutionAnd = FanniemaeConstants.AY;
	private int code = FanniemaeConstants.O;
	private int label = FanniemaeConstants.P;
	private int type = FanniemaeConstants.BE;
	private int status = FanniemaeConstants.L;
	private int executionFrequency = FanniemaeConstants.BA;
	private int executionPeriod = FanniemaeConstants.BB;
	private int nextExecution = FanniemaeConstants.BC;
	private int nextExecutionTime = FanniemaeConstants.BD;
	private int timeZone = FanniemaeConstants.AZ;
	
	@BeforeTest
	public void openFanniemae() {
			getFannieMaePage();
			}
		
		
		@Test
		public void transcodingPurchasingClassification() {
			String testCaseName="InterfacesMonitoringConsole";
			String serialNo="6";
			Assert.assertTrue(WebElementOperations.verifyPageTitle(getDriver(), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME)));
			HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(serialNo, userName, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, password, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME));
			WebElementOperations.click(getDriver(),getWebElementFactory1().getIntegration());
			WebElementOperations.park(2);
			WebElementOperations.click(getDriver(), getWebElementFactory1().getInterfacesMonitoringConsole());
			WebElementOperations.park(2);
			WebElementOperations.waitForPageLoad(getDriver(), 15);
			WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getKeywordsInOrganisationalMapping(), REPOSITORY.getCellDataOnTestCase(serialNo, keywords, DEFAULT_SHEET_NAME));
			WebElementOperations.dropDownByTextVisibility(getDriver(), getWebElementFactory1().getInterfaceTypeInInterfacesMonitoringConsole(), REPOSITORY.getCellDataOnTestCase(serialNo, interfaceType, DEFAULT_SHEET_NAME ));
			WebElementOperations.park(2);
			WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getLastExecution(), REPOSITORY.getCellDataOnTestCase(serialNo, lastExecution, DEFAULT_SHEET_NAME));
			WebElementOperations.park(2);
			WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getLastExecutionAnd(), REPOSITORY.getCellDataOnTestCase(serialNo, lastExecutionAnd, DEFAULT_SHEET_NAME));
			WebElementOperations.park(2);
			WebElementOperations.click(getDriver(), getWebElementFactory1().getSearch());
			WebElementOperations.park(2);
			WebElementOperations.acceptAlertIfPresent(getDriver(), 10);
			WebElementOperations.park(2);
			WebElementOperations.click(getDriver(), getWebElementFactory1().getReset());
			WebElementOperations.park(2);
			WebElementOperations.click(getDriver(), getWebElementFactory1().getCreate());
			WebElementOperations.park(2);
			WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getCodeInInterfacesMonitoringConsole(), REPOSITORY.getCellDataOnTestCase(serialNo, code, DEFAULT_SHEET_NAME));
			WebElementOperations.park(2);
			WebElementOperations.dropDownByTextVisibility(getDriver(), getWebElementFactory1().getModule(), REPOSITORY.getCellDataOnTestCase(serialNo, module, DEFAULT_SHEET_NAME));
			WebElementOperations.park(2);
			WebElementOperations.dropDownByTextVisibility(getDriver(), getWebElementFactory1().getTypeInInterfacesMonitoringConsole(), REPOSITORY.getCellDataOnTestCase(serialNo, type, DEFAULT_SHEET_NAME));
			WebElementOperations.park(2);
			WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getTimeZoneInInterfacesMonitoringConsole(), REPOSITORY.getCellDataOnTestCase(serialNo, timeZone, DEFAULT_SHEET_NAME));
			WebElementOperations.park(2);
			WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getLabelInInterfacesMonitoringConsole(), REPOSITORY.getCellDataOnTestCase(serialNo, label, DEFAULT_SHEET_NAME));
			WebElementOperations.dropDownByTextVisibility(getDriver(), getWebElementFactory1().getStatusInInterfacesMonitoringConsole(), REPOSITORY.getCellDataOnTestCase(serialNo, status, DEFAULT_SHEET_NAME));
			WebElementOperations.park(2);
			WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getExecutionFrequency(), REPOSITORY.getCellDataOnTestCase(serialNo, executionFrequency, DEFAULT_SHEET_NAME));
			WebElementOperations.park(2);
			WebElementOperations.dropDownByTextVisibility(getDriver(), getWebElementFactory1().getExecutionPeriod(), REPOSITORY.getCellDataOnTestCase(serialNo, executionPeriod, DEFAULT_SHEET_NAME));
			WebElementOperations.park(2);
			WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getNextExecution(), REPOSITORY.getCellDataOnTestCase(serialNo, nextExecution, DEFAULT_SHEET_NAME));
			WebElementOperations.park(2);
			WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getNextExecutionTime(),REPOSITORY.getCellDataOnTestCase(serialNo, nextExecutionTime, DEFAULT_SHEET_NAME));
			WebElementOperations.park(2);
			HOMEPAGE_ACTIONS.logout(testCaseName);
		}
}



