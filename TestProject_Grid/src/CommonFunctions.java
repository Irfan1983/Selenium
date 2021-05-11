import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;


public class CommonFunctions 
{
	public static  Properties properties;
	public static WebDriver opendriver(RemoteWebDriver driver,String browser,ExtentTest test) throws MalformedURLException
	{
	 if(browser.contains("Chrome"))
	 {
	     DesiredCapabilities cap = DesiredCapabilities.chrome();
         cap.setBrowserName("chrome");
         String Node = "http://169.254.87.163:4444/wd/hub";
         driver = new RemoteWebDriver(new URL(Node), cap);
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

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
