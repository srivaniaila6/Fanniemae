package com.pt;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.techouts.fanniemae.consts.FanniemaeConstants;
import com.techouts.fanniemae.test.AbstractTest;
import com.techouts.fanniemae.util.Assert;
import com.techouts.fanniemae.webelement.ops.WebElementOperations;

public class SupplierTranscoding extends AbstractTest {
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
	private int supplierTranscodification=FanniemaeConstants.AH;
	private int importType=FanniemaeConstants.F;
	private int system=FanniemaeConstants.J;
	private int siren=FanniemaeConstants.AS;
	private int duns=FanniemaeConstants.AT;
	private int importedID=FanniemaeConstants.AU;
	private int lineID=FanniemaeConstants.AV;
	private int supplierID=FanniemaeConstants.AW;
	private int status=FanniemaeConstants.L;
	private int generateSql=FanniemaeConstants.AN;
	
	@BeforeTest
	public void openFanniemae() {
			getFannieMaePage();
			}
		
		
		@Test
		public void transcodingPurchasingClassification() {
			String testCaseName="SupplierTranscoding";
			String serialNo="5";
			Assert.assertTrue(WebElementOperations.verifyPageTitle(getDriver(), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME)));
			HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(serialNo, userName, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, password, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME));
			WebElementOperations.click(getDriver(),getWebElementFactory1().getIntegration());
			WebElementOperations.park(2);
			WebElementOperations.waitForPageLoad(getDriver(), 15);
			WebElementOperations.click(getDriver(),getWebElementFactory1().getSupplierTrascoding());
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
			WebElementOperations.sendKeys(getDriver(),getWebElementFactory1().getSupplierTranscodification(),REPOSITORY.getCellDataOnTestCase(serialNo, supplierTranscodification, DEFAULT_SHEET_NAME));
			WebElementOperations.park(2);

			WebElementOperations.click(getDriver(),getWebElementFactory1().getAddRowInOrganisationalMapping());
			WebElementOperations.park(2);
			WebElementOperations.switchToFrame(getDriver(), 0);
			WebElementOperations.sendKeys(getDriver(),getWebElementFactory1().getImportTypeInSupplierTranscodification(), REPOSITORY.getCellDataOnTestCase(serialNo, importType, DEFAULT_SHEET_NAME));
			WebElementOperations.park(5);
//			WebElementOperations.dropDownByIndex(getDriver(), getWebElementFactory1().getSystemInSupplierTranscodification(), 1);
//			WebElementOperations.park(2);
			WebElementOperations.sendKeys(getDriver(),getWebElementFactory1().getCodeInSupplierTranscodification(), REPOSITORY.getCellDataOnTestCase(serialNo, code, DEFAULT_SHEET_NAME));
			WebElementOperations.park(2);
			WebElementOperations.sendKeys(getDriver(),getWebElementFactory1().getLabelInSupplierTranscodification(), REPOSITORY.getCellDataOnTestCase(serialNo, label, DEFAULT_SHEET_NAME));
			
			
			WebElementOperations.park(2);WebElementOperations.sendKeys(getDriver(),getWebElementFactory1().getsirenInSupplierTranscodification(), REPOSITORY.getCellDataOnTestCase(serialNo, siren, DEFAULT_SHEET_NAME));
			WebElementOperations.park(2);
			
			WebElementOperations.sendKeys(getDriver(),getWebElementFactory1().getDunsInSupplierTranscodification(), REPOSITORY.getCellDataOnTestCase(serialNo, duns, DEFAULT_SHEET_NAME));
//			WebElementOperations.sendKeys(getDriver(),getWebElementFactory1().getSupplierIDInSupplierTranscodification(), REPOSITORY.getCellDataOnTestCase(serialNo,supplierID , DEFAULT_SHEET_NAME));
//			WebElementOperations.enterByRobot();
			
			WebElementOperations.sendKeys(getDriver(),getWebElementFactory1().getStatusInSupplierTranscodification(), REPOSITORY.getCellDataOnTestCase(serialNo, status, DEFAULT_SHEET_NAME));
			WebElementOperations.park(2);WebElementOperations.sendKeys(getDriver(),getWebElementFactory1().getImportIDInSupplierTranscodification(), REPOSITORY.getCellDataOnTestCase(serialNo, importedID, DEFAULT_SHEET_NAME));
			WebElementOperations.park(2);
			WebElementOperations.sendKeys(getDriver(),getWebElementFactory1().getLineIDInSupplierTranscodification(), REPOSITORY.getCellDataOnTestCase(serialNo, lineID, DEFAULT_SHEET_NAME));
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
