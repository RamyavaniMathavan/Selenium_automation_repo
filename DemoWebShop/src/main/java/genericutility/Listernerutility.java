package genericutility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

public class Listernerutility extends BaseClass implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
				test=ereports.createTest(result.getName());
				test.log(Status.INFO, "test execution started");
				}

	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "test script is failed");
	TakesScreenshot ts = (TakesScreenshot) driver;
	test.addScreenCaptureFromBase64String(ts.getScreenshotAs(OutputType.BASE64));
	
	try {
		wUtil.getphoto(driver);
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	}
	}


 