package basicsKT;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;



import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class Screenshot_code_Demo {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.yahoo.com/");
	
		Thread.sleep(2000);	
		
		//driver.manage().window().maximize();
		
		Date d = new Date();
		DateFormat df = new SimpleDateFormat("mm/dd/yyyy-hh:mm:ss");
		String timeStamp = df.format(d);
		
		//String path = ".\\Snapshots\\";
		
		File A = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
		FileHandler.copy(A, new File(".\\Snapshots\\Test"+timeStamp+".PNG"));
		
		
		driver.close();
		
		
		
		
		
		
		

		
		
	}

}
