package cumberlands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StudentLogin {
	WebDriver d;
	
    @Test(dataProvider="Credentials")
	public void BlackboardLogin(String username, String Password) throws InterruptedException
	{
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver.exe");
	 d= new ChromeDriver();
	
	d.manage().window().maximize();
	d.get("http://www.ucumberlands.edu/");
	d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	d.findElement(By.xpath(".//*[@id='block-menu-menu-topbar-menu']/div/div/ul/li[1]/a")).click();
	Thread.sleep(5000);
	d.findElement(By.xpath(".//*[@id='page']/div[4]/div/div/article/div/div/div[2]/div/div/div[1]/div/div/a/span[1]")).click();
	Thread.sleep(5000);
	d.findElement(By.id("user_id")).sendKeys( username);
	Thread.sleep(5000);
	d.findElement(By.id("password")).sendKeys(Password);
	Thread.sleep(5000);
	d.findElement(By.id("entry-login")).click();
	
	
	
	}
    @AfterMethod
    public void  tearout()
    {
    	d.quit();
    	
    }
    
    @DataProvider(name="Credentials")
    public Object[][] passData()
     {
    	
    Object[][] data=new Object[3][2];	
    
    data[0][0]="rkola";
    data[0][1]="t23";
    
    data[1][0]="rkolachelamala2469@ucumberlands.edu";
    data[1][1]="t23!dhK9";
    
    data[2][0]="rkoalachelaa";
    data[2][1]="t23dhk9";
    
    return data;
    
    
    
    			
    }
}
