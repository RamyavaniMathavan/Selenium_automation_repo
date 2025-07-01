package genericutility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import objectrepository.Homepage;
import objectrepository.Loginpage;
import objectrepository.Welcomepage;

public class BaseClass {
	public static ExtentReports ereports;
	public static WebDriver driver;
	public static ExtentTest test;
	
	public javautility jutil = new javautility();
	public FileUtility futil = new FileUtility();
	public webDriverutility wUtil = new webDriverutility();

	@BeforeSuite
	public void reportconfig() {
		ExtentSparkReporter spark = new ExtentSparkReporter(
				"./HTML_reports/ExtentReport_" + jutil.getsystemTime() + ".png");
		ereports = new ExtentReports();
		ereports.attachReporter(spark);
	}

	@BeforeClass
	public void openBrowser() throws IOException {
		driver = new ChromeDriver();
		wUtil.maximize(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get(futil.getDatafromProperty("url"));
	}

	@BeforeMethod
	public void login() throws IOException {
		Welcomepage wp = new Welcomepage(driver);
		wp.getLoginlink().click();

		Loginpage lp = new Loginpage(driver);
		lp.getUsernameTF().sendKeys(futil.getDatafromProperty("email"));
		lp.getPasswordTf().sendKeys(futil.getDatafromProperty("password"));
		lp.getLoginlinkbutton().click();
	}

	@AfterMethod
	public void logOut() {
		Homepage hp = new Homepage(driver);
		hp.getLogoutlink().click();
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

	@AfterSuite
	public void reportBackup() {
		ereports.flush();

	}

}
