package com.twirll.test;

import com.twirll.pages.HomePage;
import com.twirll.pages.LoginPage;
import com.twirll.pages.TwirllTakeAwayOrder;
import com.twirll.utill.TestSetup;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class TwirllTakeAwayOrderTest extends TestSetup{
	
	LoginPage loginPage;
	SoftAssert assrt;
	HomePage homepage;
	TwirllTakeAwayOrder twirllTakeAwayOrder;
	
	@BeforeMethod
	public void setup() {
		loginPage = new LoginPage();
		assrt = new SoftAssert();
		twirllTakeAwayOrder = new TwirllTakeAwayOrder();
	}
	
	
	@Test
	public void TestTakeAwayOrder() throws Exception {
		
		Thread.sleep(8000);
		
		twirllTakeAwayOrder.takeAway.click();
		
		
	}
	
	
}
