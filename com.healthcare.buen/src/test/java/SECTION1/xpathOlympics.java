package SECTION1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathOlympics {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	driver.get("https://olympics.com/en/olympic-games/tokyo-2020/medals");
	List<WebElement> cname=driver.findElements(By.xpath("//span[@class='styles__CountryName-sc-fehzzg-6 jYXabZ']"));
	List<WebElement> gold=driver.findElements(By.xpath("//div[@title='Gold']//span[@class='OcsTextstyles__StyledText-sc-1a1i41u-0 cuettq text--sm-body']"));
	List<WebElement> silver=driver.findElements(By.xpath("//div[@title='Silver']//span[@class='OcsTextstyles__StyledText-sc-1a1i41u-0 cuettq text--sm-body']"));
	List<WebElement> bronze=driver.findElements(By.xpath("//div[@title='Bronze']//span[@class='OcsTextstyles__StyledText-sc-1a1i41u-0 cuettq text--sm-body']"));
	List<WebElement> total=driver.findElements(By.xpath("//div[@title='']//span[@class='OcsTextstyles__StyledText-sc-1a1i41u-0 cuettq text--sm-body']"));

	for (int i=0; i<cname.size(); i++) {
		String cName=cname.get(i).getText();
		String Gold=gold.get(i).getText();
		String Silver=silver.get(i).getText();
		String Bronze=bronze.get(i).getText();
		String Total=total.get(i).getText();
		System.out.println("Country: "+cName+"--->> Gold:"+Gold+" >>Silver:"+Silver+" >>Bronze:"+Bronze+" >>Total: "+Total);
}
}
}
