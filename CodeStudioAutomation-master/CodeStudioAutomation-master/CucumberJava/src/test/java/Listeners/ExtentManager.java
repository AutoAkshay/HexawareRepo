package Listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
	
	public static ExtentReports reports;
	public static ExtentReports getReports() {
		
		ExtentSparkReporter spark=new ExtentSparkReporter("Marketplace.html");
		
		if(reports==null) {
		reports=new ExtentReports();
		reports.attachReporter(spark);
		
		reports.setSystemInfo("Machine", "MacBook");
		reports.setSystemInfo("Tester", "Akshay");
		reports.setSystemInfo("Operating System", "MacOS");
		reports.setSystemInfo("Browser", "Chrome");
		}
		return reports;
	}

}
