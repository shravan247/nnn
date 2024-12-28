package SECTION1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssParentToChild {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
driver.get("https://www.amazon.in");

//move from parent to child using SPACE
WebElement ele=driver.findElement(By.cssSelector("[class='nav-search-field '] [id='twotabsearchtextbox']"));
ele.click();
ele.sendKeys("crocs");
Thread.sleep(1000);

//move to quick sibling 
driver.findElement(By.cssSelector("[id='icp-nav-flyout']+a+a")).click();
driver.navigate().back();
Thread.sleep(1000);

//move to any sibling
driver.findElement(By.cssSelector("[id='icp-nav-flyout']~[id='nav-cart']")).click();
driver.navigate().back();
Thread.sleep(1000);
driver.quit();
}}
