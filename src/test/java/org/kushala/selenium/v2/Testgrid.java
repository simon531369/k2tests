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
		//URL url=new URL ("http://localhost:4446/wd/hub");
		URL url=new URL ("http://13.58.236.51:4444/wd/hub");
		WebDriver driver=new RemoteWebDriver(url, cap);
		driver.get("https://kushala.co.in");
		Thread.sleep(5000);
		driver.quit();
		
	}

}
