import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import org.testng.annotations.BeforeMethod;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterSuite;

public class driver extends CommonFunctions {

	private static ExtentReports extent;
	 ExtentSparkReporter spark;
	ExtentTest test;
	public  RemoteWebDriver driver;
	public  Properties properties;
	public String propertyFilePath= "Config//ConfigFile";	  
	BufferedReader reader;


  @BeforeSuite
  public void beforeSuite() {
		 extent = new ExtentReports();
         spark = new ExtentSparkReporter("C:\\Users\\Irfan\\eclipse-workspace\\TestProject\\Report\\Spark.html");
        extent.attachReporter(spark);
  }

  @BeforeMethod
  public void beforeMethod() throws IOException {
	  reader = new BufferedReader(new FileReader(propertyFilePath));
	  properties = new Properties();
	  properties.load(reader);
	  

  }
  @Parameters({"browser"})
  @Test
  public void Test1(String browser) throws Exception{
	  System.out.println(browser);
	  test = extent.createTest("Devices").assignDevice(browser);
	  test.assignCategory(browser);
	  CommonFunctions.opendriver(driver, browser,test);



	  
	  
		
  }
  @AfterMethod
  public void afterMethod() {
  
  }


  @AfterSuite
  public void afterSuite() {
	  extent.flush();
  }

}
