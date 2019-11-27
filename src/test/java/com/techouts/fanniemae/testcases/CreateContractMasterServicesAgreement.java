package com.techouts.fanniemae.testcases;

import static com.techouts.fanniemae.webelement.ops.WebElementOperations.captureScreenShotOnPass;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.click;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.executeJS;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.park;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.verifyPageTitle;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.waitForPageLoad;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.webElementHighlighter;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import com.techouts.fanniemae.consts.FanniemaeConstants;
import com.techouts.fanniemae.test.AbstractTest;
import com.techouts.fanniemae.util.Assert;
import com.techouts.fanniemae.webelement.ops.WebElementOperations;

public class CreateContractMasterServicesAgreement extends AbstractTest {
	private static final Logger LOG = Logger.getLogger(CreateContractMasterServicesAgreement.class.getName());
	
	private int userName = FanniemaeConstants.G;
	private int password = FanniemaeConstants.H;
	private int landingPageTitle = FanniemaeConstants.K;
	private int homePageTitle = FanniemaeConstants.L;
	
	
	@Test(priority = 5)
	public void createContractMasterServicesAgreement() {
		String testCaseNumber = "5";
		String testCaseName = "createContractMasterServicesAgreement";
		try {
			getFannieMaePage();
			Assert.assertTrue(verifyPageTitle(getDriver(), REPOSITORY.getCellDataOnTestCase(testCaseNumber, landingPageTitle, DEFAULT_SHEET_NAME)));
			captureScreenShotOnPass(getDriver(), testCaseNumber);
			Assert.assertTrue(HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(testCaseNumber, userName, DEFAULT_SHEET_NAME),
					REPOSITORY.getCellDataOnTestCase(testCaseNumber, password, DEFAULT_SHEET_NAME),
					REPOSITORY.getCellDataOnTestCase(testCaseNumber, homePageTitle, DEFAULT_SHEET_NAME)),"Login to the application failed");
			captureScreenShotOnPass(getDriver(), testCaseName);
			HOMEPAGE_ACTIONS.createMasterServicesAgreement(testCaseName, testCaseNumber,DEFAULT_SHEET_NAME);
			webElementHighlighter(getDriver(), getWebElementFactory().getSaveButton());
			executeJS(getDriver(),FanniemaeConstants.JS_CLICK_SCRIPT,getWebElementFactory().getSaveButton());
			park(2);
			waitForPageLoad(getDriver(), 15);
			
			webElementHighlighter(getDriver(), getWebElementFactory().getContractTeamSet());
			executeJS(getDriver(),FanniemaeConstants.JS_CLICK_SCRIPT,getWebElementFactory().getContractTeamSet());
			park(2);
			waitForPageLoad(getDriver(), 15);
			WebElementOperations.click(getDriver(), getWebElementFactory().getSaveButtonMarkC());
			click(getDriver(), getWebElementFactory().getApproveButton());
			HOMEPAGE_ACTIONS.logout(testCaseName);
			addPassedTestCaseResult(testCaseName);
			LOG.info("Successfully create contract Master services Agreement");
		} catch (Exception e) {
			performPostExceptionProcess(testCaseName, testCaseNumber, "contractMasterServicesAgreement has failed", e, getDefaultConfiguredWorkbookSheetName());
		}
	}
	
}
