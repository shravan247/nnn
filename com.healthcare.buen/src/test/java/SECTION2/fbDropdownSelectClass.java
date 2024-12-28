package SECTION2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fbDropdownSelectClass {

	public static void main(String[] args) {
WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
driver.get("https://www.facebook.com/signup");
WebElement date=driver.findElement(By.name("birthday_day"));
WebElement month=driver.findElement(By.name("birthday_month"));
WebElement year=driver.findElement(By.name("birthday_year"));
//date dropdown
Select sdate=new Select(date);
sdate.selectByVisibleText("24");
//month dropdown
Select smonth=new Select(month);
smonth.selectByVisibleText("Jul");
//year dropdown
Select syear=new Select(year);
syear.selectByVisibleText("1998");
}}
