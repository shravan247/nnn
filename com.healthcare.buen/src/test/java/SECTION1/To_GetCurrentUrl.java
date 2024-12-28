package SECTION1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_GetCurrentUrl {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://licindia.in/");
		 Thread.sleep(2000);
		 String URL= driver.getCurrentUrl();
		 System.out.println(URL);
		 driver.manage().window().minimize();
		 driver.quit();
			}

		}

