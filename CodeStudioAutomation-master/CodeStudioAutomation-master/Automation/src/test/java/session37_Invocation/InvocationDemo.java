package session37_Invocation;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class InvocationDemo {
	
	@Test(invocationCount = 5)
	public void demo(ITestContext context) {
		int currentInvocationCount=	context.getAllTestMethods()[0].getCurrentInvocationCount();
		System.out.println("Executin::"+currentInvocationCount);
		System.out.println("demo tc result...!!");
	}
	
	@Test(invocationCount = 3)
	public void demo2(ITestContext context) {
		int currentInvocationCount=	context.getAllTestMethods()[1].getCurrentInvocationCount();
		System.out.println("Executin::"+currentInvocationCount);
		System.out.println("demo 2 tc result...!!");
	}

}
