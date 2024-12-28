package SECTION1;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangeBrokenLinks {

	public static void main(String[] args) {
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.name("username")).sendKeys("Admin");
WebElement ele=driver.findElement(By.name("password"));
ele.sendKeys("admin123");
ele.submit();

String title=driver.getTitle();
System.out.println("Title: "+title);
String url1=driver.getCurrentUrl();
System.out.println("URL: "+url1);

//print all image path
List<WebElement> Allimage=driver.findElements(By.tagName("img"));
for(WebElement a:Allimage) {
	String image=a.getAttribute("src");
	System.out.println("Image_Path: "+image);
}
//to find broken links
  List<WebElement> Alllinks=driver.findElements(By.tagName("a"));
  ArrayList<String> BrokenLinks=new ArrayList<String>();
  for(WebElement b:Alllinks) {
	  String links=b.getAttribute("href");
	  int statuscode=0;
	  
	  try {
		  //convert link to url
		  URL url=new URL(links);
		  //open a  connection to a server
		  URLConnection UrlConn=url.openConnection();
		  //connect to server using http url connection
		  HttpURLConnection httpurl=(HttpURLConnection)UrlConn;
		  //get the status code
		  statuscode=httpurl.getResponseCode();
		  if(statuscode >=400) {
			  BrokenLinks.add(links+"  "+statuscode);
		  }}
	  catch(Exception e) {
		  continue;
		  
	  }}
	System.out.println("BrokenLinks: "+BrokenLinks);
}}
