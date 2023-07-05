package core;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadingSelenium {

	public static void main(String[] args) {
		String url = "http://demo.guru99.com/test/upload/";
		String filePath = "C:\\Users\\devid\\Documents\\New Text Document.txt";

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Browser Launched");
		
		WebElement chooseFile_Path = driver.findElement(By.id("uploadfile_0"));
		chooseFile_Path.isDisplayed();
		chooseFile_Path.sendKeys(filePath);
		
		WebElement terms_checkBox = driver.findElement(By.name("terms"));
		terms_checkBox.click();
		
		WebElement submit_Button = driver.findElement(By.xpath("//button[@type='button']"));
		submit_Button.click();
		System.out.println("Submit button clicked");
		
		WebElement verifySuccessfulMessage = driver.findElement(By.xpath("//*[text()='has been successfully uploaded.']"));
		verifySuccessfulMessage.isDisplayed();
		System.out.println("Verified 1 file has uploaded");
	}

}

// https://demo.guru99.com/test/delete_customer.php
// http://demo.guru99.com/test/upload/