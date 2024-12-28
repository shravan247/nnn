package SECTION1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathVTIGER {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
driver.get("http://localhost:8888/");
driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("password");
driver.findElement(By.xpath("//input[@id='submitButton']")).click();
driver.findElement(By.xpath("//a[text()='Organizations']")).click();
driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("ssTiger");
driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();

	}

}
