package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownInSelenium {
//	Three methods for dropdowns
//	1. Index, 2. Value, 3.VisibleText
	WebDriver driver;

	public static void main(String[] args) {
		DropDownInSelenium obj = new DropDownInSelenium();
		obj.browserLaunch();
		obj.dropdown();
		obj.browserClose();

	}
	
	public void browserLaunch() {
		String url = "https://demo.guru99.com/test/newtours/register.php";

		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Browser Launched");
	}
	
	public void dropdown() {
		WebElement countryDropDown = driver.findElement(By.name("country"));
		Select country = new Select(countryDropDown);
		country.selectByIndex(12);
//		country.selectByValue("CANADA");
//		country.selectByVisibleText("INDIA"); 
	}
	
	public void browserClose() {
//		driver.quit();
	}

}
