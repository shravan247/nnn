package SECTION2;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadrresumeNaukriRObotClass {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand_Login_Register&gad_source=1&gclid=Cj0KCQiAmNeqBhD4ARIsADsYfTcelu5TXTuh7znDIVg5s3hSTLpjr3ZYW2ZeYbUuoCt-PZX9qpZHsqkaAo6YEALw_wcB&gclsrc=aw.ds");
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		//select
		StringSelection ss=new StringSelection("C:\\Users\\shrad\\OneDrive\\Desktop\\resume3.pdf");
		//copy
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		//paste
		Robot r=new Robot();
		r.delay(2000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		}
}
