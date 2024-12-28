package SECTION2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiSelectDropDownSelectALLdropdown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("file:///C:/Users/shrad/OneDrive/Desktop/selenium/multiselectdropdown.html");
		WebElement ele=driver.findElement(By.id("Movies"));
		Select s=new Select(ele);
		boolean a=s.isMultiple();
		System.out.println(a);
		//to select all options
		List<WebElement> alloptions=s.getOptions();
		for(WebElement b:alloptions) {
			b.click();
		}
	}

}