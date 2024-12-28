package SECTION2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class counttheNoOfImagesandLinks {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
driver.get("https://www.amazon.in/");
List<WebElement> All=driver.findElements(By.xpath("//a|//img"));
//int size=All.size();
//System.out.println(size);
int count=0;
for(WebElement a:All) {
	count++;
}
System.out.println(count);
	}

}
