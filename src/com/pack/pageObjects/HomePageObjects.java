package com.pack.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pack.tests.BaseClass;

public class HomePageObjects extends BaseClass
{

	public static WebElement element = null;
	
	public static WebElement myAccount(WebDriver driver)
	{
		element  = driver.findElement(By.id("account"));
		return element;
	}
	
	public static WebElement logOut(WebDriver driver)
	{
		element = driver.findElement(By.id("account_logout"));
		return element;
	}
	
}
