package SECTION1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment1 {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
Thread.sleep(2000);
driver.manage().window().maximize();
Thread.sleep(2000);
String title=driver.getTitle();
System.out.println(title);
String url=driver.getCurrentUrl();
System.out.println(url);
driver.manage().window().setSize(new Dimension(400, 200));
Thread.sleep(2000);
driver.manage().window().setPosition(new Point(200, 300));
Thread.sleep(2000);
driver.manage().window().fullscreen();
Thread.sleep(2000);
driver.manage().window().minimize();
Thread.sleep(2000);
driver.quit();
	}

}
