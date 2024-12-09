package session30_TestAnnotationsAttributes;

import org.testng.annotations.Test;

public class AnnotationAttribution {
	
	@Test(priority = 2,description = "This is test case 1",dependsOnMethods = "TestCase3")
	public void TestCase1() {
		System.out.println("webLogin Test Case....");
	}
	
	@Test(priority = 3,description = "This is test case 2")
	public void TestCase2() throws InterruptedException {
		
		Thread.sleep(400);
		System.out.println("Mobile Login Test Case....");
	}
	
	@Test(priority = 1,description = "This is test case 3",enabled = false)
	public void TestCase3() {
		System.out.println("API Login Test Case....");
	}

}
