package testNG_Programs;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class CrossBrowserTesting_JRIloginPAge {
	WebDriver driver;

	@Parameters("browserName")
	@BeforeClass
	public void beforeClass(String browserName) {
		if (browserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("HeadlessBrowser")) {
			driver = new HtmlUnitDriver();
		} else if (browserName.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		} else {
			System.out.println("Please give a valid browser name...");
		}
	}

	@Test
	public void login() {
		driver.get("https://www.justrechargeit.com/SignIn.aspx");
		driver.manage().window().maximize();

		driver.findElement(By.name("txtUserName")).sendKeys("cnu4mca@gmail.com");
		driver.findElement(By.name("txtPasswd")).sendKeys("123456");
	}

}
