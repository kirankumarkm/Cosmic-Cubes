package com.cosmic.cubes.test.regression;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cosmic.cubes.UI.LoginPage;
import com.cosmic.cubes.utils.projectspecific.CreateDriver;

//Step 1
public class TestLoginSC_01

{
	//step2
	WebDriver driver;
	//step3
	LoginPage login;
	
	//step 4
	@BeforeMethod
	public void setUp()
	{
		driver =CreateDriver.getDriver();
		login = new LoginPage(driver);
	}
	//step 5
	@Test
	public void testInvalidLoginTC_05()
	{
		login.waitForLoginPage();
		login.getUserNameTextbox().sendKeys("admin");
		login.getPasswordTextbox().sendKeys("dkk");
		login.getLoginButton().click();
		
		String actualErrorMsg = login.getErrorMessageText().getText();
		String expectedErrorMsg = "Username or Password is invalid. Please try again.";
		Assert.assertEquals(actualErrorMsg, expectedErrorMsg);
	}
	//step 6
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
}
