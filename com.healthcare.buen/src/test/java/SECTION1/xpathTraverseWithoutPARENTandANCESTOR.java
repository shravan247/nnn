package SECTION1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathTraverseWithoutPARENTandANCESTOR {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.amazon.in/");
		//grand child to grand parent without ancestor:: > .//(dot before // and []))
		driver.findElement(By.xpath("//form[.//input[@id='twotabsearchtextbox']]"));
		//child to parent without parent:: > // (no dot before // and use [])
		driver.findElement(By.xpath("//div[@class='nav-search-field '][//input[@id='twotabsearchtextbox']]"));
			}

}
