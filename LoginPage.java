package com.twirll.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.twirll.utill.TestSetup;

public class LoginPage extends TestSetup{
	
	@FindBy(id = "username")
	public WebElement email;
	
	@FindBy(id = "password")
	public WebElement pwd;
	
	@FindBy(xpath = "//*[@id='loginBody']/a")
	public WebElement submt;
	
	public LoginPage(){
		PageFactory.initElements(driver, this);

	}
	
	
	public HomePage Login() {

		try {
			Thread.sleep(1500);
			email.sendKeys("abc@abc.com");
			pwd.sendKeys("xxxxxx");
			submt.click();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return new HomePage();


	}

	

}
