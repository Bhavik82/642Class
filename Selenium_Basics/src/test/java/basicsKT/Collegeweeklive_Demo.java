package basicsKT;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Collegeweeklive_Demo {

	@Test // Actual Test cases script
	public void d() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://collegeweeklive.com/go-signup/");
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		new Select(driver.findElement(By.name("attendeeType"))).selectByVisibleText("Student Looking for Graduate Degree");
		
		Thread.sleep(2000);
		driver.findElement(By.id("questions[q_19]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("questions[q_19][0]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("questions[q_19][1]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("questions[q_19][4]")).click();
		
		Random r = new Random();
		int majorsOfInterest = r.nextInt(43);
		
		
		
		
		
		
		
		
	}

}
