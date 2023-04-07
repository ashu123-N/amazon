package com.amazon.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.amazon.base.TestBase;

public class Loginpage extends TestBase {

	By singInLink = By.xpath("//*[@id=\"nav-link-accountList-1\"]");
	By email = By.name("email");
	By continueBtn = By.xpath("//*[@id=\"continue\"]");
	By password = By.name("password");
	By signInBtn = By.id("signInsubmit");
	WebDriver wait = new WebDriverwait(driver,Duration.ofSeconds(10));
	boolean actResult = true; 
	try {
		wait.until(ExpectatedConditions.visiblityOfElementLocated(By.xpath(""));
	}catch(TimeoutException te) {
		actResult false;
	}

	public void validateLogin(String uname, String string) {
		driver.findElement(singInLink).click();
		wait(2000);
		driver.findElement(email).sendKeys("aswani.nukanaboina@gmail.com");

		driver.findElement(continueBtn).click();

		wait(2000);
		driver.findElement(password).sendKeys("aswani@123");
		driver.findElement(continueBtn);
	}

}
