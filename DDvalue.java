package selectDropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DDvalue {

	@Test
	public void selectDDvalue()
	{
		System.setProperty("webdriver.firefox.marionette", "C:\\Selenium Softwares\\geckodriver.exe");
		
		WebDriver d=new FirefoxDriver();
		
		d.get("https://www.facebook.com/");
		
		d.manage().window().maximize();
		//Find Drop down Element
		WebElement month_DropDown= d.findElement(By.xpath(".//*[@id='month']"));
		//Write Select Method
		Select month_DD= new Select(month_DropDown);
		
		List<WebElement> month_list=month_DD.getOptions();
		int total_months= month_list.size();
		
		System.out.println("Total number of months is" +total_months );
		
		for(WebElement ele:month_list)
		{
			String month_name=ele.getText();
			System.out.println("List of names" +month_name);
		}
		WebElement Selected_Value= month_DD.getFirstSelectedOption();
		System.out.println("Value Before selection is" + Selected_Value.getText() );
		//It will select April
		month_DD.selectByIndex(4);
		
		WebElement Selected_Value1 =month_DD.getFirstSelectedOption();
		System.out.println("Value After Selection is"+ Selected_Value1.getText());
	}
}
