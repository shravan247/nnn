package SECTION1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class printIphoneproduct {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://www.flipkart.com/");
WebElement ele=driver.findElement(By.cssSelector("span[role='button']"));
if(ele.isDisplayed()) {
	ele.click();
}
else
{
	
}
driver.findElement(By.cssSelector("input.Pke_EE")).sendKeys("Iphone 15");
driver.findElement(By.cssSelector("[class*='iLD']")).click();

List<WebElement> Alllinks=driver.findElements(By.cssSelector("[class*='rR']"));
for (WebElement a:Alllinks) {
String text=a.getText();
System.out.println(text);
}
driver.quit();
}
}

