package SECTION1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class to_getTitle {

	public static void main(String[] args) {
 WebDriver driver=new FirefoxDriver();
 driver.manage().window().maximize();
 driver.get("https://www.yatra.com/");
 String title= driver.getTitle();
 System.out.println(title);
 driver.quit();
	}

}
