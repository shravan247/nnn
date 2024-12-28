package SECTION2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddropusingDragAndDropmethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
		WebElement a=driver.findElement(By.id("draggable"));
		WebElement b=driver.findElement(By.id("droppable"));
		Actions act=new Actions(driver);
		act.dragAndDrop(a, b).perform();
	}

}
