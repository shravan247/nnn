package SECTION1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fullscreen_browser {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
Thread.sleep(2000);
driver.manage().window().maximize();
driver.manage().window().minimize();
driver.manage().window().fullscreen();
driver.manage().window().minimize();
String title= driver.getTitle();
System.out.println(title);
String url=driver.getCurrentUrl();
System.out.println(url);
driver.quit();

	}

}
