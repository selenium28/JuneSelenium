package para;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Concept {
//	DataProvider returns a 2-dimensional object Array
	@DataProvider
	public Object[][] testData(){
		Object[][] data = new Object[3][3];
		
		data[0][0] = 10;
		data[0][1] = 100;
		data[0][2] = 100;
		
		data[1][0] = 3;
		data[1][1] = 23;
		data[1][2] = 23;
		
		data[2][0] = 34;
		data[2][1] = 12;
		
		return data; 
		
	}
	
//	testData - Attribute of a dataprovider
	@Test(dataProvider = "testData")
	public void loginTestCase(int a, int b) {
		System.out.println("a- "+a+ ": b- "+b);
	}

}
