package com.pt;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.techouts.fanniemae.consts.FanniemaeConstants;
import com.techouts.fanniemae.test.AbstractTest;
import com.techouts.fanniemae.util.Assert;
import com.techouts.fanniemae.webelement.ops.WebElementOperations;

public class CubeManage extends AbstractTest {
	private static final Logger LOG=Logger.getLogger(ImportManagement.class.getName());
	
	private int userName = FanniemaeConstants.C;
		private int password = FanniemaeConstants.D;
		private int landingPageTitle = FanniemaeConstants.N;
		private int keywords = FanniemaeConstants.E;
		private int status = FanniemaeConstants.L;
		private int keywordsDropDown = FanniemaeConstants.CA;
		private int dimension = FanniemaeConstants.CB;
		private int module = FanniemaeConstants.Q;
		private int table = FanniemaeConstants.AG;
		private int organisationTranscodification = FanniemaeConstants.AH;
		private int system=FanniemaeConstants.J;
		private int spendGroup=FanniemaeConstants.AI;
		private int costCenter=FanniemaeConstants.AJ;
		private int receivingLocation=FanniemaeConstants.AK;
		private int entityCode=FanniemaeConstants.AL;
		private int organisation=FanniemaeConstants.AM;
		private int generateSql=FanniemaeConstants.AN;
		private int importType=FanniemaeConstants.F;
		@BeforeTest
		public void openFanniemae() {
				getFannieMaePage();
				}
		
			@Test
			public void transcodingPurchasingClassification() {				
				String testCaseName="CubeManage";
				String serialNo="13";
				Assert.assertTrue(WebElementOperations.verifyPageTitle(getDriver(), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME)));
				HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(serialNo, userName, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, password, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME));
				WebElementOperations.click(getDriver(),getWebElementFactory1().getIntegration());
				WebElementOperations.waitForPageLoad(getDriver(), 15);
				WebElementOperations.park(2);
				WebElementOperations.click(getDriver(), getWebElementFactory1().getCubeManage());
                WebElementOperations.park(2);
                WebElementOperations.waitForPageLoad(getDriver(), 15);
                WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getKeywordsInCubeManage(), REPOSITORY.getCellDataOnTestCase(serialNo, keywords, DEFAULT_SHEET_NAME));
                WebElementOperations.park(2);
                WebElementOperations.dropDownByTextVisibility(getDriver(), getWebElementFactory1().getKeywordDropDownInCubeManage(), REPOSITORY.getCellDataOnTestCase(serialNo, keywordsDropDown, DEFAULT_SHEET_NAME));
                WebElementOperations.park(2);
                WebElementOperations.click(getDriver(), getWebElementFactory1().getResetInCubeManage());
                WebElementOperations.park(2);
                WebElementOperations.click(getDriver(), getWebElementFactory1().getSearchInCubeManage());
                WebElementOperations.park(2);
                HOMEPAGE_ACTIONS.logout(testCaseName);
              }
			
			@Test
			public void ssasSession() {
				String testCaseName="SsasSession";
				String serialNo="14";
				Assert.assertTrue(WebElementOperations.verifyPageTitle(getDriver(), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME)));
				HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(serialNo, userName, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, password, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME));
				WebElementOperations.click(getDriver(),getWebElementFactory1().getIntegration());
				WebElementOperations.park(2);
				WebElementOperations.waitForPageLoad(getDriver(), 15);
			    WebElementOperations.click(getDriver(), getWebElementFactory1().getSsasSession());
				WebElementOperations.park(2);
				WebElementOperations.waitForPageLoad(getDriver(), 15);
				WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getKeywords(), REPOSITORY.getCellDataOnTestCase(serialNo, keywords, DEFAULT_SHEET_NAME));
				WebElementOperations.park(2);
				WebElementOperations.dropDownByTextVisibility(getDriver(), getWebElementFactory1().getStatusSsAs(), REPOSITORY.getCellDataOnTestCase(serialNo, status, DEFAULT_SHEET_NAME));
				WebElementOperations.park(2);
				HOMEPAGE_ACTIONS.logout(testCaseName);
			}
			@Test
           public void generateDimensions() {
					String testCaseName="GenerateDimensions";
					String serialNo="15";
					Assert.assertTrue(WebElementOperations.verifyPageTitle(getDriver(), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME)));
					HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(serialNo, userName, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, password, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME));
					WebElementOperations.click(getDriver(),getWebElementFactory1().getIntegration());
					WebElementOperations.park(2);
					WebElementOperations.waitForPageLoad(getDriver(), 15);
					WebElementOperations.click(getDriver(), getWebElementFactory1().getGenerateDimensions());
					WebElementOperations.park(2);
					WebElementOperations.waitForPageLoad(getDriver(), 15);
					WebElementOperations.dropDownByTextVisibility(getDriver(), getWebElementFactory1().getDimension(), REPOSITORY.getCellDataOnTestCase(serialNo, dimension, DEFAULT_SHEET_NAME));
					WebElementOperations.park(2);
				    HOMEPAGE_ACTIONS.logout(testCaseName);
				}
			
			@Test
	           public void dataSource() {
						String testCaseName="DataSource";
						String serialNo="16";
						Assert.assertTrue(WebElementOperations.verifyPageTitle(getDriver(), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME)));
						HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(serialNo, userName, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, password, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME));
						WebElementOperations.click(getDriver(),getWebElementFactory1().getIntegration());
						WebElementOperations.park(2);
						WebElementOperations.waitForPageLoad(getDriver(), 15);
						WebElementOperations.click(getDriver(), getWebElementFactory1().getDataSources());
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
		

		@Test
		public void measureGroups() {
			String testCaseName="MeasureGroups";
			String serialNo="17";
			
			Assert.assertTrue(WebElementOperations.verifyPageTitle(getDriver(), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME)));
			HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(serialNo, userName, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, password, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME));
			WebElementOperations.click(getDriver(),getWebElementFactory1().getIntegration());
			WebElementOperations.park(2);
			WebElementOperations.waitForPageLoad(getDriver(), 15);
			WebElementOperations.click(getDriver(), getWebElementFactory1().getMeasureGroups());
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
		@Test
		public void measures() {
			String testCaseName="Measures";
			String serialNo="18";
			
			Assert.assertTrue(WebElementOperations.verifyPageTitle(getDriver(), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME)));
			HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(serialNo, userName, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, password, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME));
			WebElementOperations.click(getDriver(),getWebElementFactory1().getIntegration());
			WebElementOperations.park(2);
			WebElementOperations.waitForPageLoad(getDriver(), 15);
			WebElementOperations.click(getDriver(), getWebElementFactory1().getMeasures());
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
