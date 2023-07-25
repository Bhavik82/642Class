package basicsKT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TextErrorMessage {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		
		//1st
		driver.get("https://collegeweeklive.com/go-signup/"); 
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		Thread.sleep(3000);
		
		System.out.println(driver.findElement(By.id("firstNameError")).getText());
		
		String A = driver.findElement(By.id("ConfirmPasswordError")).getText();
		System.out.println(A);
		
		
		
		
		
		
		
		
		

		
		
	}

}
