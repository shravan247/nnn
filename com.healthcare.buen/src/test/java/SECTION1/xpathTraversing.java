package SECTION1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathTraversing {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
driver.get("https://www.amazon.in/");

//forward traversing -parent to child '/'
//driver.findElement(By.xpath("//div[@class='nav-search-field ']/input")).sendKeys("iphone");

// forward traversing using child::
//driver.findElement(By.xpath("//div[@class='nav-search-field ']/child::input")).sendKeys("iphone");

//move from parent to grand child(descendant)
driver.findElement(By.xpath("//form[@id='nav-search-bar-form']/descendant::input[@id='twotabsearchtextbox']")).sendKeys("iphone");

	}

}
