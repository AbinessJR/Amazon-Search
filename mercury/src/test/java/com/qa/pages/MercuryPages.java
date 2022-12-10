package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MercuryPages {
	WebDriver Driver;
	@FindBy(xpath="//tbody/tr[2]/td[2]/input[1]")
	WebElement userbox;
	public WebElement getuser()
	{
		return userbox;
	}
	@FindBy(xpath="//tbody/tr[3]/td[2]/input[1]")
	WebElement password;
	public WebElement getpassword() {
		return password;
	}
	@FindBy(xpath="//tbody/tr[4]/td[2]/div[1]/input[1]")
	WebElement submit;
	public WebElement getsubmit()
	{
		return submit;
	}
	 public MercuryPages(WebDriver Driver)
     {
         this.Driver=Driver;
        PageFactory.initElements(Driver,this); 
     }
}
