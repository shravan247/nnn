package SECTION1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathflipkart {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
driver.get("https://www.flipkart.com/");
Thread.sleep(1000);;
WebElement ele=driver.findElement(By.xpath("//span[text()='✕']"));
if(ele.isDisplayed()) {
	ele.click();
}
else {
}
driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Iphone 15");
driver.findElement(By.xpath("//button[@type='submit']")).click();
List<WebElement> name=driver.findElements(By.xpath("//div[contains(@class,'rR')]"));
List<WebElement> price=driver.findElements(By.xpath("//div[contains(@class,'WHN')]"));
for(int i=0; i<name.size();i++) {
	String pName=name.get(i).getText();
	String pPrice=price.get(i).getText();
	System.out.println(pName+"----->"+pPrice);
}
driver.quit();
		}
	}


