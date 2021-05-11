package com.testautomation.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.Status;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdef {
	public  WebDriver driver;
	@Given("^open browser$")
	public void open_chrome_browser_and_enter_url() throws Throwable 
	{
		System.out.println("open browser");
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Irfan\\Desktop\\Selenium\\chromedriver.exe");
		  // System.setProperty("webdriver.chrome.driver", "C:\\Users\\Irfan\\Desktop\\Selenium\\chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.get("http://www.google.com/");	
		
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("jj");
		

	}


	@When("^Enter criteria$")
	public void enter_search_creteria() throws Throwable 
	{
		System.out.println("Enter criteria");

	}

	@Then("^click on it$")
	public void click_on_search_button() throws Throwable 
	{
		System.out.println("Enter criteria");

	}


}
