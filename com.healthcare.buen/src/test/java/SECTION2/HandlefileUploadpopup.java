package SECTION2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlefileUploadpopup {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
driver.get("https://the-internet.herokuapp.com/upload");
driver.findElement(By.name("file")).sendKeys("C:\\Users\\shrad\\OneDrive\\Desktop\\resume3.pdf");
	}

}
