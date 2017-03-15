package NewFirefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test1 {

	public static void main(String[] args) {
	
		WebDriver d= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "‪‪C:\\Selenium Softwares\\chromedriver.exe");
		
		
		
		d.get("http://www.ucumberlands.edu/students");
		

	}

}
