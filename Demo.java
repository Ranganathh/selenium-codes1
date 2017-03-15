package desiredCapabilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void using_desiredCapabilities()
	{
		
		
		DesiredCapabilities desirecapabilities = DesiredCapabilities.firefox();
		 
		desirecapabilities.setBrowserName("FF");
		desirecapabilities.getBrowserName();
		String version =desirecapabilities.getVersion();
		System.out.println("version of the FF using: "+version);
		
System.setProperty("webdriver.firefox.marionette", "C:\\Selenium Softwares\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver(desirecapabilities);
		driver.get("https://www.microsoft.com/en-us/");
		
		driver.close();
		
	}

	
		
	}


