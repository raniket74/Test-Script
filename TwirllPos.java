package com.twirll.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.twirll.utill.TestSetup;

public class TwirllPos extends TestSetup{
	
	@FindBy(xpath = "//*[@id=\"elOrderHomePageOrderType8\"]")
	public WebElement dineIn; 
	
	@FindBy(xpath = "//*[@id=\"skuPanel\"]/div[3]/div")
	public WebElement firstItem;

	@FindBy(xpath = "//*[@id=\"skuPanel\"]/div[9]")
	public WebElement secondItem;
	
	@FindBy(xpath = "//*[@id=\"elCartFastCheckoutBtn\"]")
	public WebElement eftPosPayment;
	
	@FindBy(id = "seatname3218")
	public WebElement tabelNo;
	
//	@FindBy(xpath = "//*[@id=\"elCoversCountBtn2\"]")
//	public WebElement personNo;
	
	@FindBy(xpath = "//button[contains(text(),'Done')]")
	public WebElement confirmPerson;
	

	public TwirllPos() {
		PageFactory.initElements(driver, this);
	}

}

