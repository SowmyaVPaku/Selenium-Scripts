/*Scenario 1: To test the working of the website 'amazon.com' and type ’Books’ and click ok.*/

package com.amazon.selenium.webdriver.basic;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import com.sun.jna.platform.mac.Carbon.EventHotKeyID.ByValue;

public class Day1 {
	
	WebDriver driver;  
	/*To Execute JavaScripts*/
	
	
	// Invoke Browser
	public void invokeBrowser(){
		//Try Catch - Select code - right click - surround with - Try/catch.
		try {
			
			//property has key value and pair - key is webdriver.chrome.driver and value is where 
			//the driver is placed.In java double backspaces is required
			
			System.setProperty("webdriver.chrome.driver", "D:\\Sowmya\\chromedriver\\chromedriver.exe");
			//Instantiate driver
			driver = new ChromeDriver(); 
			//Now all set to use the functions.
			
			driver.manage().deleteAllCookies();
			//When a browser is instantiated, its in minimum size.
			driver.manage().window().maximize();
			//Page Synchronization - important part in automation testing.
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
			/*Time taking to open the website - depends on server speed and internet speed.
			Since, its time taking. In the code if I write code to open the website and select 
			an option and click on it. But, the website has not opened yet and the code moves to 
			next step, leading to code failure. Hence, Page Synchronization is required.*/
			
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
			//call URL - Get funtion is used. 
			driver.get("https://www.amazon.com");
			searchBooks();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
public void searchBooks(){
	
	//Find element function is used to find elements.	//searchDropdownBox
	try {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Books");
		Thread.sleep(5000);//Milli Seconds - 5seconds
		driver.findElement(By.className("nav-input")).click();
		/* Casting the executor to execute javascript*/
		
	     
		driver.findElement(By.linkText("/Best-Books-of-the-Year-So-Far/b/ref=bhp_brws_botysf17?ie=UTF8&node=3003015011&pf_rd_m=ATVPDKIKX0DER&pf_rd_s=merchandised-search-leftnav&pf_rd_r=40S6M1J4HV5FPQWSVGE6&pf_rd_r=40S6M1J4HV5FPQWSVGE6&pf_rd_t=101&pf_rd_p=35241925-d18d-4090-b6b8-fdc60dbc4e4d&pf_rd_p=35241925-d18d-4090-b6b8-fdc60dbc4e4d&pf_rd_i=283155")).click();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	/*Select objSelect = new Select(driver.findElement(By.id("searchDropdownBox")));
	objSelect.selectByVisibleText("Books");*/
}

	public static void main(String[] args) {
		
		//Create an Object of the class invokebrowser.
		Day1 myObj = new Day1();
		myObj.invokeBrowser();
		
		

	}

}
