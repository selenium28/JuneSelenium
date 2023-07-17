package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaits {

	public static void main(String[] args) {
		
		String url = "https://demo.guru99.com/test/newtours/register.php";

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		System.out.println("Browser Launched");	
		
//		Selenium Waits 
//		1. Implicit Wait
//		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		
//		2. Explicit Wait
		WebElement countryDropDown = driver.findElement(By.name("country"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(countryDropDown));
		wait.until(ExpectedConditions.elementToBeClickable(countryDropDown));
		wait.until(ExpectedConditions.titleContains("Register: Mercury Tours"));
		wait.until(ExpectedConditions.urlContains(""));
		
		Select country = new Select(countryDropDown);
		country.selectByIndex(12);
		
//		Fluent Wait is used to tell the Webdriver to wait for certain conditions as well as the 
//		frequency with which we want to check the condition before throwing an "NoAlertPresentException" exception.
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
			.withTimeout(Duration.ofSeconds(30))
			.pollingEvery(Duration.ofSeconds(1))
			.ignoring(NoAlertPresentException.class);

	}

}
