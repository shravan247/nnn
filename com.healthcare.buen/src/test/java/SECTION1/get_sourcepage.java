package SECTION1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_sourcepage {

	public static void main(String[] args) {
 WebDriver driver = new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("https://www.amazon.in/");
 String source=driver.getPageSource();
 System.out.println(source);
 driver.quit();
	}
}
