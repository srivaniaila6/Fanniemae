package com.techouts.fanniemae.testcases;

import static com.techouts.fanniemae.webelement.ops.WebElementOperations.acceptAlertIfPresent;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.captureScreenShotOnPass;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.click;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.dropDownByTextVisibility;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.executeJS;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.park;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.sendKeys;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.switchToDefaultContentFrame;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.switchToFrame;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.verifyPageTitle;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.waitForElementPresence;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.waitForPageLoad;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.webElementHighlighter;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.getTimeStamp;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.techouts.fanniemae.consts.FanniemaeConstants;
import com.techouts.fanniemae.test.AbstractTest;
import com.techouts.fanniemae.util.Assert;
import com.techouts.fanniemae.webelement.ops.WebElementOperations;

public class RealEstateBrokerSupplierCreationTest extends AbstractTest {
	
	private static final Logger LOG = Logger.getLogger(RealEstateBrokerSupplierCreationTest.class.getName());
	
	private int  userName = FanniemaeConstants.G;
	private int password = FanniemaeConstants.H;
	private int landingPageTitle = FanniemaeConstants.K;
	private int homePageTitle = FanniemaeConstants.L;
	private int supplierType= FanniemaeConstants.AD;
	private int legalName= FanniemaeConstants.AF;
	private int addressLine1= FanniemaeConstants.AG;
	private int city= FanniemaeConstants.AH;
	private int zip= FanniemaeConstants.AI;
	private int state= FanniemaeConstants.AJ;
	private int country= FanniemaeConstants.AK;
	private static int additional = FanniemaeConstants.AN;
	private int equatorId= FanniemaeConstants.AY;
	CorporateSupplierCreationTest corporateSupplierCreationTest;
	
	@Test(priority = 4)
	public void createRealEstateBrokerSupplier() {
		String testCaseNumber = "4";
		String testCaseName = "CreateRealEstateBrokerSupplier";
		corporateSupplierCreationTest=new CorporateSupplierCreationTest();
		try {
			getFannieMaePage();
			String legalNameUpdate=REPOSITORY.getCellDataOnTestCase(testCaseNumber, legalName, DEFAULT_SHEET_NAME);
			Assert.assertTrue(verifyPageTitle(getDriver(), REPOSITORY.getCellDataOnTestCase(testCaseNumber, landingPageTitle, DEFAULT_SHEET_NAME)));
			captureScreenShotOnPass(getDriver(), testCaseName);
			HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(testCaseNumber, userName, DEFAULT_SHEET_NAME),
					REPOSITORY.getCellDataOnTestCase(testCaseNumber, password, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(testCaseNumber, homePageTitle, DEFAULT_SHEET_NAME));
			captureScreenShotOnPass(getDriver(), testCaseName);

			Assert.assertTrue(mainInfoDetailsOfRealEstateBroker(testCaseName, testCaseNumber, legalNameUpdate),"Fails to add Main Info Details due to issue");
			Assert.assertTrue(additionalInfoOfRealEstateBroker(testCaseName,testCaseNumber),"Fails during add additional information");
			waitForPageLoad(getDriver(),15);
			String email="test"+getTimeStamp(FanniemaeConstants.DDMMYYHHMMSSSSS)+"@testing.com";
			corporateSupplierCreationTest.contactInfoForCreateSupplier2(testCaseName,testCaseNumber,"BPC","Test",email);
			supplierContactManagement(testCaseName,email,"12345");
			dropDownByTextVisibility(getDriver(), getWebElementFactory().getSupplierRole(), "Broker Assistant / Backup");
			park(0.5);
			dropDownByTextVisibility(getDriver(), getWebElementFactory().getSupplierRole(), "Broker Primary Contact");
			webElementHighlighter(getDriver(), getWebElementFactory().getCreateSupplierSaveButton());
			executeJS(getDriver(),FanniemaeConstants.JS_CLICK_SCRIPT, getWebElementFactory().getCreateSupplierSaveButton());
			park(2);
			waitForPageLoad(getDriver(), 15);
			email="test"+getTimeStamp(FanniemaeConstants.DDMMYYHHMMSSSSS)+"@testing.com";;
			corporateSupplierCreationTest.contactInfoForCreateSupplier2(testCaseName,testCaseNumber,"BO","Test",email);
			supplierContactManagement(testCaseName,email,"12345");
			park(0.5);
			dropDownByTextVisibility(getDriver(), getWebElementFactory().getSupplierRole2(), "MLA Signer");
			park(0.5);
			dropDownByTextVisibility(getDriver(), getWebElementFactory().getSupplierRole2(), "Broker / Owner");
			park(0.5);
			dropDownByTextVisibility(getDriver(), getWebElementFactory().getSupplierRole2(), "Main RFx contact");
			captureScreenShotOnPass(getDriver(), testCaseName);
			webElementHighlighter(getDriver(), getWebElementFactory().getCreateSupplierSaveButton());
			park(2);
			waitForPageLoad(getDriver(), 15);executeJS(getDriver(),FanniemaeConstants.JS_CLICK_SCRIPT, getWebElementFactory().getCreateSupplierSaveButton());
			approvalWorkflowForRealEstateBroker(testCaseName);
			click(getDriver(), getWebElementFactory().getMainInfoTab());
			park(1);
			waitForPageLoad(getDriver(), 15);
			webElementHighlighter(getDriver(), getWebElementFactory().getSupplierId());
			String supplierId=getWebElementFactory().getSupplierId().getText();
			LOG.info("Supplier ID is "+supplierId);
			park(1);
			//Assert.assertTrue(HOMEPAGE_ACTIONS.searchAndVerifyCreatedOne(testCaseName,testCaseNumber, supplierId, DEFAULT_SHEET_NAME),"After create supplier search and find supplier fails");
			HOMEPAGE_ACTIONS.logout(testCaseName);
			addPassedTestCaseResult(testCaseName);
		} catch (Exception e) {
			String msg = "TestCase["+testCaseName+"] has failed.";
			LOG.error(msg,e);
			performPostExceptionProcess(testCaseName, testCaseNumber, msg, e, getDefaultConfiguredWorkbookSheetName());
		}
	}
	
	public boolean clickOnThreeDotsAndSelectData(String testCaseName,WebElement button,String searchText){
		try {
			click(getDriver(),button);
			switchToFrame(getDriver(), 0);
			captureScreenShotOnPass(getDriver(), testCaseName);
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankInfoSearchBox(),searchText);
			click(getDriver(),getWebElementFactory().getCreateSupplierBankInfoSearchBtn());
			click(getDriver(),getWebElementFactory().getCreateSupplierBankInfoClickOnResult());
			switchToDefaultContentFrame(getDriver());
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	private boolean mainInfoDetailsOfRealEstateBroker(String testCaseName, String testCaseNumber, String legalNameUpdate){
		try {
			//Navigate corporate
			click(getDriver(), getWebElementFactory().getCreateSupplierSupplierLink());
			click(getDriver(), getWebElementFactory().getCreateSupplierLink());
			waitForPageLoad(getDriver(), 15);
			captureScreenShotOnPass(getDriver(), testCaseName);
			
			//create Corporate
			dropDownByTextVisibility(getDriver(), getWebElementFactory().getCreateSupplierSupplierType(), REPOSITORY.getCellDataOnTestCase(testCaseNumber, supplierType, DEFAULT_SHEET_NAME));
			park(4);
			waitForPageLoad(getDriver(), 15);
			park(4);
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierLegalName(),legalNameUpdate);
			
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierMainSupplierAddressNameAdditional(),"Test Address");
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierAddressLine1(),REPOSITORY.getCellDataOnTestCase(testCaseNumber, addressLine1, DEFAULT_SHEET_NAME));
			
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierCity(),REPOSITORY.getCellDataOnTestCase(testCaseNumber, city, DEFAULT_SHEET_NAME));
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierZip(),REPOSITORY.getCellDataOnTestCase(testCaseNumber, zip, DEFAULT_SHEET_NAME));
			HOMEPAGE_ACTIONS.autoSuggestionHandle(getWebElementFactory().getCreateSupplierState(), REPOSITORY.getCellDataOnTestCase(testCaseNumber, state, DEFAULT_SHEET_NAME));
			dropDownByTextVisibility(getDriver(), getWebElementFactory().getCreateSupplierCountry(), REPOSITORY.getCellDataOnTestCase(testCaseNumber, country, DEFAULT_SHEET_NAME));
			
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierRealEstateBrokerEquatorIdEVID(),REPOSITORY.getCellDataOnTestCase(testCaseNumber, equatorId, DEFAULT_SHEET_NAME));
			click(getDriver(), getWebElementFactory().getCreateSupplierRealEstateBrokerUsingWeb());
			click(getDriver(), getWebElementFactory().getCreateSupplierRealEstateBrokerIsPayable());
			captureScreenShotOnPass(getDriver(), testCaseName);
			webElementHighlighter(getDriver(),getWebElementFactory().getCreateSupplierSaveButton());
			executeJS(getDriver(), FanniemaeConstants.JS_CLICK_SCRIPT, getWebElementFactory().getCreateSupplierSaveButton());
			return true;
		} catch (Exception e) {
			LOG.error("Fails to add main info details fo Real Estate Broker Suppler");
			return false;
		}
	}
	private boolean approvalWorkflowForRealEstateBroker(String testCaseName){
		try {
			//ApprovalWorkflowTab
			click(getDriver(), getWebElementFactory().getCreateSupplierApprovalWorkflowTab());
			waitForPageLoad(getDriver(), 15);
			captureScreenShotOnPass(getDriver(), testCaseName);
			waitForElementPresence(getDriver(), getWebElementFactory().getCreateSupplierApprovalWorkflowSubmitForDiligence(), 15);
			click(getDriver(), getWebElementFactory().getCreateSupplierApprovalWorkflowSubmitForDiligence());
			park(2);
			waitForPageLoad(getDriver(), 15);
			captureScreenShotOnPass(getDriver(), testCaseName);
			click(getDriver(), getWebElementFactory().getCreateSupplierApprovalWorkflowSubmitToWorkflow());
			park(2);
			waitForPageLoad(getDriver(), 15);
			captureScreenShotOnPass(getDriver(), testCaseName);
			click(getDriver(), getWebElementFactory().getCreateSupplierRealEstateBrokerContinueOnBoarding());
			park(2);
			waitForPageLoad(getDriver(), 15);
			captureScreenShotOnPass(getDriver(), testCaseName);
			click(getDriver(), getWebElementFactory().getCreateSupplierRealEstateBrokerProfileDocumentUpdate());
			park(2);
			waitForPageLoad(getDriver(), 15);
			captureScreenShotOnPass(getDriver(), testCaseName);
			click(getDriver(), getWebElementFactory().getCreateSupplierRealEstateBrokerApprove());
			park(2);
			
			waitForPageLoad(getDriver(), 15);
			captureScreenShotOnPass(getDriver(), testCaseName);
			click(getDriver(), getWebElementFactory().getCreateSupplierRealEstateBrokerNoFindings());
			park(2);
			
			waitForPageLoad(getDriver(), 15);
			captureScreenShotOnPass(getDriver(), testCaseName);
			click(getDriver(), getWebElementFactory().getCreateSupplierRealEstateBrokerTraxUpdated());
			park(2);
			waitForPageLoad(getDriver(), 15);
			captureScreenShotOnPass(getDriver(), testCaseName);
			click(getDriver(), getWebElementFactory().getCreateSupplierRealEstateBrokerProcureOneUpdated());
			park(2);
			waitForPageLoad(getDriver(), 15);
			captureScreenShotOnPass(getDriver(), testCaseName);
			click(getDriver(), getWebElementFactory().getCreateSupplierRealEstateBrokerACHInformationUpdated());
			park(2);
			waitForPageLoad(getDriver(), 15);
			captureScreenShotOnPass(getDriver(), testCaseName);
			click(getDriver(), getWebElementFactory().getCreateSupplierRealEstateBrokerApproveFinal());
			park(2);
			waitForPageLoad(getDriver(), 15);
			captureScreenShotOnPass(getDriver(), testCaseName);
			sendKeys(getDriver(), getWebElementFactory().getCreateSupplierRealEstateBrokerReason(), "Test");
			park(2);
			waitForPageLoad(getDriver(), 15);
			captureScreenShotOnPass(getDriver(), testCaseName);
			click(getDriver(), getWebElementFactory().getCreateSupplierRealEstateBrokerReasonConfirm());
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean additionalInfoOfRealEstateBroker(String testCaseName,String testCaseNumber){
		try {
			//Additional info
			click(getDriver(), getWebElementFactory().getCreateSupplierAdditionalInfoTab());
			captureScreenShotOnPass(getDriver(), testCaseName);
			
			//Address
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierNameAdditional(), REPOSITORY.getCellDataOnTestCase(testCaseNumber, additional, DEFAULT_SHEET_NAME));
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierAddInfoAddressLine1(),REPOSITORY.getCellDataOnTestCase(testCaseNumber, addressLine1, DEFAULT_SHEET_NAME));
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierAddInfoCity(), REPOSITORY.getCellDataOnTestCase(testCaseNumber, city, DEFAULT_SHEET_NAME));
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierAddInfoZip(), REPOSITORY.getCellDataOnTestCase(testCaseNumber, zip, DEFAULT_SHEET_NAME));
			HOMEPAGE_ACTIONS.autoSuggestionHandle(getWebElementFactory().getCreateSupplierAddInfoState(),REPOSITORY.getCellDataOnTestCase(testCaseNumber, state, DEFAULT_SHEET_NAME));
			dropDownByTextVisibility(getDriver(), getWebElementFactory().getCreateSupplierAddInfoCountry(),REPOSITORY.getCellDataOnTestCase(testCaseNumber, country, DEFAULT_SHEET_NAME));
					
			captureScreenShotOnPass(getDriver(), testCaseName);
			webElementHighlighter(getDriver(), getWebElementFactory().getCreateSupplierSaveButton());
			executeJS(getDriver(),FanniemaeConstants.JS_CLICK_SCRIPT, getWebElementFactory().getCreateSupplierSaveButton());
			return true;
		} catch (Exception e) {
			
			return false;
		}
	}
	
	private boolean supplierContactManagement(String testCaseName,String email,String pass){
		try {
			webElementHighlighter(getDriver(), getWebElementFactory().getCreateSupplierSaveButton());
			executeJS(getDriver(),FanniemaeConstants.JS_CLICK_SCRIPT, getWebElementFactory().getCreateSupplierSaveButton());
			click(getDriver(), getWebElementFactory().getSuperLoginIcon());
			park(2);
			switchToDefaultContentFrame(getDriver());
			switchToFrame(getDriver(), 1);
			sendKeys(getDriver(), getWebElementFactory().getSuperLoginlogin(), email);
			park(2);
			sendKeys(getDriver(), getWebElementFactory().getSuperLoginpassword(),pass);
			park(2);
			webElementHighlighter(getDriver(), getWebElementFactory().getCreateSupplierContactInfoSaveAndClose());
			executeJS(getDriver(),FanniemaeConstants.JS_CLICK_SCRIPT, getWebElementFactory().getCreateSupplierContactInfoSaveAndClose());
			try {
				acceptAlertIfPresent(getDriver(), 3);
				LOG.info("Alert present");
			} catch (Exception e) {
				LOG.info("Alert is not present");
			}
			park(2);
			switchToDefaultContentFrame(getDriver());
			switchToFrame(getDriver(), 0);
			click(getDriver(), getWebElementFactory().getRegenaratePasswordButton());
			park(2);
			switchToDefaultContentFrame(getDriver());
			switchToFrame(getDriver(), 1);
			click(getDriver(), getWebElementFactory().getRegenaratepassword());
			park(2);
			WebElementOperations.click(getDriver(), getWebElementFactory().getSaveButtonMarkC());
			click(getDriver(), getWebElementFactory().getRegenaratePasswordClose());
			park(4);
			switchToDefaultContentFrame(getDriver());
			switchToFrame(getDriver(), 0);
			webElementHighlighter(getDriver(), getWebElementFactory().getCreateSupplierContactInfoSaveAndClose());
			executeJS(getDriver(),FanniemaeConstants.JS_CLICK_SCRIPT, getWebElementFactory().getCreateSupplierContactInfoSaveAndClose());
			park(2);
			switchToDefaultContentFrame(getDriver());			
			park(5);
			
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
