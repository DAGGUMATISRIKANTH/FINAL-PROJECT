
	package com.pages;

	import java.io.File;
import java.io.IOException;
	import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

	public class deletefromcart {
WebDriver driver;
		
		public void url(String browser) 
		{
			//To launch Chrome Browser
			if(browser.equalsIgnoreCase("Chrome"))
			{
		System.setProperty("webdriver.chrome.driver", "D:\\chrome driver\\chromedriver.exe");
		driver = new ChromeDriver();
			}
			//To launch Firefox Driver
			else if(browser.equalsIgnoreCase("Firefox"))
			{
				System.setProperty("webdriver.firefox.driver", "D:\\java app\\geckodriver.exe");
				driver = new ChromeDriver();
			}
			//To launch InternetExplorerDriver
			else if(browser.equalsIgnoreCase("IEDriver"))
			{
				System.setProperty("webdriver.ie.driver", "D:\\java app\\IEDriverServer.exe");
				driver = new ChromeDriver();
			}
			//To Maximize the Window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://google.com");
		System.out.println(driver.getTitle());

		}
		public void demoblaze_homePage()
		{
			driver.get("https://demoblaze.com/index.html");//launching Demoblaze website
			System.out.println(driver.getTitle());
		}
		
		public void Select_product()
		{
			WebElement a= driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a"));//selecting product
			a.click();
			
		}
		public void Add_cart() throws IOException, InterruptedException
		{
			WebElement b=driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a"));//Go to cart
			b.click();
			Thread.sleep(5000);
			Alert alert=driver.switchTo().alert();
			String s=driver.switchTo().alert().getText();
			System.out.println(s);
			Thread.sleep(5000);
			alert.accept();
			
		}
		public void cart() throws IOException 
		{
			driver.findElement(By.xpath("//*[@id=\"cartur\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/tr/td[4]/a")).click();//Remove from cart
					
		
	

	}}





