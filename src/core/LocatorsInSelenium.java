package core;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsInSelenium {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		1. By ID
		driver.findElement(By.id("username")).sendKeys("student");
		
//		2. Name
		driver.findElement(By.name("username")).sendKeys("Password123");
		
//		3. Link Text
		driver.findElement(By.xpath("//*[text()='Home']")).click();
		
//		4. Partial LinkText
		driver.findElement(By.partialLinkText("Ho")).click();
		
//		5. Tag Name
		driver.findElement(By.tagName("a")).click();
		
//		6. ClassName
		driver.findElement(By.className("btn")).click();
		
//		7. xPath
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("student");
		
//		8. cSS Selector
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("Password123");
		
	}

}
