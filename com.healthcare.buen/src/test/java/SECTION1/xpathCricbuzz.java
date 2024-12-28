package SECTION1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathCricbuzz {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.cricbuzz.com/");
		driver.findElement(By.xpath("//a[text()='SL vs NZ - NZ Won']")).click();
		driver.findElement(By.xpath("//a[text()='Scorecard']")).click();
		String PN = " Kusal Perera ";
		String a = driver.findElement(By.xpath("//a[text()='" + PN
				+ "']/ancestor::div[@class='cb-col cb-col-100 cb-scrd-itms']//div[@class='cb-col cb-col-8 text-right text-bold']"))
				.getText();
		System.out.println("Player score is: " + a);
	}
}
