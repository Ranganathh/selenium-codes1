package chromeBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewChrome {
	@Test
	public void OPenChrome()
	
	{
		System.setProperty("webdriver.chrome.driver", "‪‪‪‪C:\\Users\\Ranganath Saikishor\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		 
			driver.manage().window().maximize();
		    driver.get("https://www.tutorialspoint.com/sql/sql-create-table.htm");
				System.out.println(driver.getTitle());
		    driver.quit();
	}
	}


