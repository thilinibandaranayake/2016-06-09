package com.Tests;


import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Signin {

	
static	WebDriver driver = new FirefoxDriver();
	
	@BeforeClass
		public static void start() {
		
		driver.get("https://www.expedia.com/Flights");
		
	}
	
	@Test 
	
	public void clickon(){
		WebElement accBtn = driver.findElement(By.xpath(".//*[@id='header-account-menu']/span"));
		accBtn.click();
		
		WebElement regBtn = driver.findElement(By.xpath(".//*[@id='header-account-register']"));
		regBtn.click();
	}
	@Test
	public void myTest() {
		
		WebElement name = driver.findElement(By.xpath(".//*[@id='create-account-firstname']"));
		name.sendKeys("Test");
		
		
		WebElement lname = driver.findElement(By.xpath(".//*[@id='create-account-lastname']"));
		lname.sendKeys("Test");
		
		WebElement email = driver.findElement(By.xpath(".//*[@id='create-account-emailId']']"));
		email.sendKeys("Test");
		
		
		WebElement paswd = driver.findElement(By.xpath(".//*[@id='create-account-password']"));
		paswd.sendKeys("Test");
		
		WebElement conpaswd = driver.findElement(By.xpath(".//*[@id='create-account-confirm-password']"));
		conpaswd.sendKeys("Test");
		
		WebElement createaccbtn = driver.findElement(By.xpath(".//*[@id='create-account-submit-button']"));
		createaccbtn.click();
	}
}
