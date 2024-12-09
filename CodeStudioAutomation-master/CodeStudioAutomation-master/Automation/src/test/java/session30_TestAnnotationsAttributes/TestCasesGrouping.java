package session30_TestAnnotationsAttributes;

import org.testng.annotations.Test;

public class TestCasesGrouping {
	
	@Test(groups = "Software")
	public void infosys() {
		System.out.println("infosys....");
	}
	
	@Test(groups = "Software")
	public void wipro() {
		System.out.println("wipro....");
	}
	
	@Test(groups = "Automobile")
	public void maruti() {
		System.out.println("maruti....");
	}
	
	@Test(groups = "Automobile")
	public void tata() {
		System.out.println("tata....");
	}
	
	@Test(groups = "Medicine")
	public void glenMark() {
		System.out.println("glenMark....");
	}
	
	@Test(groups = "Medicine")
	public void cipla() {
		System.out.println("Cipla....");
	}

}
