package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class LoginSceanrio {
	WebDriver driver;
	String actualTitle = "OrangeHRM";

	@Test(priority = 1)
	public void loginVaildUsername() {
		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		
		WebElement clickOnLogin = driver.findElement(By.xpath("//*[@type='submit']"));
		clickOnLogin.click();
		
		String expectedTitle = driver.getTitle();
		System.out.println("Expected Title: " +expectedTitle);
		
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Title matched and Test Passed");
		} else {
			System.out.println("Title not matched and Test not Passed");
		}
		
		System.out.println("loginVaildUsename");
	}

	@Test(priority = 2)
	public void dashBoard() {

		WebElement dashBoard = driver.findElement(By.xpath("(//*[text()='Dashboard'])[2]"));
		dashBoard.isDisplayed();
		
		System.out.println("Displayed - Page");
	}

	@Test(priority = 3)
	public void loginBank() {

		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys(" ");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys(" ");
		
		WebElement clickOnLogin = driver.findElement(By.xpath("//*[@type='submit']"));
		clickOnLogin.click();
		
		WebElement dashBoard = driver.findElement(By.xpath("(//*[text()='Dashboard'])[2]"));
		dashBoard.isDisplayed();
		
		System.out.println("Displayed - Page");
		
		System.out.println("loginBank - method");
	}

	@BeforeMethod
	public void beforeMethod() {
		String url = "https://opensource-demo.orangehrmlive.com/";

		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		System.out.println("Browser Launched");
		System.out.println("BeforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
		System.out.println("AfterMethod");
	}

}
