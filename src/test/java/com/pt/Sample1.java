package com.pt;

import org.testng.annotations.Test;

import com.techouts.fanniemae.test.AbstractTest;
import com.techouts.fanniemae.webelement.ops.WebElementOperations;

public class Sample1  extends AbstractTest {
	@Test
	public void openApplication(){
		String testCaseName="SupplierRegistration";
		String serialNo="1";
		
	getFannieMaePage();
	
	WebElementOperations.click(getDriver(), getWebElementFactory1().getNewSupplier());
	WebElementOperations.park(2);
	 String s =WebElementOperations.getText(getDriver(), getWebElementFactory1().getSecurityControlCaptcha());
 WebElementOperations.sendKeys(getDriver(),  getWebElementFactory1().getSecurityControl(),s);
 
 System.out.println(s);


}
}