package include;

import org.testng.annotations.Test;

public class GroupsConcepts {

	String username = "admin";
	
	  @Test (groups = {"smoke"})
	  public void smokeTestOne() {
		  System.out.println("smokeTestOne");
	  }
	  
	  @Test (groups = {"smoke"})
	  public void smokeTestTwo() {
		  System.out.println("smokeTestTwo");
	  }
	  
	  @Test (groups = {"smoke"})
	  public void smokeTestThree() {
		  System.out.println("smokeTestThree");
	  }
	  
	  @Test (groups = {"regression"})
	  public void regressionTestThree() {
		  System.out.println("regressionTestThree");
	  }
	  
	  @Test (groups = {"regression"})
	  public void regressionTestTwo() {
		  System.out.println("regressionTestTwo");
	  }
	  
	  @Test (groups = {"regression"})
	  public void regressionTestOne() {
		  System.out.println("regressionTestOne");
	  }

}
