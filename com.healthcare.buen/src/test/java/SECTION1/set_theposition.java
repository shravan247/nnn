package SECTION1;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class set_theposition {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new FirefoxDriver();
driver.get("https://www.hdfcbank.com/");
driver.manage().window().maximize();
Thread.sleep(3000);
driver.manage().window().setPosition(new Point(200, 300));
Thread.sleep(3000);
driver.quit();
	}

}
