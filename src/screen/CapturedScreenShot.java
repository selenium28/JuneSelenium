package screen;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class CapturedScreenShot {
	WebDriver driver;

	@Test
	public void screenshot() throws InterruptedException {
		String url = "https://opensource-demo.orangehrmlive.com/";

		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		System.out.println("Browser Launched");

		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileHandler.copy(screenshot, new File("File/screenShot.png"));
			System.out.println("Screenshot has been captured");
		} catch (IOException e) {
			System.out.println("Exception thrown");
			e.printStackTrace();	
		}
		
	}

}
