package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
//		WebDriver - Interface
//		driver - Reference Variable
//		New - Keyword
//		ChromeDriver() - Constructor
//		new ChromeDriver(); - Object
		
//		WebDriver driver = new ChromeDriver();  
//		WebDriver driver2 = new WebDriver(); We can't create object of interface
		ChromeDriver driver3 = new ChromeDriver();  // 

        driver3.get("https://selenium.dev");

        driver3.quit();
        

	}

}
