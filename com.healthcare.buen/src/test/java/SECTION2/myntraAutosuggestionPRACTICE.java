package SECTION2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class myntraAutosuggestionPRACTICE {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
driver.get("https://www.myntra.com/");
driver.findElement(By.cssSelector("[class='desktop-searchBar']")).sendKeys("crocs");
Thread.sleep(2000);
List<WebElement> ele=driver.findElements(By.xpath("//li[@class='desktop-suggestion null']"));
for(WebElement r:ele) {
	if(r.getText().contains("Crocs Men")) {
		r.click();
	}
}
	}

}
