package SECTION1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate_back_forward_refresh {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.in/");
driver.get("https://www.youtube.com/");
driver.navigate().back();
Thread.sleep(2000);
driver.navigate().forward();
driver.navigate().refresh();
driver.quit();
	}

}
