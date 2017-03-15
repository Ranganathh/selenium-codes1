package webuy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chromedriver.exe" );
		WebDriver d = new ChromeDriver();
		d.get("https://uk.webuy.com/");
		d.findElement(By.xpath(".//*[@id='stext']")).sendKeys("IPhone");
		d.findElement(By.xpath(".//*[@id='headersearch']/div[3]/input")).click();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.findElement(By.xpath("html/body/div[5]/div[1]/div[3]/div[5]/div[1]/div[1]/div[3]/div/a[1]/div/span")).click();
		d.findElement(By.xpath("html/body/div[5]/div[1]/div[3]/div[5]/div[1]/div[4]/div[3]/div/a[1]/div/span")).click();
		d.findElement(By.xpath("html/body/div[5]/div[2]/div[3]/div[2]/table/tbody/tr/td[2]/a[1]")).click();
		d.findElement(By.xpath("//tr[2]/td[7]/a/img")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("//tr[1]/td[7]/a/img")).click();
		Thread.sleep(5000);
		d.quit();
		

	}

}
