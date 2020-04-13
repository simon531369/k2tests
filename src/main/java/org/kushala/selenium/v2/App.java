package org.kushala.selenium.v2;

import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try {
			kushala();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   	 
}
    
    @Test
 	  public static void kushala() throws Throwable {
    	WebDriver driver;
// 		 URL url = new URL("http://13.58.236.51:4452/wd/hub");
 		 URL url = new URL("http://172.31.43.200:4455/wd/hub");
 		 DesiredCapabilities caps = new DesiredCapabilities().chrome();
 		 caps.setPlatform(Platform.LINUX);
// 		 DesiredCapabilities caps = DesiredCapabilities.chrome();
 		 caps.setBrowserName("chrome");
 		 
 		  driver = new RemoteWebDriver(url, caps);
 		 
 		 driver.get("https://kushala.org/workspace/version2-internal/");
  }
}
