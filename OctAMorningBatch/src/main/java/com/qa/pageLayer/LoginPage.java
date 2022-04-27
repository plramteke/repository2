package com.qa.pageLayer;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class LoginPage extends TestBase  {

	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='login']")
	private WebElement Signin;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@id='passwd']")
	private WebElement password;
	
	@FindBy(xpath="//i[@class='icon-lock left']")
	private WebElement enter;


public void signin() {
	Signin.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	email.sendKeys("plramteke17@gmail.com");
	password.sendKeys("prashaant");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	enter.click();
}
}
