package paral;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SecondPara {

	@Test
	public void secondBrowserLaunch() {
		String url = "https://opensource-demo.orangehrmlive.com/";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		System.out.println("Browser Launched");
		driver.manage().window().maximize();
		System.out.println("Browser Maximized");
		
		WebElement userName = driver.findElement(By.name("username"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(userName));
		userName.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.name("password"));
		wait.until(ExpectedConditions.visibilityOf(password));
		password.sendKeys("admin123");
		
		WebElement clickOnLogin = driver.findElement(By.xpath("//*[@type='submit']"));
		clickOnLogin.click();
		
	}

}
