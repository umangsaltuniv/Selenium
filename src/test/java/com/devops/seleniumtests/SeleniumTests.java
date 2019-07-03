package com.devops.seleniumtests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTests {
	
	WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {		
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://newtours.demoaut.com/");
	}
	
	@Test
	public void login() throws Exception {		
	driver.findElement(By.name("userName")).sendKeys("mercury");
	driver.findElement(By.name("password")).sendKeys("mercury");
	driver.findElement(By.name("login")).click();
	Thread.sleep(3000);
	assertEquals(driver.getTitle(), "Find a Flight: Mercury Tours:");
  }
  
  
  @AfterTest
  public void afterTest() {
	  driver.close();
  }
  
  
  
}
