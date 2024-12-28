package SECTION1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Automate_IRCTC {

	public static void main(String[] args) throws InterruptedException {
		//firefox browser
		WebDriver driver=new FirefoxDriver();
		//wait for 2sec
		Thread.sleep(2000);
		//maximize the browser
		driver.manage().window().maximize();
		//minimize the browser
		driver.manage().window().minimize();
		//maximize the browser
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//Access IRCTC application
		driver.get("https://www.irctc.co.in/nget/");

	}

}
