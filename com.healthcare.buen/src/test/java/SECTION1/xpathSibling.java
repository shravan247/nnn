package SECTION1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathSibling {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
driver.get("https://www.amazon.in/");

//xpath by following sibling
//driver.findElement(By.xpath("//label[@for='twotabsearchtextbox']/following-sibling::input")).sendKeys("iphone");

//xpath by backward traversing (/.. --->move from child to immediate parent) real time we don't use this
//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']/../../.."));

//move from child to immediate parent
//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']/parent::div")).sendKeys("iphone");

//move from child to grand parent(ancestor)
//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']/ancestor::form"));

//xpath by preceding-sibling
driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']/preceding-sibling::label"));
	}

}
