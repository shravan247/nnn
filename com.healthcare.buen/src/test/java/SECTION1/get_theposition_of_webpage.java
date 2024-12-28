package SECTION1;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_theposition_of_webpage {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
Thread.sleep(2000);
Point P= driver.manage().window().getPosition();
System.out.println(P);
driver.quit();
	}

}
