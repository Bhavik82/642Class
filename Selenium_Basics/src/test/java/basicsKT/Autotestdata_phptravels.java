package basicsKT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autotestdata_phptravels {

	public static void main(String[] args) throws Exception {
		
WebDriver driver = new ChromeDriver();
//1st
  				driver.get("https://autotestdata.com/");
				driver.findElement(By.linkText("Need Help?")).click();

//2nd				
			    driver.get("https://phptravels.com/demo/");
			    Thread.sleep(5000);
				driver.findElement(By.linkText("Signup")).click();
				driver.manage().window().maximize();
	}

}
