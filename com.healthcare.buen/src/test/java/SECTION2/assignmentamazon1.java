package SECTION2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class assignmentamazon1 {

	public static void main(String[] args) throws Throwable {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
driver.get("https://www.amazon.in/");
driver.findElement(By.linkText("Mobiles")).click();
WebElement a=driver.findElement(By.xpath("//span[contains(text(),'Laptops & Accessories')]"));
Actions act=new Actions(driver);
act.moveToElement(a).perform();
driver.findElement(By.xpath("//a[@href='/s/ref=mega_elec_s23_2_1_2_5?rh=i%3Acomputers%2Cn%3A4364643031&ie=UTF8&bbn=976392031']")).click();
driver.findElement(By.cssSelector("[class='a-dropdown-prompt']")).click();
driver.findElement(By.id("s-result-sort-select_1")).click();
/*
 * //we can use robot class ass well but not select, since it is not developed using select 
 * Robot r=new Robot(); 
 * r.keyPress(KeyEvent.VK_DOWN);
 * r.keyRelease(KeyEvent.VK_DOWN); 
 * r.keyPress(KeyEvent.VK_ENTER);
 * r.keyRelease(KeyEvent.VK_ENTER);
 */
 
}
}
