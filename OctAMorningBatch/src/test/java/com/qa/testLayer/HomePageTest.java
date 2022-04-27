package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.pageLayer.HomePage;
import com.qa.pageLayer.LoginPage;
import com.qa.testBase.TestBase;

public class HomePageTest extends TestBase {

	HomePage h;
	LoginPage l;
	@Test
	public void searchProductTest()
	{
		h = new HomePage();
		h.enterTextInSearchBox();
		l = new LoginPage();
		l.signin();
	}
	
	
}
