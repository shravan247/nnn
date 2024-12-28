package SECTION1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatewithNAME {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.instagram.com/");
Thread.sleep(2000);
//driver.findElement(By.name("username")).sendKeys("shravan__shetty7");]]]
WebElement element=driver.findElement(By.name("username"));
element.sendKeys("shravan__shetty7");
WebElement ele=driver.findElement(By.name("password"));
ele.sendKeys("Seetharam@3");
ele.submit();
	}

}
