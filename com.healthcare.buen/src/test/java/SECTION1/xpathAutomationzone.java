package SECTION1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathAutomationzone {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
driver.get("https://theautomationzone.blogspot.com/2020/07/xpath-practice.html");
//multiple attribute
String text=driver.findElement(By.xpath("//p[@name='a' and @id='a']")).getText();

//1 of2 find using index
//String text=driver.findElement(By.xpath("(//p[@name='a'])[1]")).getText();

//1 of 2 find using position() function
//String text=driver.findElement(By.xpath("(//p[@name='a'])[position()=1]")).getText();

//1 of 2 to get the last element
//String text=driver.findElement(By.xpath("(//p[@name='a'])[last()]")).getText();

System.out.println(text);
driver.quit();
	}

}
