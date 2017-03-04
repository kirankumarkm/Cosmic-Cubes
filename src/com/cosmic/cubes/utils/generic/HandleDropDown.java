package com.cosmic.cubes.utils.generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown 
{
	public static void selectDDLByIndex(WebElement ddl, int index)
	{
		Select sct = new Select(ddl);
		sct.selectByIndex(index);
	}
	public static void selectDDLByValue(WebElement ddl, String value)
	{
		Select sct = new Select(ddl);
		sct.selectByValue(value);
	}
	public static void selectDDLByVisibleText(WebElement ddl, String text)
	{
		Select sct = new Select(ddl);
		sct.selectByVisibleText(text);
	}
	
	//Verify Drop down is multi or single Select
	public static boolean verifyDropDown(WebElement ddl)
	{
		Select sct = new Select(ddl);
		boolean status = sct.isMultiple();
		return status;
	}
	public static void deSelectAllOptions(WebElement ddl)
	{
		Select sct = new Select(ddl);
		try
		{
			sct.deselectAll();
		}
		catch(Exception e)
		{
			System.out.println("Invalid Operation");
		}
	}
	
	public static void deSelectDDLByIndex(WebElement ddl, int index)
	{
		Select sct = new Select(ddl);
		try
		{
			sct.deselectByIndex(index);
		}
		catch(Exception e)
		{
			System.out.println("Invalid Operation");
		}
	}
	

}
