package SECTION1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automate_makemytrip {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
Thread.sleep(2000);
driver.manage().window().maximize();
Thread.sleep(2000);
driver.manage().window().minimize();
Thread.sleep(2000);
driver.manage().window().maximize();
driver.get("https://www.makemytrip.com/");
Thread.sleep(2000);
//quit
driver.quit();
	}

}
