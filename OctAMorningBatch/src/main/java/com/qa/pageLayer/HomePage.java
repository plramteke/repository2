package com.qa.pageLayer;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class HomePage extends TestBase {

	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"search_query_top\"]")
	private WebElement search_box;
	
	public void enterTextInSearchBox()
	{
		search_box.sendKeys("Printed Dress");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		search_box.sendKeys(Keys.ENTER);
	}
}
