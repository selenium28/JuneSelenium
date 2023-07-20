package para;

import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;

public class LoginDataProvider {

	@Test(dataProvider = "testData")
	public void loginTestCase(String user, String pass) {
		String url = "https://opensource-demo.orangehrmlive.com/";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		System.out.println("Browser Launched");
		driver.manage().window().maximize();
		System.out.println("Browser Maximized");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement userName = driver.findElement(By.name("username"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(userName));
		userName.sendKeys(user);
		
		WebElement password = driver.findElement(By.name("password"));
		wait.until(ExpectedConditions.visibilityOf(password));
		password.sendKeys(pass);
		
		WebElement clickOnLogin = driver.findElement(By.xpath("//*[@type='submit']"));
		
		clickOnLogin.click();
		
	}

	@DataProvider
	public Object[][] testData() {
		Object[][] data = new Object[3][2];

		data[0][0] = "Admin";
		data[0][1] = "admin123";	

		data[1][0] = "Adasd";
		data[1][1] = "admin123";

		data[2][0] = "Admin";
		data[2][1] = "adminhgfd";

		return data;
	}
}
