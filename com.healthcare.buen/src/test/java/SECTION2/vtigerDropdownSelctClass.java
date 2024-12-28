package SECTION2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class vtigerDropdownSelctClass {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("http://localhost:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin",Keys.TAB,"password",Keys.ENTER);

		//since text is present b/w /anchor tag
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		WebElement ele=driver.findElement(By.name("industry"));
		Select se=new Select(ele);
		List<WebElement> alloptions=se.getOptions();
		//to count the options not required or we can declare inside the loop count++
		//int size=alloptions.size();
		//System.out.println(size);
        for(WebElement a:alloptions) {
        	System.out.println(a.getText());
        	if(a.getText().equalsIgnoreCase("education")) {
        		a.click();
        		break;
        	}
        }
	}

}
