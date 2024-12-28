package generic;

import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseTest extends utilityTest {
	public static ExtentReports extentReports;
	public static ExtentSparkReporter extentSparkReporter;
	public static ExtentTest extentTest;

	@BeforeSuite
	public void initializeExtentReport() throws Exception {
		ExtentSparkReporter sparkReports = new ExtentSparkReporter("testcase.html");
		extentReports = new ExtentReports();
		extentReports.attachReporter(sparkReports);
		// to open automatically
		// Desktop.getDesktop().browse(new File("testcase.html").toURI());
	}

	@Parameters("browser")

	@BeforeTest
	// ITestContext context = is to get the test name from .xml file
	public void connectDatabase(ITestContext context, String br) {
		if (br.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		} else if (br.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		} else {
			System.out.println("incorrect browser");
		}
		//create test and inside argument add test name
		extentTest = extentReports.createTest(context.getName());

		// to add author, os, s/m config
		Capabilities capabilities = ((RemoteWebDriver) driver).getCapabilities();
		String device = capabilities.getBrowserName() + " " + capabilities.getBrowserVersion();
		String author = context.getCurrentXmlTest().getParameter("author");
		extentTest.assignAuthor(author);
		extentTest.assignDevice(device);
	}

	@BeforeClass
	public void openBrowser() {

	}

	@BeforeMethod
	public void methods() {

	}

	@AfterMethod
	public void checkstatus(Method m, ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			// when test fails takescreenshot
			String screenshotpath = null;
			screenshotpath = takeSSS(
					result.getTestContext().getName() + "_" + result.getMethod().getMethodName() + ".png");
			extentTest.addScreenCaptureFromPath(screenshotpath);
			extentTest.fail(result.getThrowable());
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			extentTest.pass(m.getName() + " is passed");
		}
	}

	@AfterClass
	public void close() {
		driver.quit();
	}

	@AfterTest
	public void disconnectDatabase() {
		Reporter.log("disconnect data base", true);

	}

	@AfterSuite
	public void generateExtentReport() {
		extentReports.flush();
	}

}