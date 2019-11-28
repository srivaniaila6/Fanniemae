package com.pt;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.techouts.fanniemae.consts.FanniemaeConstants;
import com.techouts.fanniemae.test.AbstractTest;
import com.techouts.fanniemae.util.Assert;
import com.techouts.fanniemae.webelement.ops.WebElementOperations;

public class Projects extends AbstractTest {
	private static final Logger LOG=Logger.getLogger(Projects.class.getName());
	 
	private int userName=FanniemaeConstants.C;
	private int passWord=FanniemaeConstants.D;
	private int keywords=FanniemaeConstants.E;
	private int landingPageTitle=FanniemaeConstants.F;
	private int user=FanniemaeConstants.G;
	private int type=FanniemaeConstants.H;
	private int duplicate=FanniemaeConstants.I;
	private int projectName=FanniemaeConstants.J;
	private int primaryCategoty=FanniemaeConstants.K;
	private int costCenter=FanniemaeConstants.L;
	private int projectStatus=FanniemaeConstants.M;
	private int projectValue=FanniemaeConstants.N;
	private int projectSaving=FanniemaeConstants.O;
	private int projectCompletionDate=FanniemaeConstants.P;
	private int productDescription=FanniemaeConstants.Q;
	private int RfxTypesCode=FanniemaeConstants.R;
	private int RfxENLabel=FanniemaeConstants.S;
	private int Order=FanniemaeConstants.T;
	private int Organisation=FanniemaeConstants.U;
	private int Commodity=FanniemaeConstants.V;
	private int Status=FanniemaeConstants.W;
	private int Owner=FanniemaeConstants.X;
	private int Project=FanniemaeConstants.Y;
	private int NameOfAuction=FanniemaeConstants.Z;
	private int AuctionShortDescription=FanniemaeConstants.AA;
	private int MainCurrency=FanniemaeConstants.AB;
	private int Evaluator=FanniemaeConstants.AC;
	private int EvaluatorPeriod=FanniemaeConstants.AD;
	private int Proposal=FanniemaeConstants.AE;
	private int process=FanniemaeConstants.AF;
	
	
	@BeforeTest
	public void openFanniemae() {
			getFannieMaePage();
			}
	
//		@Test
//		public void transcodingPurchasingClassification() {
//			String testCaseName="BrowseProjects";
//			String serialNo="1";
//		Assert.assertTrue(WebElementOperations.verifyPageTitle(getDriver(), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME)));
//		HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(serialNo, userName, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, passWord, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME));
//		WebElementOperations.click(getDriver(), getWebElementFactory1().getProjects());
//		WebElementOperations.park(2);
//		WebElementOperations.waitForPageLoad(getDriver(), 15);
//		WebElementOperations.click(getDriver(), getWebElementFactory1().getBrowseProjects());
//		WebElementOperations.park(2);
//		WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getKeywords(), REPOSITORY.getCellDataOnTestCase(serialNo, keywords, DEFAULT_SHEET_NAME));
//		WebElementOperations.enterByRobot();
//		WebElementOperations.park(2);
//		WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getTypeProjects(), REPOSITORY.getCellDataOnTestCase(serialNo, type, DEFAULT_SHEET_NAME));
//		WebElementOperations.park(2);
//		WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getUserProjects(), REPOSITORY.getCellDataOnTestCase(serialNo, user, DEFAULT_SHEET_NAME));
//		WebElementOperations.enterByRobot();
//		WebElementOperations.park(2);
//		WebElementOperations.click(getDriver(), getWebElementFactory1().getSearch());
//		WebElementOperations.park(2);
//		WebElementOperations.click(getDriver(), getWebElementFactory1().getReset());
//		WebElementOperations.park(2);
//		WebElementOperations.click(getDriver(), getWebElementFactory1().getDuplicateProjects());
//		WebElementOperations.park(2);
//		WebElementOperations.switchToFrame(getDriver(), 0);
//		WebElementOperations.park(2);
//		WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getProcessToDuplicate(), REPOSITORY.getCellDataOnTestCase(serialNo, process, DEFAULT_SHEET_NAME));
//		WebElementOperations.park(2);
//		WebElementOperations.click(getDriver(), getWebElementFactory1().getCloseInProjects());
//		WebElementOperations.park(2);
//		WebElementOperations.switchToDefaultContentFrame(getDriver());
//		HOMEPAGE_ACTIONS.logout(testCaseName);
//		}
//		@Test
//		public void createProject() {
//			String testCaseName="BrowseProjects";
//			String serialNo="1";
//		Assert.assertTrue(WebElementOperations.verifyPageTitle(getDriver(), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME)));
//		HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(serialNo, userName, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, passWord, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME));
//		WebElementOperations.click(getDriver(), getWebElementFactory1().getProjects());
//		WebElementOperations.park(2);
//		WebElementOperations.waitForPageLoad(getDriver(), 15);
//		WebElementOperations.click(getDriver(), getWebElementFactory1().getBrowseProjects());
//		WebElementOperations.park(2);
//		WebElementOperations.click(getDriver(), getWebElementFactory1().getCreateProject());
//		WebElementOperations.park(2);
//		WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getProjectName(), REPOSITORY.getCellDataOnTestCase(serialNo, projectName, DEFAULT_SHEET_NAME));
//		WebElementOperations.park(2);
//		WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getTypeInCreateProject(), REPOSITORY.getCellDataOnTestCase(serialNo, type, DEFAULT_SHEET_NAME));
//		WebElementOperations.park(2);
//		WebElementOperations.enterByRobot();
//		WebElementOperations.park(2);
//		WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getPrimaryCategory(), REPOSITORY.getCellDataOnTestCase(serialNo, primaryCategoty, DEFAULT_SHEET_NAME));
//		WebElementOperations.park(2);
//		WebElementOperations.enterByRobot();
//		WebElementOperations.park(2);
//		WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getCostCenter(), REPOSITORY.getCellDataOnTestCase(serialNo, costCenter, DEFAULT_SHEET_NAME));
//		WebElementOperations.park(2);
//		WebElementOperations.enterByRobot();
//		WebElementOperations.park(2);
//		WebElementOperations.dropDownByIndex(getDriver(), getWebElementFactory1().getProjectStatus(), 1);
//		WebElementOperations.park(2);
//		WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getProjectValue(), REPOSITORY.getCellDataOnTestCase(serialNo, projectValue, DEFAULT_SHEET_NAME));
//		WebElementOperations.park(2);
//		WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getProjectSaving(), REPOSITORY.getCellDataOnTestCase(serialNo, projectSaving, DEFAULT_SHEET_NAME));
//		WebElementOperations.park(2);
//		WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getProjectCompletionDate(), REPOSITORY.getCellDataOnTestCase(serialNo, projectCompletionDate, DEFAULT_SHEET_NAME));
//		WebElementOperations.park(2);
//		WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getProductDescription(), REPOSITORY.getCellDataOnTestCase(serialNo, productDescription, DEFAULT_SHEET_NAME));
//		WebElementOperations.park(2);
//		HOMEPAGE_ACTIONS.logout(testCaseName);
//			
//		}
		@Test
		public void rfxTemplate() {
			String testCaseName="TemplatesAdministration";
			String serialNo="2";
		Assert.assertTrue(WebElementOperations.verifyPageTitle(getDriver(), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME)));
		HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(serialNo, userName, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, passWord, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME));
		WebElementOperations.click(getDriver(), getWebElementFactory1().getProjects());
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(getDriver(), 15);
		WebElementOperations.click(getDriver(), getWebElementFactory1().getRfxTemplatesAdministration());
		WebElementOperations.park(2);
		WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getKeywords(), REPOSITORY.getCellDataOnTestCase(serialNo, keywords, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.click(getDriver(), getWebElementFactory1().getSearch());
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(getDriver(), 15);
		WebElementOperations.click(getDriver(), getWebElementFactory1().getReset());
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(getDriver(), 15);
		WebElementOperations.click(getDriver(), getWebElementFactory1().getCreateNewRfxType());
		WebElementOperations.park(2);
	    WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getRfxCode(),REPOSITORY.getCellDataOnTestCase(serialNo, RfxTypesCode, DEFAULT_SHEET_NAME));
	    WebElementOperations.park(2);
	    WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getRfxENTable(), REPOSITORY.getCellDataOnTestCase(serialNo, RfxENLabel, DEFAULT_SHEET_NAME));
	    WebElementOperations.park(2);
	    WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getOrder(),REPOSITORY.getCellDataOnTestCase(serialNo, Order, DEFAULT_SHEET_NAME));
	    WebElementOperations.park(2);
		HOMEPAGE_ACTIONS.logout(testCaseName);
		}	
		
//		@Test
//		public void browseActions() {
//			String testCaseName="BrowseActions";
//			String serialNo="3";
//		Assert.assertTrue(WebElementOperations.verifyPageTitle(getDriver(), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME)));
//		HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(serialNo, userName, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, passWord, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME));
//		WebElementOperations.click(getDriver(), getWebElementFactory1().getProjects());		WebElementOperations.park(2);
//		WebElementOperations.waitForPageLoad(getDriver(), 15);
//		WebElementOperations.click(getDriver(), getWebElementFactory1().getBrowseAuction());
//		WebElementOperations.park(2);
//		WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getKeywords(), REPOSITORY.getCellDataOnTestCase(serialNo, keywords, DEFAULT_SHEET_NAME));
//		WebElementOperations.park(2);
//		WebElementOperations.dropDownByIndex(getDriver(), getWebElementFactory1().getstatus1(), 1);
//		WebElementOperations.park(2);
//		WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getOrganisationBrowseAuction(), REPOSITORY.getCellDataOnTestCase(serialNo, Organisation, DEFAULT_SHEET_NAME));
//		WebElementOperations.park(2);
//		WebElementOperations.enterByRobot();
//		WebElementOperations.park(2);
//		WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getCommodityInAuctionMessages(), REPOSITORY.getCellDataOnTestCase(serialNo, Commodity, DEFAULT_SHEET_NAME));
//		WebElementOperations.park(2);
//		WebElementOperations.enterByRobot();
//		WebElementOperations.park(2);
//     	WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getOwnerBrowseAuction(), REPOSITORY.getCellDataOnTestCase(serialNo, Owner, DEFAULT_SHEET_NAME));
//		WebElementOperations.park(2);
//		WebElementOperations.enterByRobot();
//		WebElementOperations.park(2);
//    	WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getSourcingProject(), REPOSITORY.getCellDataOnTestCase(serialNo, Project, DEFAULT_SHEET_NAME));
//    	WebElementOperations.park(2);
//		WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getProject1(), REPOSITORY.getCellDataOnTestCase(serialNo, Project, DEFAULT_SHEET_NAME));
//		WebElementOperations.park(2);
//		WebElementOperations.click(getDriver(), getWebElementFactory1().getSearch());
//		WebElementOperations.park(2);
//		WebElementOperations.click(getDriver(), getWebElementFactory1().getReset());
//		WebElementOperations.park(2);
//		WebElementOperations.click(getDriver(), getWebElementFactory1().getDuplicateAnAction());
//	
//		WebElementOperations.click(getDriver(), getWebElementFactory1().getCreateAction());		
//		WebElementOperations.park(2);
//		WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getAuctionShortDescription(), REPOSITORY.getCellDataOnTestCase(serialNo, AuctionShortDescription, DEFAULT_SHEET_NAME));
//		WebElementOperations.park(2);
//		WebElementOperations.dropDownByTextVisibility(getDriver(), getWebElementFactory1().getMainCurrency(), REPOSITORY.getCellDataOnTestCase(serialNo, MainCurrency, DEFAULT_SHEET_NAME));
//		WebElementOperations.park(2);
//		WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getOrganisationBrowseAuction(), REPOSITORY.getCellDataOnTestCase(serialNo, Organisation, DEFAULT_SHEET_NAME));
//		WebElementOperations.park(2);
//		WebElementOperations.enterByRobot();
//		WebElementOperations.park(2);
//		WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getCommodityInAuctionMessages(), REPOSITORY.getCellDataOnTestCase(serialNo, Commodity, DEFAULT_SHEET_NAME));
//		WebElementOperations.park(2);
//	
//		WebElementOperations.park(2);
//		HOMEPAGE_ACTIONS.logout(testCaseName);		
//		
//		
//		}
//		@Test(priority=1)
//		public void proposalEvaluation() {
//			String testCaseName="ProposalEvaluation";
//			String serialNo="4";
//		Assert.assertTrue(WebElementOperations.verifyPageTitle(getDriver(), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME)));
//		HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(serialNo, userName, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, passWord, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME));
//		WebElementOperations.click(getDriver(), getWebElementFactory1().getProjects());
//		WebElementOperations.park(2);
//		WebElementOperations.waitForPageLoad(getDriver(), 15);
//		WebElementOperations.click(getDriver(), getWebElementFactory1().getProposalEvaluation());
//		WebElementOperations.park(2);
//		WebElementOperations.dropDownByIndex(getDriver(), getWebElementFactory1().getStatusInAuctionMessages(), 2);
//		WebElementOperations.park(2);
//		WebElementOperations.sendKeys(getDriver(),getWebElementFactory1().getEvaluator(),REPOSITORY.getCellDataOnTestCase(serialNo, Evaluator, DEFAULT_SHEET_NAME));
//		WebElementOperations.park(2);
//		WebElementOperations.enterByRobot();
//		WebElementOperations.park(2);
//		WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getBusinessProject(),REPOSITORY.getCellDataOnTestCase(serialNo, Project, DEFAULT_SHEET_NAME));
//	    WebElementOperations.park(2);
//	    WebElementOperations.enterByRobot();
//		WebElementOperations.park(2);
//		WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getProposal(), REPOSITORY.getCellDataOnTestCase(serialNo, Proposal, DEFAULT_SHEET_NAME));
//		WebElementOperations.park(2);
//		WebElementOperations.enterByRobot();
//		WebElementOperations.park(2);
//		WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getEvaluatedPeriod(), REPOSITORY.getCellDataOnTestCase(serialNo, EvaluatorPeriod, DEFAULT_SHEET_NAME));
//		WebElementOperations.park(2);
//		WebElementOperations.enterByRobot();
//		WebElementOperations.park(2);
//		WebElementOperations.click(getDriver(), getWebElementFactory1().getSearch());
//		WebElementOperations.park(2);
//		WebElementOperations.click(getDriver(), getWebElementFactory1().getReset());
//		WebElementOperations.park(2);
//		HOMEPAGE_ACTIONS.logout(testCaseName);
//		
//		
//		
		
		
		//}	
}
