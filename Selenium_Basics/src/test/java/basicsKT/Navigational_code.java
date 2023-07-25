package basicsKT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigational_code {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.yahoo.com");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"root_4\"]")).click();
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().refresh();
		
	}

}
