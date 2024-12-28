package SECTION2;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class takeScreenShotofentirewebpage {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.amazon.in/");
		//type casting
		TakesScreenshot ts=(TakesScreenshot)driver;
		//store it inside java
		File source=ts.getScreenshotAs(OutputType.FILE);
		//store in the folder
		File dest=new File("./Screenshot/"+"homepage"+".png");
		//copy the image
		Files.copy(source, dest);
	}

}
