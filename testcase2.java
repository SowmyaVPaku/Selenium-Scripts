/* Scenarios2: To test the URL and get the title of the page and get the current URL and finally quit the browser..*/

package com.amazon.selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGetCommands {

	WebDriver driver;

	public void involeBrowser() {

		try {
			System.setProperty("webdriver.chrome.driver", "D:\\Sowmya\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			getCommands();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void getCommands() {

		try {
			driver.get("https://www.amazon.com");
			String titleofPage = driver.getTitle();
			System.out.println("Title of the page is..:" + titleofPage);
			driver.findElement(By.linkText("Today's Deals")).click();
			String CurrentUrl = driver.getCurrentUrl();
			System.out.println("Title of the currenlt URL is :" + CurrentUrl);
			System.out.println("The Current Page Source is :" + driver.getPageSource());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestGetCommands myObj = new TestGetCommands();
		myObj.involeBrowser();

	}

}
