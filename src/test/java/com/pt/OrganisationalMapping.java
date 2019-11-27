package com.pt;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.techouts.fanniemae.consts.FanniemaeConstants;
import com.techouts.fanniemae.test.AbstractTest;
import com.techouts.fanniemae.util.Assert;
import com.techouts.fanniemae.webelement.ops.WebElementOperations;

public class OrganisationalMapping extends AbstractTest{
	
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
	private int organisationTranscodification=FanniemaeConstants.AH;
	private int importType=FanniemaeConstants.F;
	private int system=FanniemaeConstants.J;
	//private int table=FanniemaeConstants.AG;
	private int spendGroup=FanniemaeConstants.AI;
	private int costCenter=FanniemaeConstants.AJ;
	private int receivingLocation=FanniemaeConstants.AK;
	private int entityCode=FanniemaeConstants.AL;
	private int organisation=FanniemaeConstants.AM;
	private int generateSql=FanniemaeConstants.AN;
	//private int organisationTransaction=FanniemaeConstants.AH;
	
	@Test
	public void organisationalMapping() {
		String testCaseName="organisationalMapping";
		String serialNo="3";
		getFannieMaePage();
		
		Assert.assertTrue(WebElementOperations.verifyPageTitle(getDriver(), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME)));
		HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(serialNo, userName, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, password, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME));
		WebElementOperations.click(getDriver(),getWebElementFactory1().getIntegration());
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(getDriver(), 15);
		WebElementOperations.click(getDriver(),getWebElementFactory1().getOrganisationalMapping());
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
		WebElementOperations.click(getDriver(),getWebElementFactory1().getSearchInOrganisationalMapping());
		WebElementOperations.park(2);
		WebElementOperations.click(getDriver(),getWebElementFactory1().getReset());
		WebElementOperations.park(2);
		WebElementOperations.sendKeys(getDriver(),getWebElementFactory1().getOrganisationalTrascodifications(), REPOSITORY.getCellDataOnTestCase(serialNo, organisationTranscodification, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.click(getDriver(),getWebElementFactory1().getAddRowInOrganisationalMapping());
		WebElementOperations.park(2);
		WebElementOperations.switchToFrame(getDriver(), 0);
		WebElementOperations.sendKeys(getDriver(),getWebElementFactory1().getImportTypeInOrganisationalTrascodifications(), REPOSITORY.getCellDataOnTestCase(serialNo, importType, DEFAULT_SHEET_NAME));
		WebElementOperations.enterByRobot();
		WebElementOperations.dropDownByTextVisibility(getDriver(),getWebElementFactory1().getSpendGroupInOrganisationalTrascodifications(),REPOSITORY.getCellDataOnTestCase(serialNo, spendGroup, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.sendKeys(getDriver(),getWebElementFactory1().getCostCenterInOrganisationalTrascodifications(), REPOSITORY.getCellDataOnTestCase(serialNo, costCenter, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.sendKeys(getDriver(),getWebElementFactory1().getReceivingLocationInOrganisationalTrascodifications(), REPOSITORY.getCellDataOnTestCase(serialNo,receivingLocation , DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.sendKeys(getDriver(),getWebElementFactory1().getEntityCodeInOrganisationalTrascodifications(), REPOSITORY.getCellDataOnTestCase(serialNo, entityCode, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getOrganisationInOrganisationalTrascodifications(), REPOSITORY.getCellDataOnTestCase(serialNo, organisation, DEFAULT_SHEET_NAME) );
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
