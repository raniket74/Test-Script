package com.twirll.utill;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class TestSetup {
	
	public static WebDriver driver;
	
	
	@BeforeMethod
	@Parameters(value="browser")
	public static void setupBrowser(String browser){
	
		try {
			if(browser.equalsIgnoreCase("firefox")){
				
				driver = new FirefoxDriver();
				
			}
			else if(browser.equalsIgnoreCase("chrome")){
				
				driver = new ChromeDriver();
			}

			driver.manage().window().maximize();
			
			driver.get("https://portal.twirll.com/pos");

			
		}
		catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
		}
		
	
	}
	
//	@AfterMethod
//	public void tearDown() {
//		driver.quit();
//	}	

}
