package com.pack.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects 
{

	public static WebElement element = null;
	
	public static WebElement userName(WebDriver driver)
	{
		element = driver.findElement(By.id("log"));
		return element;
	}
	
	public static WebElement passWord(WebDriver driver)
	{
		element = driver.findElement(By.id("pwd"));
		return element;
	}
	
	public static WebElement btn_login(WebDriver driver)
	{
		element = driver.findElement(By.id("login"));
		return element;
	}
}
