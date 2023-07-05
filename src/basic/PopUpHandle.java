package basic;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpHandle {
	
//	Alert: Alert is a small message box which appear on screen 
//	to give the user some information or notification.
//	Alert: Interface in Selenium

	public static void main(String[] args) {
		String url = "https://demo.guru99.com/test/delete_customer.php";

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Browser Launched");
		
		WebElement customerID = driver.findElement(By.name("cusid"));
		customerID.clear();
		customerID.sendKeys("5643");
		
		WebElement submitButton = driver.findElement(By.xpath("//*[@name='submit']"));
		submitButton.isDisplayed();
		submitButton.click();
		
		Alert alert = driver.switchTo().alert();
		String validationMessage = alert.getText();
		System.out.println(validationMessage);
		alert.accept();
//		alert.dismiss();

	}

}
