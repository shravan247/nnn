package SECTION1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automate_Amazon {

	public static void main(String[] args) throws InterruptedException {
		
        //open chrome browser
		WebDriver driver=new ChromeDriver();
		
		//wait for 2 seconds
		Thread.sleep(2000);
		//maximize the browser
		driver.manage().window().maximize();
		//wait for 2 seconds
				Thread.sleep(2000);
	    //Access amazon application
				driver.get("https://www.amazon.in/");
		
	}

}
