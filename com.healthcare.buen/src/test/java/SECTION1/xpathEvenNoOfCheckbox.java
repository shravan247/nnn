package SECTION1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathEvenNoOfCheckbox {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone 15");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		//select only even number of checkbox
		//driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[position() mod 2=0]")).click();
		//select only odd no of checkbox
		//driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[position() mod 2!=0]")).click();
		//how to select first five check box
		//driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[position() <6]")).click();
		//how to select last five checkbox
		//driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[position() >98]")).click();
		//driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[last()-5]")).click();
		//how to select last checkbox
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[last()]")).click();
}
}
