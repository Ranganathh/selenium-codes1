package crossBrowserInTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class VerifyPageTitle {
	WebDriver driver;
	
	@Test
	@Parameters("browser")
	public void verifyTitle (String browserName)
	{
		if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.firefox.marionette", "C:\\Selenium Softwares\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "‪C:\\Selenium Softwares\\chromedriver.exe");
			 driver=new ChromeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver", "‪‪‪C:\\Selenium Softwares\\IEDriverServer.exe");
		 driver=new InternetExplorerDriver();
		}
		
	driver.manage().window().maximize();
    driver.get("https://www.tutorialspoint.com/sql/sql-create-table.htm");
		System.out.println(driver.getTitle());
    driver.quit();
	}

}
