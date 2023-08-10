package testNG_Programs;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class JustRechageItLogin {

	@Test
	public void login() throws Exception {
		// Open Chrome Browser
		//WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new EdgeDriver();
		
		//HeadLess Browser: use "HtmlUnit Driver" dependecies in POM.xml file 
		WebDriver driver = new HtmlUnitDriver();
		
	

		driver.get("https://www.justrechargeit.com/SignIn.aspx");
		driver.manage().window().maximize();

		driver.findElement(By.name("txtUserName")).sendKeys("cnu4mca@gmail.com");
		driver.findElement(By.name("txtPasswd")).sendKeys("123456");
		// Use scanner method to read the given input from Console
		//Scanner s = new Scanner(System.in);
		//String captchaNumber = s.next();
		Thread.sleep(8000);
	//	driver.findElement(By.name("txtCaptcha")).sendKeys(captchaNumber);

	//	driver.findElement(By.name("imgbtnSignin")).click();

		// To close the current window/browser page
		// driver.quit();

	}

}
