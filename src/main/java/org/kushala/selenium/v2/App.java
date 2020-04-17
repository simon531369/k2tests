package org.kushala.selenium.v2;


import java.io.File;
import java.net.URL;
import java.sql.Driver;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;


public class App {
	
	WebDriver driver;
	
	 @Test
	  public void kushala() throws Throwable {
		 

		 URL url = new URL("http://172.31.43.200:4455/wd/hub");
		 DesiredCapabilities caps = new DesiredCapabilities().chrome();
		 caps.setPlatform(Platform.LINUX);
		 caps.setBrowserName("chrome");
		 
		  driver = new RemoteWebDriver(url, caps);
		 
		 driver.get("https://kushala.org/workspace/version2-internal/");
//facebook	
		 
		 driver.findElement(By.xpath("//a[@class='facebookicon']")).click();
		 System.out.println("Home Page is loaded Successfully and Terms of Use Link is clicked");
		 ArrayList<String> window1 = new ArrayList<String>(driver.getWindowHandles());
		 driver.switchTo().window(window1.get(1));
		 Thread.sleep(5000);
		 driver.close();
		 Thread.sleep(5000);
		 driver.switchTo().window(window1.get(0));
//twitter		 
		 driver.findElement(By.xpath("//a[@class='twittericon']//i[@class='fab fa-twitter']")).click();
		 System.out.println("Home Page is loaded Successfully and Terms of Use Link is clicked");
		 ArrayList<String> window2 = new ArrayList<String>(driver.getWindowHandles());
		 driver.switchTo().window(window2.get(1));
		 Thread.sleep(5000);
		 driver.close();
		 Thread.sleep(5000);
		 driver.switchTo().window(window1.get(0)); 
		 
//instagram
		 driver.findElement(By.xpath("//i[@class='fab fa-instagram']")).click();
		 System.out.println("Home Page is loaded Successfully and Terms of Use Link is clicked");
		 ArrayList<String> window3 = new ArrayList<String>(driver.getWindowHandles());
		 driver.switchTo().window(window3.get(1));
		 Thread.sleep(5000);
		 driver.close();
		 Thread.sleep(5000);
		 driver.switchTo().window(window1.get(0));
		 
//about

		 
		 driver.findElement(By.xpath("//div[@class='wsmainfull menu clearfix original']//a[contains(text(),'About Us')]")).click();
		 Thread.sleep(10000);
		 System.out.println("Home Page is loaded Successfully and Terms of Use Link is clicked");
		 Thread.sleep(2000);
		 

//overview
		 driver.findElement(By.xpath("//a[@id='tab11-list']")).click();
		 Thread.sleep(2000);

//vision
		 driver.findElement(By.xpath("//a[@id='tab12-list']")).click();
		 Thread.sleep(5000);

//team
		 driver.findElement(By.xpath("//a[@id='tab13-list']")).click();
		 Thread.sleep(5000);

////home	 
//		 driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/header[1]/div[3]/div[1]/div[1]/a[1]/img[1]")).click();
//		 Thread.sleep(5000); 
//diabetes impact		 
		 driver.findElement(By.linkText("Diabetes Impact")).click();
		 Thread.sleep(5000);
////heart		
//		 driver.findElement(By.linkText("Heart")).click(); 
//		 Thread.sleep(5000);
//		 Thread.sleep(5000);
////kidney 
//		 driver.findElement(By.linkText("Kidney")).click();
//		 Thread.sleep(5000);
////eye		 
//		 driver.findElement(By.linkText("Eye")).click();
//		 Thread.sleep(5000);
////nerve	 
//		 driver.findElement(By.linkText("Nerve")).click();
//		 Thread.sleep(5000);
//		 
////leg		 
//		 driver.findElement(By.linkText("Leg")).click();
//		 Thread.sleep(5000);
////skin		 
//		 driver.findElement(By.linkText("Skin")).click();
//		 Thread.sleep(5000);		 
		 
		 
//diabetes care 	
		 driver.findElement(By.linkText("Diabetes Care")).click();
		 Thread.sleep(5000);
		 
		 driver.findElement(By.xpath("//a/button")).click();
		 Thread.sleep(5000);

		 	 
 
////works
//		 driver.findElement(By.linkText("How it works")).click();
//		 Thread.sleep(5000);
////services
//		 driver.findElement(By.xpath("//div[@class='wsmainfull menu clearfix cloned']//a[contains(text(),'Services')]")).click();
//		 Thread.sleep(5000);
//		 
////stories
//		 driver.findElement(By.xpath("//div[@class='wsmainfull menu clearfix cloned']//a[contains(text(),'Success Stories')]")).click();
//		 Thread.sleep(5000);
//		 
////home	 
//		 driver.findElement(By.xpath("//div[@class='wsmainfull menu clearfix cloned']//div[@class='desktoplogo']//img")).click();
//		 Thread.sleep(5000); 
////control diabetes
//		 driver.findElement(By.xpath("//div[@class='wsmainfull menu clearfix original']//a[contains(text(),'Control Diabetes')]")).click();
//		 Thread.sleep(5000);
////lifestyle		 
//		 driver.findElement(By.xpath("//div[@class='wsmainfull menu clearfix original']//a[contains(text(),'Healthy Food')]")).click();
//		 Thread.sleep(5000);
////food		 
//		 driver.findElement(By.xpath("//div[@class='wsmainfull menu clearfix original']//a[contains(text(),'Healthy Food')]")).click();
//		 Thread.sleep(5000);
////check ups
//		 driver.findElement(By.xpath("//div[@class='wsmainfull menu clearfix original']//a[contains(text(),'Regular Check-ups')]")).click();
//		 Thread.sleep(5000);

////reach us		 
//		 driver.findElement(By.xpath("//div[@class='wsmainfull menu clearfix original']//a[contains(text(),'Reach Us')]")).click();
//		 Thread.sleep(5000);
////collaburate		 
//		 driver.findElement(By.xpath("//div[@class='wsmainfull menu clearfix original']//a[contains(text(),'Collaborate')]")).click();
//		 Thread.sleep(5000);
////contact		 
//		 driver.findElement(By.xpath("//div[@class='wsmainfull menu clearfix original']//a[contains(text(),'Contact us')]")).click();
//		 Thread.sleep(5000);
		 
		 
		 
////playstore
//
//		 driver.findElement(By.xpath("//div[@class='wsmainfull menu clearfix original']//nav[@class='wsmenu clearfix']//img")).click();
//		 System.out.println("Home Page is loaded Successfully and Terms of Use Link is clicked");
//		 ArrayList<String> window4 = new ArrayList<String>(driver.getWindowHandles());
//		 driver.switchTo().window(window4.get(1));
//		 Thread.sleep(5000);
//		 driver.close();
//		 Thread.sleep(5000);
//		 driver.switchTo().window(window1.get(0));
		 
////login		 
//		 driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/header[1]/div[3]/div[1]/nav[1]/ul[1]/li[7]/button[1]")).click();
//		 System.out.println("Home Page is loaded Successfully and Terms of Use Link is clicked");
//		 ArrayList<String> window5 = new ArrayList<String>(driver.getWindowHandles());
//		 driver.switchTo().window(window5.get(1));
//		 Thread.sleep(5000);
//		 driver.close();
//		 Thread.sleep(5000);
//		 driver.switchTo().window(window1.get(0));
		 
//		 driver.findElement(By.xpath("//li[@class='indicator-item active']")).click();
//		 Thread.sleep(3000);
		
//		 driver.findElement(By.xpath("//a[contains(text(),'Online Packages')]")).sendKeys(Keys.CONTROL +"t");
//		 Thread.sleep(3000);
		 
//read more
		
	     

//	     driver.findElement(By.xpath("//div[@class='singnature mt-35']//a[@class='btn btn-sm btn-blue blue-hover mt-25'][contains(text(),'Read More')]")).click();
//	     ArrayList<String> window5 = new ArrayList<String>(driver.getWindowHandles());
//		 driver.switchTo().window(window5.get(1));
//		 Thread.sleep(5000);
//		 driver.close();
//		 Thread.sleep(5000);
//		 driver.switchTo().window(window1.get(0));

	 
//	        JavascriptExecutor js = (JavascriptExecutor) driver;
//	        WebElement Element = driver.findElement(By.xpath("//section[@id='services-2']//div[@class='container']//div[1]//div[1]//a[1]"));
//	        js.executeScript("arguments[0].scrollIntoView();", Element);
//	        Element.click();

//		 driver.findElement(By.xpath("//div[@class='row']//div[2]//div[1]//a[1]//div[1]")).click();
//		 Thread.sleep(2000);
		 
////buy package
//		 driver.findElement(By.xpath("//section[8]//div[1]//div[2]//div[1]//div[1]//a[1]")).click();
//		 Thread.sleep(5000);	 
//    	 driver.findElement(By.xpath("//div[3]//div[1]//div[1]//a[1]//img[1]")).click();
//		 Thread.sleep(5000);	
		 	


		 
	 }
	 
//	 public void closing() {
//		 RemoteWebDriver driver;
//		driver.close();
//		 driver.quit();
//		 System.out.println("Test completed successfully");
	 
	  
}
