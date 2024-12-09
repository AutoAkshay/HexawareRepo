package session31_TestNGParameterDemo;


import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class TestNGParametersDemo {
	
	@org.testng.annotations.Parameters({"i","j"})
	@Test
	public void add(int a, int b) {
		System.out.println("Addition::"+(a+b));
	}
	
	@org.testng.annotations.Parameters({"i","j"})
	@Test
	public void substraction(int a, int b) {
		System.out.println("Substraction:"+(a-b));
	}
	
	@org.testng.annotations.Parameters({"i","j"})
	@Test
	public void multiplication(int a, int b) {
		System.out.println("Multplication:"+(a*b));
	}
}
