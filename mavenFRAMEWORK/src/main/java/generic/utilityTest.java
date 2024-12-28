package generic;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class utilityTest extends readExcel implements frameworkConstraints {

	public static WebDriver driver;
	String foldername;

	public void takeSS(String filename) {
		if (foldername == null) {
			LocalDateTime dt = LocalDateTime.now();
			DateTimeFormatter form = DateTimeFormatter.ofPattern("dd-MM-yy-hh-mm-ss");
			foldername = dt.format(form);
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File(screen_shot + foldername + "/" + filename);
			try {
				FileUtils.copyFile(source, dest);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static String takeSSS(String filename) {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(screen_shot + filename);
		try {
			FileUtils.copyFile(source, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return dest.getAbsolutePath();
	}

	public void getCurrentUrl() {
		String url = driver.getCurrentUrl();
	}

}
