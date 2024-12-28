package SECTION2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class shadowrootBooks {

	public static void main(String[] args) throws Throwable {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
driver.get("https://books-pwakit.appspot.com/explore?q=");
Thread.sleep(2000);

//using java script -
//JavascriptExecutor js = (JavascriptExecutor)driver;
//js.executeScript("document.querySelector(\"[apptitle='BOOKS']\").shadowRoot.querySelector(\"[effects='waterfall']>[class='toolbar-bottom']>book-input-decorator>input[id='input']\").value=\"Harry potter\";");

//using selenium
WebElement e = driver.findElement(By.xpath("//book-app[@apptitle='BOOKS']"));
SearchContext shadow = e.getShadowRoot();
shadow.findElement(By.cssSelector("app-header input[id='input']")).sendKeys("Harry potter");
Thread.sleep(3000);
driver.close();

	}

}
