package screen;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class FailedTestCase {

	WebDriver driver;

	@Test
	public void screenshot() {
		String url = "https://opensource-demo.orangehrmlive.com/";

		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println("Browser Launched");

		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys("Admin");

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");

		WebElement clickOnLogin = driver.findElement(By.xpath("//*[@type='submit']"));
		clickOnLogin.click();

		WebElement dashboard = driver.findElement(By.xpath("//*[@type='abfsd']"));
		dashboard.click();

	}

	@AfterMethod
	public void caturedFailedTestCase(ITestResult result) {

		if (ITestResult.FAILURE==result.getStatus()) {
			try {
				TakesScreenshot ts = (TakesScreenshot) driver;

				File scr = ts.getScreenshotAs(OutputType.FILE);
				File dest = new File("File/"+result.getName()+".png");
				FileHandler.copy(scr, dest);
				System.out.println("Test Case failed & Screenshot captured");
			} catch (IOException e1) {
				e1.printStackTrace();
				System.out.println("Test Case passed");
			}	
		}
		driver.close();
	}

}
