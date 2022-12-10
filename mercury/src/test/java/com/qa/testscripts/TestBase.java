package com.qa.testscripts;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


import com.qa.pages.MercuryPages;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase 
{
	MercuryPages mercuryp;
    WebDriver Driver;
    Properties prop;
    @Parameters({"Browser","Url"})
  @BeforeClass
  public void Setup(String Browser,String Url)throws IOException
  {
    	FileInputStream fileLoc=new FileInputStream("C:\\Users\\user\\Virtusa Tool\\mercury\\src\\test\\java\\com\\qa\\testdata\\creditional.properties");
     prop=new Properties();
      prop.load(fileLoc);
      if(Browser.equalsIgnoreCase("Chrome"))
      {
          WebDriverManager.chromedriver().setup();
          Driver=new ChromeDriver();
      }
      else  if(Browser.equalsIgnoreCase("Edge"))
      { 
    	  System.setProperty("webdriver.edge.driver","E:\\msedgedriver.exe");
          Driver=new EdgeDriver();
      }
      
     
      mercuryp=new MercuryPages(Driver);
      //Driver.manage().window().maximize();
      Driver.get(Url);
    
  }
	/*
	 * @AfterClass public void TearDown() { Driver.close(); }
	 */
}