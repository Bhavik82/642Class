package basicsKT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class Basic_class {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://mvnrepository.com/");
		driver.findElement(By.name("q")).sendKeys("selenium server");
		driver.findElement(By.xpath("//*[@id=\"search\"]/form/input[2]")).click();
	}

}
