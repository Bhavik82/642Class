package testNG_Programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Us_megabus {
	@Test
	public void f() {
		WebDriver driver ;//= new ChromeDriver();
		WebDriverManager.chromedriver().browserVersion("114").setup();	// 
		driver = new ChromeDriver();
		//driver = new EdgeDriver();
		//driver = new FirefoxDriver();

		driver.get("https://us.megabus.com/account-management/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		// Clcik on Signup button
		driver.findElement(By.xpath("/html/body/main/div/mb-app/mb-login-page/div/div/div/ul/li[2]/a")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		// type invalid test data
		driver.findElement(By.id("email")).sendKeys("test98769876@gmail.com");
		driver.findElement(By.id("confirmEmail")).sendKeys("test98769876@gmail.com");
		driver.findElement(By.id("choosePassword")).sendKeys("Test@1234");
		driver.findElement(By.id("confirmPassword")).sendKeys("Test@1234");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		// Webdriver Click is not working here
		//driver.findElement(By.id("termsAndPrivacy")).click();
		
		// we will use JavaScript Click method to proceed
		WebElement termsCheckbox = driver.findElement(By.id("termsAndPrivacy"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", termsCheckbox);

		WebElement secondCheckbox = driver.findElement(By.id("marketing"));		
		js.executeScript("arguments[0].click();", secondCheckbox);

		
		// Check the Signup button is enabled statue if it is
		// disable state we have wait until theat comes to Enable state
		// use WebdriverWait to check the condition
		WebDriverWait ww = new WebDriverWait(driver, Duration.ofSeconds(50));
		ww.until(ExpectedConditions.elementToBeClickable(By.id("signup")));

		driver.findElement(By.id("signup")).click();

	}
}
