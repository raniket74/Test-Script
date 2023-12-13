package com.twirll.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.twirll.utill.TestSetup;

public class TwirllTakeAwayOrder extends TestSetup{

	@FindBy(xpath = "//*[@id=\"elOrderHomePageOrderType7\"]")
	public WebElement takeAway;
	
	
	public TwirllTakeAwayOrder() {
		PageFactory.initElements(driver, this);
	}
		
}
