package SECTION2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
driver.get("https://www.youtube.com/");
driver.findElement(By.cssSelector("[id='search-input']>[id='search']")).sendKeys("namal onnalle");
driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
Thread.sleep(1000);
driver.findElement(By.partialLinkText("Nammal Onnalle Ft. Varkey, @officialFejo & @BECHEEKHA  | Malayalam Music Video | Netflix India")).click();
	}

}
