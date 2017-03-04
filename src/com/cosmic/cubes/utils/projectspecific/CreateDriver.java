package com.cosmic.cubes.utils.projectspecific;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.cosmic.cubes.utils.generic.GetData;

public class CreateDriver 
{

		public static WebDriver getDriver()
		{
			WebDriver driver = null;
			String browserName = GetData.fromExcel("tdata", "Configuration", 1, 0);
			String URL = GetData.fromExcel("tdata", "Configuration", 1, 1);
			if(browserName.equalsIgnoreCase("ff"))
			{
				System.setProperty("webdriver.firefox.marionette","./Browser_Servers/geckodriver.exe" );
				driver= new FirefoxDriver();
			}
			else if(browserName.equalsIgnoreCase("gc"))
			{
				System.setProperty("webdriver.chrome.driver ","./Browser_Servers/chromedriver.exe");
				driver= new ChromeDriver();
			}
			else
			{
				System.out.println("invalid browser name");
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get(URL);
			return driver;
			
		
		}
}
