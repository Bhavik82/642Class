package basicsKT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com/");
		driver.findElement(By.xpath("/html/body/ntp-app//div/div[1]/ntp-realbox//div/input")).sendKeys("Hardik Pandya Haircut");
		
	}

}
