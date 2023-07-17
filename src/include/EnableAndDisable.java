package include;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class EnableAndDisable {
	
  @Test(priority = 1, enabled = true)
  public void smokeTestOne() {
	  System.out.println("smokeTestOne");
  }
  
  @Test(priority = -2, enabled = true)
  public void smokeTestTwo() {
	  System.out.println("smokeTestTwo");
  }
  
  @Test(priority = 3, enabled = true)
  public void smokeTestThree() {
	  System.out.println("smokeTestThree");
  }
  
  @Test(enabled = false)
  public void regressionTestThree() {
	  System.out.println("regressionTestThree");
  }
  
  @Test(enabled = false)
  public void regressionTestTwo() {
	  System.out.println("regressionTestTwo");
  }
  
  @Test(enabled = false)
  public void regressionTestOne() {
	  System.out.println("regressionTestOne");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod");
  }

}
