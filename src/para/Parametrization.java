package para;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametrization {
	String url = "https://opensource-demo.orangehrmlive.com/";
	WebDriver driver;
//	TestNG Parameter
//	@Parameters pass the Parameter is just for once per execution
//	TestNG DataProvider
	
//	String browser = "firefox";
	@Parameters("browser")
	@Test 
	public void browserLaunch(String browser) {
	
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	}
	
	

}
