package basicsKT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Webelement {

	public static void main(String[] args) throws Exception {
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://collegeweeklive.com/go-signup/");
	
	Thread.sleep(3000);
	
	java.util.List<WebElement> dropdownOptions = new Select(driver.findElement(By.id("country"))).getOptions();
	
	Thread.sleep(3000);
	System.out.println("Total Countries are : " + dropdownOptions.size());
	
	
	}

}
