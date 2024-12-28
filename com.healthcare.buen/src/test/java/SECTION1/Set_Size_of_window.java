package SECTION1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_Size_of_window {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.youtube.com/");
    Thread.sleep(2000);
    //Dimension d=new Dimension(400, 200);
   //driver.manage().window().setSize(d);
    driver.manage().window().setSize(new Dimension(200, 400));
    Thread.sleep(2000);
    driver.quit();
	}
}
