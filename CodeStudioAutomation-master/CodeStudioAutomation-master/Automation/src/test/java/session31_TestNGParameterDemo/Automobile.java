package session31_TestNGParameterDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Automobile {
	
	@Parameters({"Automobile"})
	@Test
	public void testCase1(String name) {
		System.out.println("Company name of Automobile::"+name);
	}

}
