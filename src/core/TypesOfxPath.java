package core;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TypesOfxPath {

	public static void main(String[] args) {
		
		String url = "https://opensource-demo.orangehrmlive.com/";
		
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		Text
		driver.findElement(By.xpath("//*[text()='Login']")).isDisplayed();
		System.out.println("Login Page Displayed");
		
//		Contains
		driver.findElement(By.xpath("//*[contains(text(),'User')]")).isDisplayed();
		System.out.println("UserName Field Displayed");
		
//		Following 
		driver.findElement(By.xpath("//*[@type='submit']/following::div[1]/p")).click();
		
//		Indexing
//		(//*[text()='Dashboard'])[2]
		
//		Preceding
		driver.findElement(By.xpath("//*[text()='Performance']/preceding::li[1]")).click();
		
//		And
		//*[@id='day' and @title='Day']
		
		

	}

}
