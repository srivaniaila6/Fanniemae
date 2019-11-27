package com.pt;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.techouts.fanniemae.consts.FanniemaeConstants;
import com.techouts.fanniemae.test.AbstractTest;
import com.techouts.fanniemae.webelement.ops.WebElementOperations;

public class SupplierReg extends AbstractTest{
	private int corporateName=FanniemaeConstants.E; 
	private int supplierType=FanniemaeConstants.F;
	private int federalTaxID=FanniemaeConstants.G;
	private int lastName=FanniemaeConstants.H;
	private int firstName=FanniemaeConstants.I;
	private int title=FanniemaeConstants.J;
	private int emailOfSupplierRegistrationContact=FanniemaeConstants.K;
	private int password=FanniemaeConstants.L;
	private int confirmPassword=FanniemaeConstants.M;
	private int phoneNumber=FanniemaeConstants.N;
	private int addressLine1=FanniemaeConstants.O;
	private int city=FanniemaeConstants.P;
	private int state=FanniemaeConstants.Q;
	private int Country=FanniemaeConstants.R;
	private int zipCode=FanniemaeConstants.S;
	
	private static final Logger LOG=Logger.getLogger(SupplierReg.class.getName());
	@Test
	public void openApplication() {
		String testCaseName="SupplierRegistration";
		String serialNo="1";
		
	getFannieMaePage();
	
	WebElementOperations.click(getDriver(), getWebElementFactory1().getNewSupplier());
	WebElementOperations.park(2);
	WebElementOperations.waitForPageLoad(getDriver(), 15);
	WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getCorporateName(), REPOSITORY.getCellDataOnTestCase(serialNo, corporateName, DEFAULT_SHEET_NAME));
	WebElementOperations.park(2);
    WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getFederalTaxID(), REPOSITORY.getCellDataOnTestCase(serialNo, federalTaxID, DEFAULT_SHEET_NAME));
    WebElementOperations.park(2);
    WebElementOperations.dropDownByTextVisibility(getDriver(), getWebElementFactory1().getSupplierType(), REPOSITORY.getCellDataOnTestCase(serialNo, supplierType, DEFAULT_SHEET_NAME));
    WebElementOperations.park(2);
    WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getLastName(), REPOSITORY.getCellDataOnTestCase(serialNo, lastName, DEFAULT_SHEET_NAME));
    WebElementOperations.park(2);
    WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getFirstNumber(), REPOSITORY.getCellDataOnTestCase(serialNo, firstName, DEFAULT_SHEET_NAME));
    WebElementOperations.park(2);
    WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getTitle(),REPOSITORY.getCellDataOnTestCase(serialNo, title, DEFAULT_SHEET_NAME));
    WebElementOperations.park(2);
    WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getEmailOfSupplierRegisterContact(), REPOSITORY.getCellDataOnTestCase(serialNo, emailOfSupplierRegistrationContact, DEFAULT_SHEET_NAME));
    WebElementOperations.park(5);
    WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getPasswordInSupplierRegister(), REPOSITORY.getCellDataOnTestCase(serialNo, password, DEFAULT_SHEET_NAME));
    WebElementOperations.park(2);
    WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getConfirmPassword(), REPOSITORY.getCellDataOnTestCase(serialNo, confirmPassword, DEFAULT_SHEET_NAME));
    WebElementOperations.park(2);
    WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getPhoneNumber(), REPOSITORY.getCellDataOnTestCase(serialNo, phoneNumber, DEFAULT_SHEET_NAME));
    WebElementOperations.park(2);
    WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getAddressLine1(), REPOSITORY.getCellDataOnTestCase(serialNo, addressLine1, DEFAULT_SHEET_NAME));
    WebElementOperations.park(2);
    WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getCity(), REPOSITORY.getCellDataOnTestCase(serialNo, city, DEFAULT_SHEET_NAME));
    WebElementOperations.park(2);
    WebElementOperations.dropDownByTextVisibility(getDriver(), getWebElementFactory1().getState(), REPOSITORY.getCellDataOnTestCase(serialNo, state, DEFAULT_SHEET_NAME));
    WebElementOperations.park(2);
    WebElementOperations.sendKeys(getDriver(), getWebElementFactory1().getZipCode(), REPOSITORY.getCellDataOnTestCase(serialNo, zipCode, DEFAULT_SHEET_NAME));
    WebElementOperations.park(2);
    WebElementOperations.dropDownByTextVisibility(getDriver(), getWebElementFactory1().getCountry(),REPOSITORY.getCellDataOnTestCase(serialNo, Country, DEFAULT_SHEET_NAME));
    WebElementOperations.park(2);
    WebElementOperations.click(getDriver(), getWebElementFactory1().getRegistrationRequest());
   
//	s=WebElementOperations.getText(getDriver(), getWebElementFactory1().getSecurityControlCaptcha());
//   WebElementOperations.sendKeys(getDriver(),  getWebElementFactory1().getSecurityControl(),s);


}
}