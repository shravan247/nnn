package SECTION2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartAutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.flipkart.com/");
		WebElement ele=driver.findElement(By.xpath("//span[@role='button']"));
		if(ele.isDisplayed()) {
			ele.click();
		}
		else {
			}
		driver.findElement(By.cssSelector("[class='Pke_EE']")).sendKeys("iphone 15");
		Thread.sleep(2000);
		List<WebElement> el=driver.findElements(By.cssSelector("[class='YGcVZO _2VHNef']"));
		for(WebElement r:el) {
			if(r.getText().contains("iphone 15 pro max")) {
				r.click();
				break;
			}
		}
	}

}
