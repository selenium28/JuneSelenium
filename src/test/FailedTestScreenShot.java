package test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class FailedTestScreenShot {
	WebDriver driver;

	@Test
	public void failedTestPage() {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		System.out.println("Browser has been Launched");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		driver.findElement(By.id("abcd")).click();
	}

	@AfterMethod
	public void captureScreenShot(ITestResult result) throws IOException {

		if (ITestResult.FAILURE==result.getStatus()) {
			try {
				TakesScreenshot ts = (TakesScreenshot) driver;

				File scr = ts.getScreenshotAs(OutputType.FILE);
				File trg = new File("ScreenShot/"+result.getName()+".png");
				FileHandler.copy(scr, trg);
				System.out.println("Successfully captured a screenshot");
			} catch (Exception e) {
				System.out.println("Exception while taking the screenshot" +e.getStackTrace());
			}

		}
		driver.close();
	}

	}
