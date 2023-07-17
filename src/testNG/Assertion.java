package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assertion {

	WebDriver driver;

	@Test 
	public void login() {
		String actualTitle = "OrangeHRM123";
		
		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys("Admin");

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");

		WebElement clickOnLogin = driver.findElement(By.xpath("//*[@type='submit']"));
		clickOnLogin.click();
		
//		WebElement dashBoard = driver.findElement(By.xpath("(//*[text()='Dashboard'])[2]"));
//		dashBoard.isDisplayed();
		
		String expectedTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle, "Title is not matched");

		System.out.println("Displayed - Page");
	}
	
	@BeforeTest
	public void beforeMethod() {
		String url = "https://opensource-demo.orangehrmlive.com/";

		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		System.out.println("Browser Launched");
		System.out.println("BeforeMethod");
	}

	@AfterTest
	public void afterMethod() {
		driver.quit();
		System.out.println("AfterMethod");
	}


}
