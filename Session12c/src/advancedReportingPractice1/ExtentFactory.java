package advancedReportingPractice1;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentFactory {
	public static ExtentReports getInstance() {
		ExtentReports report;
		String Path = "C://users//lynn.bierl//workspace//Session12c//multiple-test-case-report.html";
		report = new ExtentReports(Path, false);
		return report;
		
	}

}
