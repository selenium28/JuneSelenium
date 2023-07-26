package window;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandle {
	
	@Test
	public void windowHandle() {
		String url = "https://demo.guru99.com/popup.php";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		System.out.println("Browser Launched");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		System.out.println("Browser Maximized");
		
		driver.findElement(By.xpath("//*[text()='Click Here']")).click();
		
		String mainWindowHandle = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		
		Iterator<String> iterator = allWindowHandles.iterator();
		
		while (iterator.hasNext()) {
			String childWindow = iterator.next();
			if ( !mainWindowHandle.equalsIgnoreCase(childWindow)) {
				driver.switchTo().window(childWindow);
				driver.findElement(By.name("emailid")).sendKeys("ABCD");			
				
			}
		}
		
	}

}
