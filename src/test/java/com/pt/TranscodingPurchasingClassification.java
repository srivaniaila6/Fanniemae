package com.pt;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.techouts.fanniemae.consts.FanniemaeConstants;
import com.techouts.fanniemae.test.AbstractTest;
import com.techouts.fanniemae.util.Assert;
import com.techouts.fanniemae.webelement.ops.WebElementOperations;

public class TranscodingPurchasingClassification extends AbstractTest {
private static final Logger LOG=Logger.getLogger(ImportManagement.class.getName());
	
	private String sheetname = FanniemaeConstants.SHEET_NAME;
	
	private int userName = FanniemaeConstants.C;
	private int password = FanniemaeConstants.D;
	private int landingPageTitle = FanniemaeConstants.N;
	private int code=FanniemaeConstants.O;
	private int label=FanniemaeConstants.P;
	private int module=FanniemaeConstants.Q;
	private int table=FanniemaeConstants.AG;
	private int keywords = FanniemaeConstants.E;
	private int commoditiesTranscodification=FanniemaeConstants.AH;
	private int invokedFunction=FanniemaeConstants.AQ;
	private int order=FanniemaeConstants.V;
	private int loadMethods=FanniemaeConstants.AP;
	private int generateSql=FanniemaeConstants.AN;
	
	@BeforeTest
public void openFanniemae() {
		getFannieMaePage();
		}
	
	
	@Test
	public void transcodingPurchasingClassification() {
		String testCaseName="Transcoding purchasing classification";
		String serialNo="4";
		Assert.assertTrue(WebElementOperations.verifyPageTitle(getDriver(), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME)));
		HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(serialNo, userName, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, password, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME));
		WebElementOperations.click(getDriver(),getWebElementFactory1().getIntegration());
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(getDriver(), 15);
		WebElementOperations.click(getDriver(),getWebElementFactory1().getTransactionPurchasingClassification());
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(getDriver(), 15);
		WebElementOperations.dropDownByTextVisibility(getDriver(),getWebElementFactory1().getModule(),REPOSITORY.getCellDataOnTestCase(serialNo, module, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.dropDownByTextVisibility(getDriver(),getWebElementFactory1().getTable(),REPOSITORY.getCellDataOnTestCase(serialNo, table, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.click(getDriver(),getWebElementFactory1().getReviewsTransaction());
		WebElementOperations.park(2);
		WebElementOperations.sendKeys(getDriver(),getWebElementFactory1().getKeywordsInOrganisationalMapping(), REPOSITORY.getCellDataOnTestCase(serialNo, keywords, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.click(getDriver(),getWebElementFactory1().getSearch());
		WebElementOperations.park(2);
		WebElementOperations.click(getDriver(),getWebElementFactory1().getReset());
		WebElementOperations.park(2);
		WebElementOperations.dropDownByTextVisibility(getDriver(),getWebElementFactory1().getLoadMethods(),REPOSITORY.getCellDataOnTestCase(serialNo, loadMethods, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);

		WebElementOperations.click(getDriver(),getWebElementFactory1().getAddRowInOrganisationalMapping());
		WebElementOperations.park(2);
		WebElementOperations.switchToFrame(getDriver(), 0);
		WebElementOperations.sendKeys(getDriver(),getWebElementFactory1().getCodeInLoadMethods(), REPOSITORY.getCellDataOnTestCase(serialNo, code, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.sendKeys(getDriver(),getWebElementFactory1().getLabelInLoadMethods(), REPOSITORY.getCellDataOnTestCase(serialNo, label, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.sendKeys(getDriver(),getWebElementFactory1().getOrderInLoadMethods(), REPOSITORY.getCellDataOnTestCase(serialNo, order, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.sendKeys(getDriver(),getWebElementFactory1().getInvokedFunctionInLoadMethods(), REPOSITORY.getCellDataOnTestCase(serialNo, invokedFunction, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.click(getDriver(),getWebElementFactory1().getClose());
		WebElementOperations.switchToDefaultContentFrame(getDriver());
		WebElementOperations.click(getDriver(),getWebElementFactory1().getGenerateInOrganisationalTrascodifications());
		WebElementOperations.switchToFrame(getDriver(), 0);
		WebElementOperations.sendKeys(getDriver(),getWebElementFactory1().getGenerateSqlInOrganisationalTrascodifications(), REPOSITORY.getCellDataOnTestCase(serialNo,generateSql , DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.click(getDriver(),getWebElementFactory1().getClose());
		WebElementOperations.switchToDefaultContentFrame(getDriver());
		
		HOMEPAGE_ACTIONS.logout(testCaseName);
	}
}
