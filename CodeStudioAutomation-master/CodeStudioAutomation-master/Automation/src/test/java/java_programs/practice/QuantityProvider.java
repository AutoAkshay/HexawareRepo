package java_programs.practice;

import org.testng.annotations.DataProvider;

public class QuantityProvider {
	
	@DataProvider(name="quantity")
	public Object[] quantity() {
		
		Object[] quantity= {"5"};
		return quantity;
	}
}


