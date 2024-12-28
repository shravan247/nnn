package SECTION1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fetchalltheIMAGES {

	public static void main(String[] args) {
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
driver.get("https://www.instagram.com/");

List<WebElement> Allimage=driver.findElements(By.tagName("img"));
 for (WebElement r:Allimage) {
	 String image=r.getAttribute("src");
	 System.out.println(image);
	 
	 //String img_text=r.getText();
	// System.out.println(img_text);
 }
	}

}
