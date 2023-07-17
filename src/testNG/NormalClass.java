package testNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NormalClass {

//	public static void main(String[] args) {
//		String url = "https://demo.guru99.com/test/newtours/register.php";
//
//		WebDriver driver = new ChromeDriver();
//		driver.get(url);
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		System.out.println("Browser Launched");
//
//	}
	
	@Test
	public void browserLaunch() {
		String url = "https://demo.guru99.com/test/newtours/register.php";

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Browser Launched");
	}

}
