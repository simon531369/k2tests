package org.kushala.selenium.v2;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;


public class Testgrid {
	
	@Test
	public void test1() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		cap.setPlatform(Platform.LINUX);
		URL url=new URL ("http://localhost:4446/wd/hub");
		WebDriver driver=new RemoteWebDriver(url, cap);
		driver.get("https://kushala.co.in");
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
		
	}

}
