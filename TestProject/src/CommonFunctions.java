import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;


public class CommonFunctions 
{
	public static  Properties properties;
	public static WebDriver opendriver(WebDriver driver,String browser,ExtentTest test)
	{
	 if(browser.contains("Chrome"))
	 {
	  System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
	  // System.setProperty("webdriver.chrome.driver", "C:\\Users\\Irfan\\Desktop\\Selenium\\chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.get("http://www.google.com/");	
	
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("jj");
	
			test.log(Status.PASS," markup");	

		}

	else if (browser.contains("msedgedriver"))
	{
	    System.setProperty("webdriver.edge.driver", "C:\\Users\\Irfan\\Desktop\\Selenium\\msedgedriver.exe");
	    driver = new EdgeDriver();
	    driver.get("http://www.google.com/");	
		try {
		if(driver.findElement(By.xpath("(//input[@value='Google Search'])[1]")).isDisplayed())
		{
			test.log(Status.PASS," markup");	
		}}catch(Exception e) {
			test.log(Status.FAIL," markup");	

		}

	}
	   driver.manage().window().maximize();
	   return driver;

	}
	


}
