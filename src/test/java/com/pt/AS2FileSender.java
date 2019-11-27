package com.pt;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.techouts.fanniemae.consts.FanniemaeConstants;
import com.techouts.fanniemae.test.AbstractTest;
import com.techouts.fanniemae.util.Assert;
import com.techouts.fanniemae.webelement.ops.WebElementOperations;

public class AS2FileSender extends AbstractTest {
	
private static final Logger LOG=Logger.getLogger(ImportManagement.class.getName());
	
	
	private int userName = FanniemaeConstants.C;
	private int password = FanniemaeConstants.D;
	private int landingPageTitle = FanniemaeConstants.N;
	private int keywords = FanniemaeConstants.E;
	private int as2From = FanniemaeConstants.BR;
	private int as2To = FanniemaeConstants.BS;
	private int url = FanniemaeConstants.BT;
	private int timeOut = FanniemaeConstants.BU;
	private int signCertificate = FanniemaeConstants.BV;
	private int signCertificatePassword = FanniemaeConstants.BW;
	
	@BeforeTest
	public void openFanniemae() {
			getFannieMaePage();
			}
		@Test
		public void transcodingPurchasingClassification() {
			String testCaseName="AS2FileSender";
			String serialNo="9";
			Assert.assertTrue(WebElementOperations.verifyPageTitle(getDriver(), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME)));
			HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(serialNo, userName, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, password, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME));
			WebElementOperations.click(getDriver(),getWebElementFactory1().getIntegration());
			WebElementOperations.waitForPageLoad(getDriver(), 15);
			WebElementOperations.park(2);
			WebElementOperations.click(getDriver(), getWebElementFactory1().getAS2FileSender());
			WebElementOperations.waitForPageLoad(getDriver(), 15);
			WebElementOperations.park(2);
			WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getAS2From(), REPOSITORY.getCellDataOnTestCase(serialNo, as2From, DEFAULT_SHEET_NAME));
			WebElementOperations.park(2);
			WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getAS2To(), REPOSITORY.getCellDataOnTestCase(serialNo, as2To, DEFAULT_SHEET_NAME));
			WebElementOperations.park(2);
			WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getUrl(), REPOSITORY.getCellDataOnTestCase(serialNo, url, DEFAULT_SHEET_NAME));
			WebElementOperations.park(2);
			WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getTimeOut(), REPOSITORY.getCellDataOnTestCase(serialNo, timeOut, DEFAULT_SHEET_NAME));
			WebElementOperations.park(2);
			WebElementOperations.dropDownByTextVisibility(getDriver(), getWebElementFactory1().getSignCertificate(), REPOSITORY.getCellDataOnTestCase(serialNo, signCertificate, DEFAULT_SHEET_NAME));
			WebElementOperations.park(2);
			WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getSignCertificatePassword(), REPOSITORY.getCellDataOnTestCase(serialNo, signCertificatePassword , DEFAULT_SHEET_NAME));
			WebElementOperations.park(5);
			HOMEPAGE_ACTIONS.logout(testCaseName);
			
		}
}