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

public class LoginTest {
	WebDriver driver;

	@Test(priority = 1)
	public void login() {
		WebElement customerID = driver.findElement(By.name("cusid"));
		customerID.clear();
		customerID.sendKeys("5643");
//		System.out.println("Login - method");
		WebElement submitButton = driver.findElement(By.xpath("//*[@name='submit']"));
		submitButton.isDisplayed();
		submitButton.click();
		System.out.println("Entered Customor details");
	}

//	@Test(priority = 2)
	public void dashboard() {
		
	}

	@Test(priority = 3)
	public void cash() {
		Alert alert = driver.switchTo().alert();
		String validationMessage = alert.getText();
		System.out.println(validationMessage);
		alert.accept();
		System.out.println("Cash - method");
	}

	@BeforeTest
	public void beforeMethod() {
		String url = "https://demo.guru99.com/test/delete_customer.php";

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
