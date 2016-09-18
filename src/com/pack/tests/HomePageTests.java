package com.pack.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.pack.pageObjects.HomePageObjects;
import com.pack.pageObjects.LoginPageObjects;

public class HomePageTests extends BaseClass{

	//public static WebDriver driver = null;

	/*@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gahlaut\\Desktop\\Work\\CMS_Automation\\lib\\chromedriver_win\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://store.demoqa.com/");
	}*/

	@Test
	public void verifyLogin() {
		HomePageObjects.myAccount(driver).click();
		driver.manage().timeouts().implicitlyWait(4L, TimeUnit.SECONDS);
		LoginPageObjects.userName(driver).sendKeys("vikas_user");
		LoginPageObjects.passWord(driver).sendKeys("tE0X!4i&34ll7r8t");
		LoginPageObjects.btn_login(driver).click();

		String title = driver.getTitle();
		System.out.println("Title of page is : " + title);

		try {
			Assert.assertEquals(title, "Your Account | ONLINE STORE");
		} catch (Exception e) {
		}
	}
	
	@Test
	public void verifyLogout()
	{
		driver.manage().timeouts().implicitlyWait(4L, TimeUnit.SECONDS);
		HomePageObjects.logOut(driver).click();
		
	}
	
	/*@AfterTest
	public void kill()
	{
		driver.quit();
	}*/
}
