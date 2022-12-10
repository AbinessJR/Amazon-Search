package com.qa.testscripts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.MercuryPages;



public class TC_MercuryLogin_001 extends TestBase{
	MercuryPages mercuryp;
	@Parameters({"Browser","Url"})
	@Test
	public void login(String Browser,String Url) throws InterruptedException{
		mercuryp=new MercuryPages(Driver);
		mercuryp.getuser().click();
		Thread.sleep(3000);
		mercuryp.getuser().sendKeys(prop.getProperty("Username"));
		Thread.sleep(3000);
		mercuryp.getpassword().click();
		Thread.sleep(3000);
		mercuryp.getpassword().sendKeys(prop.getProperty("Password"));
		Thread.sleep(3000);
		mercuryp.getsubmit().click();
}
}

