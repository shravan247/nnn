package SECTION1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class counttheLInks {

	public static void main(String[] args) {
WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
driver.get("https://www.instagram.com/");

List<WebElement> Alllinks=driver.findElements(By.tagName("a"));
int count=0;
for(WebElement r: Alllinks) {
	String link=r.getAttribute("href");
	System.out.println(link);
	count++;
	
}
System.out.println(count);
	}

}
