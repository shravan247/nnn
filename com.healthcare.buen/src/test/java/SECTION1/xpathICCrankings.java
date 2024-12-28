package SECTION1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathICCrankings {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
driver.get("https://www.icc-cricket.com/homepage");

//parent to child (note:- developer tool landscape)
//driver.findElement(By.xpath("//nav[@id='']/descendant::button[contains(text(),'Rankings')]")).click();

//parent to child without contains==> use normalize-space
driver.findElement(By.xpath("//nav[@id='']//button[normalize-space(text())='Rankings']")).click();

//driver.findElement(By.xpath("//div[@class='main-navigation__desktop-navigation']/descendant::button[contains(text(),'Rankings')]")).click();


	}

}
