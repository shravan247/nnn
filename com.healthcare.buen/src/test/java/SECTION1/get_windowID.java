package SECTION1;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_windowID {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		String title = driver.getTitle();
		System.out.println(title);
		String source = driver.getPageSource();
		System.out.println(source);
		String id = driver.getWindowHandle();
		System.out.println(id);
		Set<String> ids = driver.getWindowHandles();
		System.out.println(ids);
		driver.quit();
	}

}
