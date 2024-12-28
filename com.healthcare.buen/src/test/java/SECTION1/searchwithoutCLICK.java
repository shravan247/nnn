package SECTION1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class searchwithoutCLICK {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		//search videogame
		WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
		element.sendKeys("videogame");
	    element.submit();
	}

}
