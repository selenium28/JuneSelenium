package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropActions {

	public static void main(String[] args) {
		
		String url = "https://jqueryui.com/droppable/";

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Browser Launched");
		
		driver.switchTo().frame(0);
		
		WebElement sourceFile = driver.findElement(By.id("draggable"));
		WebElement destinationFile = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		action.clickAndHold(sourceFile).moveToElement(destinationFile).release().perform();
		System.out.println("Drag and Drop action performed");

	}

}
