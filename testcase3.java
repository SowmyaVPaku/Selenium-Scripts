/*Scenario 3:Test to Open the URL and click on an element and navigate back, forward and refresh again and finally close the browser.*/

package com.amazon.selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNavigateCommands {
	WebDriver driver;

	public void involeBrowser() {

		try {
			System.setProperty("webdriver.chrome.driver", "D:\\Sowmya\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			navigateCommands();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void navigateCommands(){
		try {
			driver.navigate().to("https://www.flipkart.com/");
			driver.findElement(By.linkText("Advertise")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			driver.navigate().forward();
			Thread.sleep(2000);
			driver.navigate().refresh();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestNavigateCommands myObj = new TestNavigateCommands();
		myObj.involeBrowser();
		
	}

}

