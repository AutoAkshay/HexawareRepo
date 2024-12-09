package session29_TestNGAnnotations;

import org.testng.annotations.*;

public class TestCase1 {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("BeforeSuite..");
	}
	
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeTest...");
	}	

	@BeforeClass
	public void beforeClass() {
		System.out.println("This is Before Class");
	}
	
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is Before method");
	}
	
	@Test
	public void test1() {
		System.out.println("This is test1");
	}
	
	@Test
	public void test2() {
		System.out.println("This is test2");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("This is After method..\n");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("This is After Class..\n");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("AfterTest...");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("AfterSuite..");
	}
	
}
