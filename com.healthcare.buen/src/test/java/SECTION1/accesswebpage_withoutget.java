package SECTION1;


import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class accesswebpage_withoutget {

	public static void main(String[] args) throws Throwable {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.navigate().to("https://www.amazon.in/");

URL url=new URL("https://www.flipkart.com/");
driver.navigate().to(url);
driver.quit();
	}

}
