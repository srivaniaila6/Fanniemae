package com.pt;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.techouts.fanniemae.consts.FanniemaeConstants;
import com.techouts.fanniemae.page.elements.WebElementFactory1;
import com.techouts.fanniemae.test.AbstractTest;
import com.techouts.fanniemae.util.Assert;
import com.techouts.fanniemae.webelement.ops.WebElementOperations;

public class TokenList extends AbstractTest {
	

private static final Logger LOG=Logger.getLogger(ImportManagement.class.getName());
	
private int userName = FanniemaeConstants.C;
	private int password = FanniemaeConstants.D;
	private int landingPageTitle = FanniemaeConstants.N;
	private int keywords = FanniemaeConstants.E;
	private int interfaceType = FanniemaeConstants.AO;
	private int label=FanniemaeConstants.P;
	private int token=FanniemaeConstants.BX;
	private int status = FanniemaeConstants.L;
	private int module=FanniemaeConstants.Q;
	private int table=FanniemaeConstants.AG;
	private int importType=FanniemaeConstants.F;
	private int system=FanniemaeConstants.J;
	private int from=FanniemaeConstants.BY;
	private int to=FanniemaeConstants.BZ;

	@BeforeTest
	public void openFanniemae() {
			getFannieMaePage();
			}
	
		@Test
		public void transcodingPurchasingClassification() {
			String testCaseName="TokenList";
			String serialNo="10";
			Assert.assertTrue(WebElementOperations.verifyPageTitle(getDriver(), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME)));
			HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(serialNo, userName, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, password, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME));
			WebElementOperations.click(getDriver(),getWebElementFactory1().getIntegration());
			WebElementOperations.waitForPageLoad(getDriver(), 15);
			WebElementOperations.park(2);
			WebElementOperations.click(getDriver(), getWebElementFactory1().getTokenList());
			WebElementOperations.waitForPageLoad(getDriver(), 15);
			WebElementOperations.park(2);
			WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getKeywords(), REPOSITORY.getCellDataOnTestCase(serialNo, keywords, DEFAULT_SHEET_NAME));
			WebElementOperations.park(2);
			WebElementOperations.click(getDriver(), getWebElementFactory1().getNewToken());
			WebElementOperations.park(2);
			WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getLabel(), REPOSITORY.getCellDataOnTestCase(serialNo, label, DEFAULT_SHEET_NAME));
			WebElementOperations.park(2);
			WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getToken(),REPOSITORY.getCellDataOnTestCase(serialNo, token, DEFAULT_SHEET_NAME));
			WebElementOperations.park(2);
			WebElementOperations.dropDownByIndex(getDriver(), getWebElementFactory1().getInterfaceType(), 1);
			WebElementOperations.park(2);
			HOMEPAGE_ACTIONS.logout(testCaseName);
          }
		@Test
		public void callBacks() {
			String testCaseName="Callbacks";
			String serialNo="11";
			Assert.assertTrue(WebElementOperations.verifyPageTitle(getDriver(), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME)));
			HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(serialNo, userName, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, password, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME));
			WebElementOperations.click(getDriver(),getWebElementFactory1().getIntegration());
			WebElementOperations.waitForPageLoad(getDriver(), 15);
			WebElementOperations.park(2);
			WebElementOperations.click(getDriver(), getWebElementFactory1().getCallBacks());
			WebElementOperations.park(2);
			WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getKeywords(), REPOSITORY.getCellDataOnTestCase(serialNo, keywords, DEFAULT_SHEET_NAME));
			WebElementOperations.park(2);
			WebElementOperations.dropDownByTextVisibility(getDriver(), getWebElementFactory1().getModule(), REPOSITORY.getCellDataOnTestCase(serialNo, module, DEFAULT_SHEET_NAME));
			WebElementOperations.park(2);
			WebElementOperations.dropDownByTextVisibility(getDriver(), getWebElementFactory1().getTableType(), REPOSITORY.getCellDataOnTestCase(serialNo, table, DEFAULT_SHEET_NAME));
			WebElementOperations.park(2);
			WebElementOperations.click(getDriver(), getWebElementFactory1().getSearch());
			WebElementOperations.park(2);
			WebElementOperations.click(getDriver(), getWebElementFactory1().getReset());
			
			HOMEPAGE_ACTIONS.logout(testCaseName);
			
		}
		@Test
		public void retroActiveUpdates() {
			String testCaseName="RetroactiveUpdates";
			String serialNo="12";
			Assert.assertTrue(WebElementOperations.verifyPageTitle(getDriver(), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME)));
			HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(serialNo, userName, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, password, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME));
			WebElementOperations.click(getDriver(),getWebElementFactory1().getIntegration());
			WebElementOperations.waitForPageLoad(getDriver(), 15);
			WebElementOperations.park(2);
			WebElementOperations.click(getDriver(), getWebElementFactory1().getRetrospectiveUpdates());
			WebElementOperations.park(2);
			WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getKeywords(), REPOSITORY.getCellDataOnTestCase(serialNo, keywords, DEFAULT_SHEET_NAME));
			WebElementOperations.park(2);
			WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getImportTypeRetrospectiveUpdates(), REPOSITORY.getCellDataOnTestCase(serialNo, importType, DEFAULT_SHEET_NAME));
			WebElementOperations.park(2);
			
			//WebElementOperations.dropDownByIndex(getDriver(), getWebElementFactory1().getSystemRetrospectiveUpdates(), 3);
			//WebElementOperations.park(2);
			WebElementOperations.dropDownByIndex(getDriver(), getWebElementFactory1().getStatusInAuctionMessages(),2);
			WebElementOperations.park(2);
			WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getFromRetrospectiveUpdates(), REPOSITORY.getCellDataOnTestCase(serialNo, from, DEFAULT_SHEET_NAME));
			WebElementOperations.park(2);
			WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getToRetrospectiveUpdates(),REPOSITORY.getCellDataOnTestCase(serialNo, to, DEFAULT_SHEET_NAME));
			WebElementOperations.park(2);
			WebElementOperations.click(getDriver(), getWebElementFactory1().getCreateANewUpdateRetrospectiveUpdates());
			
			WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getImportTypeRetrospectiveUpdates(), REPOSITORY.getCellDataOnTestCase(serialNo, importType, DEFAULT_SHEET_NAME));
			WebElementOperations.enterByRobot();
//			WebElementOperations.click(getDriver(), getWebElementFactory1().getAllImportTypeRetrospectiveUpdates());
//			WebElementOperations.park(2);
//			WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getImportRetrospectiveUpdates(), REPOSITORY.getCellDataOnTestCase(serialNo, importType, DEFAULT_SHEET_NAME));
//			WebElementOperations.park(2);
			HOMEPAGE_ACTIONS.logout(testCaseName);
		}
		}  
