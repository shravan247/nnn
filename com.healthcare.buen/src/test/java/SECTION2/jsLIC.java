package SECTION2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsLIC {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://licindia.in/");
		driver.findElement(By.cssSelector("[class='btn btn-default']")).click();
		driver.findElement(By.xpath("//a[@class='login1']")).click();
		Thread.sleep(2000);
//alert popup
	
		TargetLocator a=driver.switchTo();
		Alert act=a.alert();
		String text=act.getText();
		System.out.println(text);
		Thread.sleep(2000);
        act.dismiss();
	}

}
