package paral;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParalleMethods {
	
	@Test
	public void chromeBrowser() {
		String url = "https://opensource-demo.orangehrmlive.com/";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		System.out.println("Browser Launched");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		System.out.println("Browser Maximized");
	}
	
	@Test
	public void firefoxBrowser() {
		String url = "https://opensource-demo.orangehrmlive.com/";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		System.out.println("Browser Launched");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		System.out.println("Browser Maximized");
	}

}
