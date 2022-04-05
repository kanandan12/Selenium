package leaf.Lead;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class CreateHtmlFile {

	public static void main(String[] args) throws IOException {
				
		ExtentHtmlReporter html = new ExtentHtmlReporter("./reports/result.html");
		html.setAppendExisting(false);
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(html);
		
		ExtentTest test = extent.createTest("tc001_CreateLead", "Create new lead in test leaf");
		test.assignCategory("Smoke Testing");
		test.assignAuthor("Kamalakannan Anandan");
		test.pass("The Data DemoTestManager Entered Successfully", MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img1.png").build());
		test.pass("The Data CRMF Entered Successfully", MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img2.png").build());
		test.pass("The Button Login Clicked Successfully", MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img3.png").build());
		extent.flush();

	}

}
