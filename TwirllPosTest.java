package com.twirll.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.twirll.pages.HomePage;
import com.twirll.pages.LoginPage;
import com.twirll.pages.TwirllPos;
//import com.twirll.pages.TwirllPosTakeAway;
import com.twirll.utill.TestSetup;

public class TwirllPosTest extends TestSetup {

	LoginPage loginPage;
	SoftAssert assrt;
	HomePage homePage;
	TwirllPos twirllPos;
//	TwirllPosTakeAway twirllPosTakeAway;


	@BeforeMethod
	public void setup(){
		loginPage = new LoginPage();
		assrt = new SoftAssert();
		twirllPos = new TwirllPos();
		homePage =	loginPage.Login();
	}
	
	
	@Test
	public void TestPos() throws Exception  {
		
		Thread.sleep(8000);
		
		twirllPos.dineIn.click();
		
		twirllPos.tabelNo.click();
		
//		twirllPos.personNo.click();
		
		twirllPos.confirmPerson.click();
		
		twirllPos.firstItem.click();
		
		twirllPos.secondItem.click();
		
		twirllPos.eftPosPayment.click();
		
		
		
	}




}
