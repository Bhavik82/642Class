package basicsKT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Collegeweeklive {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		
		//1st
		driver.get("https://collegeweeklive.com/go-signup/"); 
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("ABC");
		driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("DEF");
		driver.findElement(By.xpath("//*[@id=\"emailAddress\"]")).sendKeys("XYZ@gamil.com");
		driver.findElement(By.xpath("//*[@id=\"phoneNumber\"]")).sendKeys("9824019290");
		driver.findElement(By.xpath("//*[@id=\"questions[q_135]\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"questions[q_136]\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"questions[q_137]\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		
		
		//2nd
		driver.findElement(By.linkText("terms & conditions")).click();
		
		//3rd
		new Select(driver.findElement(By.id("country"))).selectByVisibleText("INDIA");
		new Select(driver.findElement(By.name("attendeeType"))).selectByVisibleText("Parent");
		new Select(driver.findElement(By.name("questions[q_134]"))).selectByVisibleText("Spring 2024");
		
	}

}
