package SECTION2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class frame {

	public static void main(String[] args) {
ChromeOptions opt=new ChromeOptions();
opt.addArguments("--disable-notifications");
WebDriver driver=new ChromeDriver(opt);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
driver.get("https://selenium08.blogspot.com/2019/11/selenium-iframe.html");
driver.switchTo().frame(0);
driver.findElement(By.linkText("Free Mock Tests")).click();
String par=driver.getWindowHandle();
Set<String> all_ids=driver.getWindowHandles();
for (String id:all_ids) {
	if(!(par.equals(id))) {
		driver.switchTo().window(id);
	}}
driver.findElement(By.name("phone")).sendKeys("9898989898");
	
	}

}
