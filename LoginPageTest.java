package com.twirll.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.twirll.pages.HomePage;
import com.twirll.pages.LoginPage;
import com.twirll.utill.TestSetup;


public class LoginPageTest extends TestSetup{
	
	LoginPage loginPage;
	SoftAssert assrt;
	HomePage dashboard;
	
	
	@BeforeMethod
	public void setup(){
		loginPage = new LoginPage();
		assrt = new SoftAssert();
	}

	@Test
	public void TestLoginFunctionality() throws InterruptedException {
		
		String HomePageTitle = driver.getTitle();
		System.out.println(HomePageTitle);
		assrt.assertEquals(HomePageTitle, "Twirll: Business Login");
		
		loginPage.Login();
		
		
		Thread.sleep(10000);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notification");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		assrt.assertAll();
	}
	
	
}