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

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.techouts.fanniemae.consts.FanniemaeConstants;
import com.techouts.fanniemae.exceptions.FannieMaeBusinessException;
import com.techouts.fanniemae.test.AbstractTest;
import com.techouts.fanniemae.util.Assert;

public class CorporateSupplierCreationTest extends AbstractTest {
	private static final Logger LOG = Logger.getLogger(RealEstateBrokerSupplierCreationTest.class.getName());
	
	private int userName = FanniemaeConstants.G;
	private int password = FanniemaeConstants.H;
	private int landingPageTitle = FanniemaeConstants.K;
	private int homePageTitle = FanniemaeConstants.L;
	private int legalName= FanniemaeConstants.AF;
	private static int supplierType = FanniemaeConstants.AD;
	private static int supplierClassification = FanniemaeConstants.AE;
	private static int addressLine1 = FanniemaeConstants.AG;
	private static int city = FanniemaeConstants.AH;
	private static int zip = FanniemaeConstants.AI;
	private static int state = FanniemaeConstants.AJ;
	private static int country = FanniemaeConstants.AK;
	private static int tinType = FanniemaeConstants.AL;
	private static int federalTaxID = FanniemaeConstants.AM;
	private static int searchText = FanniemaeConstants.AP;
	private static int bankName = FanniemaeConstants.AQ;
	private static int bankCity = FanniemaeConstants.AR;
	private static int abaRoutingNumber = FanniemaeConstants.AS;
	private static int accNumber = FanniemaeConstants.AT;
	private static int lastName = FanniemaeConstants.AU;
	private static int firstName = FanniemaeConstants.AV;
	private static int email = FanniemaeConstants.AW;
	private static int phone = FanniemaeConstants.AX;

	@Test(priority = 3)
	public void createCorporateSupplier() {
		String testCaseNumber = "3";
		String testCaseName = "CreateCorporateSupplier";
		try {
			getFannieMaePage();
			String legalNameUpdate = REPOSITORY.getCellDataOnTestCase(testCaseNumber, legalName, DEFAULT_SHEET_NAME);
			Assert.assertTrue(verifyPageTitle(getDriver(), REPOSITORY.getCellDataOnTestCase(testCaseNumber, landingPageTitle, DEFAULT_SHEET_NAME)));
			captureScreenShotOnPass(getDriver(), testCaseName);
			Assert.assertTrue(HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(testCaseNumber, userName, DEFAULT_SHEET_NAME),
					REPOSITORY.getCellDataOnTestCase(testCaseNumber, password, DEFAULT_SHEET_NAME),
					REPOSITORY.getCellDataOnTestCase(testCaseNumber, homePageTitle, DEFAULT_SHEET_NAME)),"Login to the application failed");
			captureScreenShotOnPass(getDriver(), testCaseName);
			Assert.assertTrue(mainInfoDeatilsOfCorporateSupplier(testCaseName,testCaseNumber, legalNameUpdate),"Fail during add supplier main/basic information");
			Assert.assertTrue(additionalInfoOfCorporateSupplier(testCaseName,testCaseNumber),"Fails during add additional information");
			bankInfoForCreateSupplier(testCaseName,testCaseNumber);
			webElementHighlighter(getDriver(),getWebElementFactory().getCreateSupplierSaveButton());
			executeJS(getDriver(),FanniemaeConstants.JS_CLICK_SCRIPT,getWebElementFactory().getCreateSupplierSaveButton());
			try {
				acceptAlertIfPresent(getDriver(), 5);
				LOG.info("First alert is visible");
			} catch (Exception e) {
				LOG.info("First alert is not visible");
			}
			park(4);
			try {
				acceptAlertIfPresent(getDriver(), 5);
				LOG.info("second alert is visible");
			} catch (Exception e) {
				LOG.info("second alert is not visible");
			}
			park(2);
			waitForPageLoad(getDriver(),15);
			park(2);
			captureScreenShotOnPass(getDriver(), testCaseName);
			click(getDriver(),getWebElementFactory().getCreateSupplierBankInfoCloseButton());
			park(2);
			waitForPageLoad(getDriver(),15);
			switchToDefaultContentFrame(getDriver());
			waitForPageLoad(getDriver(),15);
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationSupplierEmailAddressForACHPaymentConf(), "automation@test.com");
			captureScreenShotOnPass(getDriver(), testCaseName);
			webElementHighlighter(getDriver(), getWebElementFactory().getCreateSupplierSaveButton());
			executeJS(getDriver(),FanniemaeConstants.JS_CLICK_SCRIPT, getWebElementFactory().getCreateSupplierSaveButton());
			waitForPageLoad(getDriver(),15);
			contactInfoForCreateSupplier(testCaseName,testCaseNumber);
			click(getDriver(),getWebElementFactory().getCreateSupplierContactInfoSaveAndClose());
			switchToDefaultContentFrame(getDriver());
			approvalWorkflowForCorporateSupplier(testCaseName);
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
			performPostExceptionProcess(testCaseName, testCaseNumber, "createCorporateSupplier has failed", e, getDefaultConfiguredWorkbookSheetName());
		}
	}
	
	private boolean approvalWorkflowForCorporateSupplier(String testCaseName){
		try {
			click(getDriver(), getWebElementFactory().getCreateSupplierApprovalWorkflowTab());
			captureScreenShotOnPass(getDriver(), testCaseName);
			waitForPageLoad(getDriver(), 15);
			waitForElementPresence(getDriver(), getWebElementFactory().getCreateSupplierApprovalWorkflowSubmitForDiligence(), 15);
			click(getDriver(), getWebElementFactory().getCreateSupplierApprovalWorkflowSubmitForDiligence());
			park(2);
			waitForPageLoad(getDriver(), 15);
			captureScreenShotOnPass(getDriver(), testCaseName);
			click(getDriver(),getWebElementFactory().getCreateSupplierApprovalWorkflowSubmitToWorkflow());
			park(2);
			waitForPageLoad(getDriver(), 15);
			captureScreenShotOnPass(getDriver(), testCaseName);
			click(getDriver(), getWebElementFactory().getCreateSupplierApprovalWorkflowApprovalFinal());
			park(2);
			waitForPageLoad(getDriver(), 15);
			captureScreenShotOnPass(getDriver(), testCaseName);
			click(getDriver(), getWebElementFactory().getCreateSupplierApprovalWorkflowApproveChanges());
			park(2);
			waitForPageLoad(getDriver(), 15);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean contactInfoForCreateSupplier(String testCaseName,String testCaseNumber){
		try {
			click(getDriver(), getWebElementFactory().getCreateSupplierContactInfoTab());
			park(2);
			captureScreenShotOnPass(getDriver(), testCaseName);
			waitForPageLoad(getDriver(), 15);
			click(getDriver(), getWebElementFactory().getCreateSupplierContactInfoAddAContact());
			waitForPageLoad(getDriver(), 15);
			switchToFrame(getDriver(), 0);
			dropDownByTextVisibility(getDriver(), getWebElementFactory().getCreateSupplierSupplierContactManagementStatus(), "Validated");
			sendKeys(getDriver(), getWebElementFactory().getCreateSupplierContactInfoLastName(),REPOSITORY.getCellDataOnTestCase(testCaseNumber, lastName, DEFAULT_SHEET_NAME));
			sendKeys(getDriver(), getWebElementFactory().getCreateSupplierContactInfoFirstName(),REPOSITORY.getCellDataOnTestCase(testCaseNumber, firstName, DEFAULT_SHEET_NAME));
			sendKeys(getDriver(), getWebElementFactory().getCreateSupplierContactInfoEmail(),REPOSITORY.getCellDataOnTestCase(testCaseNumber, email, DEFAULT_SHEET_NAME));
			sendKeys(getDriver(), getWebElementFactory().getCreateSupplierContactInfoPhono(),	REPOSITORY.getCellDataOnTestCase(testCaseNumber, phone, DEFAULT_SHEET_NAME));
			captureScreenShotOnPass(getDriver(), testCaseName);
			park(1);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	private boolean mainInfoDeatilsOfCorporateSupplier(String testCaseName,String serialNo,String legalNameUpdate){
		try {
			click(getDriver(),getWebElementFactory().getCreateSupplierSupplierLink());
			click(getDriver(), getWebElementFactory().getCreateSupplierLink());
			waitForPageLoad(getDriver(), 15);
			captureScreenShotOnPass(getDriver(), testCaseName);
			dropDownByTextVisibility(getDriver(), getWebElementFactory().getCreateSupplierSupplierType(), REPOSITORY.getCellDataOnTestCase(serialNo, supplierType, DEFAULT_SHEET_NAME));
			park(4);
			waitForPageLoad(getDriver(), 15);
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierLegalName(),legalNameUpdate);
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierDoingBusinessAs(),"Yes");		
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierPhoneNumber(),"1234567890");
			//create Corporate
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierMainSupplierAddressNameAdditional(),"Test Address");
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierAddressLine1(),REPOSITORY.getCellDataOnTestCase(serialNo, addressLine1, DEFAULT_SHEET_NAME));
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierCity(),REPOSITORY.getCellDataOnTestCase(serialNo, city, DEFAULT_SHEET_NAME));
			HOMEPAGE_ACTIONS.autoSuggestionHandle(getWebElementFactory().getCreateSupplierState(), REPOSITORY.getCellDataOnTestCase(serialNo, state, DEFAULT_SHEET_NAME));
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierZip(),REPOSITORY.getCellDataOnTestCase(serialNo, zip, DEFAULT_SHEET_NAME));
			dropDownByTextVisibility(getDriver(), getWebElementFactory().getCreateSupplierCountry(), REPOSITORY.getCellDataOnTestCase(serialNo, country, DEFAULT_SHEET_NAME));
			waitForPageLoad(getDriver(), 15);
			park(2);
			dropDownByTextVisibility(getDriver(), getWebElementFactory().getCreateSupplierSupplierClassification(),REPOSITORY.getCellDataOnTestCase(serialNo, supplierClassification, DEFAULT_SHEET_NAME));
			park(1);
			webElementHighlighter(getDriver(), getWebElementFactory().getCreateSupplierSaveButton());
			executeJS(getDriver(),FanniemaeConstants.JS_CLICK_SCRIPT, getWebElementFactory().getCreateSupplierSaveButton());
			waitForPageLoad(getDriver(), 15);
			return true;
		} catch (Exception e) {
			throw new FannieMaeBusinessException(e.getMessage(),e);
		}
	}
	
	public boolean additionalInfoOfCorporateSupplier(String testCaseName,String testCaseNumber){
		try {
			//Additional info
			click(getDriver(), getWebElementFactory().getCreateSupplierAdditionalInfoTab());
			captureScreenShotOnPass(getDriver(), testCaseName);
			dropDownByTextVisibility(getDriver(), getWebElementFactory().getCreateSupplierTINType(), REPOSITORY.getCellDataOnTestCase(testCaseNumber, tinType, DEFAULT_SHEET_NAME));
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierFederalTaxID(),REPOSITORY.getCellDataOnTestCase(testCaseNumber, federalTaxID, DEFAULT_SHEET_NAME));
			captureScreenShotOnPass(getDriver(), testCaseName);
			webElementHighlighter(getDriver(), getWebElementFactory().getCreateSupplierSaveButton());
			executeJS(getDriver(),FanniemaeConstants.JS_CLICK_SCRIPT, getWebElementFactory().getCreateSupplierSaveButton());
			return true;
		} catch (Exception e) {
			
			return false;
		}
	}
	
	public boolean bankInfoForCreateSupplier(String testCaseName,String testCaseNumber){
		try {
			//Banking Information
			click(getDriver(), getWebElementFactory().getCreateSupplierBankInfoBankTab());
			captureScreenShotOnPass(getDriver(), testCaseName);
			waitForPageLoad(getDriver(), 15);
			clickOnThreeDotsAndSelectData(testCaseName,getWebElementFactory().getCreateSupplierBankInfoBankButton(), REPOSITORY.getCellDataOnTestCase(testCaseNumber,searchText, DEFAULT_SHEET_NAME));
			clickAndGetbankInfoDataFromFrame(getWebElementFactory().getCreateSupplierBankInfoBankAccountDetails());
			clickAndGetbankInfoDataFromFrame(getWebElementFactory().getCreateSupplierBankInfoPaymentMethod());
			click(getDriver(),getWebElementFactory().getCreateSupplierBankInfoAddBankInfoButton());
			switchToFrame(getDriver(), 0);
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankInfoBankName(),	REPOSITORY.getCellDataOnTestCase(testCaseNumber, bankName, DEFAULT_SHEET_NAME));
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankInfoCity(),REPOSITORY.getCellDataOnTestCase(testCaseNumber, bankCity, DEFAULT_SHEET_NAME));
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankInfoABARoutingNumber(),REPOSITORY.getCellDataOnTestCase(testCaseNumber,abaRoutingNumber, DEFAULT_SHEET_NAME));
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankInfoAccNumber(),REPOSITORY.getCellDataOnTestCase(testCaseNumber,accNumber, DEFAULT_SHEET_NAME));
			captureScreenShotOnPass(getDriver(), testCaseName);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean paymentConfirmation(String testCaseName,String testCaseNumber){
		try {
			
			park(4);
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationSupplierEmailAddressForACHPaymentConf(), "automation@test.com");
			dropDownByTextVisibility(getDriver(), getWebElementFactory().getCreateSupplierBankingInformationPurchaseOrder(), "Purchase order cXML");
			dropDownByTextVisibility(getDriver(), getWebElementFactory().getCreateSupplierBankingInformationPOFunctionalAcknowledgement(), "PO Ack. EDI 855");
			dropDownByTextVisibility(getDriver(), getWebElementFactory().getCreateSupplierBankingInformationAdvanceShippingNotice(), "ASN EDI 856");
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationTestPartnerQualifier(), "22");
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationTestPartnerId(), "Test123");
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationTestAS2ReceiverId(), "Test123");
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationTestURL(), "https://www.fanniemae.com/portal/index.html");
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationTestCXMLPartnerDomain(), "www.fanniemae.com");
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationTestCDXMLPartnerIdentity(), "Test215");
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationTestCDXMLPartnerSharedSecret(), "No");
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationTestCDXMLReceiverUrl(), "https://www.fanniemae.com/portal/index.html ");
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationTestDomainFromCDXML(), "www.fanniemae.com");
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationTestIdentityFromCDXML(), "www.fanniemae.com");
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationTestCDXMLToDomain(), "www.fanniemae.com");
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationTestCDXMLToIdentity(), "www.fanniemae.com");
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationTestCDXMLSenderDomain(), "www.fanniemae.com");
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationTestCDXMLSenderIdentity(), "www.fanniemae.com");
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationTestCDXMLSenderSharedSecret(), "No");
			
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationProdPartnerQualifier(), "22");
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationProdPartnerId(), "Test123");
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationProdAS2ReceiverId(), "Test123");
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationProdURL(), "https://www.fanniemae.com/portal/index.html");
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationProdCXMLPartnerDomain(), "www.fanniemae.com");
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationProdCDXMLPartnerIdentity(), "Test215");
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationProdCDXMLPartnerSharedSecret(), "No");
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationProdCDXMLReceiverUrl(), "https://www.fanniemae.com/portal/index.html");
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationProdDomainFromCDXML(), "www.fanniemae.com");
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationProdIdentityFromCDXML(), "www.fanniemae.com");
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationProdCDXMLToDomain(), "www.fanniemae.com");
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationProdCDXMLToIdentity(), "www.fanniemae.com");
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationProdCDXMLSenderDomain(), "www.fanniemae.com");
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationProdCDXMLSenderIdentity(), "www.fanniemae.com");
			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationProdCDXMLSenderSharedSecret(), "No");
			captureScreenShotOnPass(getDriver(), testCaseName);
			webElementHighlighter(getDriver(), getWebElementFactory().getCreateSupplierSaveButton());
			executeJS(getDriver(),FanniemaeConstants.JS_CLICK_SCRIPT, getWebElementFactory().getCreateSupplierSaveButton());
			
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public boolean clickAndGetbankInfoDataFromFrame(WebElement button){
		try {
			click(getDriver(), button);
			switchToFrame(getDriver(), 0);
			executeJS(getDriver(),FanniemaeConstants.JS_CLICK_SCRIPT, getWebElementFactory().getCreateSupplierBankInfoClickOnResult());
			switchToDefaultContentFrame(getDriver());
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean afterClickOnSaveHandleAlerts(WebElement saveButton){
		try {
			webElementHighlighter(getDriver(), saveButton);
			executeJS(getDriver(), FanniemaeConstants.JS_CLICK_SCRIPT, saveButton);
			acceptAlertIfPresent(getDriver(), 5);
			park(4);
			acceptAlertIfPresent(getDriver(), 5);
			return true;
		} catch (Exception e) {
			LOG.info("Two alerts not presents");
			return false;
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
	public boolean contactInfoForCreateSupplier2(String testCaseName,String testCaseNumber,String name,String lastname,String email){
		try {
			click(getDriver(), getWebElementFactory().getCreateSupplierContactInfoTab());
			park(2);
			captureScreenShotOnPass(getDriver(), testCaseName);
			waitForPageLoad(getDriver(), 15);
			click(getDriver(), getWebElementFactory().getCreateSupplierContactInfoAddAContact());
			waitForPageLoad(getDriver(), 15);
			switchToFrame(getDriver(), 0);
			dropDownByTextVisibility(getDriver(), getWebElementFactory().getCreateSupplierSupplierContactManagementStatus(), "Validated");
			sendKeys(getDriver(), getWebElementFactory().getCreateSupplierContactInfoLastName(),name);
			sendKeys(getDriver(), getWebElementFactory().getCreateSupplierContactInfoFirstName(),lastname);
			sendKeys(getDriver(), getWebElementFactory().getCreateSupplierContactInfoEmail(),email);
			sendKeys(getDriver(), getWebElementFactory().getCreateSupplierContactInfoPhono(),	REPOSITORY.getCellDataOnTestCase(testCaseNumber, phone, DEFAULT_SHEET_NAME));
			captureScreenShotOnPass(getDriver(), testCaseName);
			park(1);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}