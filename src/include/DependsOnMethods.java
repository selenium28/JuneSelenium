package include;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DependsOnMethods {
	WebDriver driver;

	@Test (dependsOnMethods = {"browserLaunch"})
	public void login() {
		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys("Admin");

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");

		WebElement clickOnLogin = driver.findElement(By.xpath("//*[@type='1234']"));
		clickOnLogin.click();
	}

	@Test (dependsOnMethods = {"login"})
	public void dashboard() {
		WebElement dashBoard = driver.findElement(By.xpath("(//*[text()='Dashboard'])[2]"));
		dashBoard.isDisplayed();

		System.out.println("Displayed - Page");
	}

	@Test 
	public void browserLaunch() {
		String url = "https://opensource-demo.orangehrmlive.com/";

		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		System.out.println("Browser Launched");
		System.out.println("BeforeMethod");
	}

}
