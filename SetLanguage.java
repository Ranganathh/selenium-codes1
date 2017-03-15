package languageSetting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

public class SetLanguage {
	@Test
	public void ChangeLanguage()
	{
		FirefoxProfile fireFoxProfile = new FirefoxProfile();
		
		fireFoxProfile.setPreference("intl.accept_languages", "hi");
System.setProperty("webdriver.firefox.marionette", "C:\\Selenium Softwares\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver(fireFoxProfile);
		driver.get("https://www.facebook.com/");
	}

}
