
	package com.pages;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

	public class clickonlaptops {
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
		public void laptops() {
			driver.findElement(By.xpath("//*[@id=\"itemc\"]")).click();//selecting laptop
		}
		public void click_account()
		{
		WebElement a = driver.findElement(By.xpath("//*[@id=\"cat\"]")); 
		WebElement b = driver.findElement(By.xpath("//*[@id=\"itemc\"]"));//clicking on selected laptop
		
		Actions d= new Actions(driver);
		d.moveToElement(a);

		d.moveToElement(b).click().build().perform();
		}
		
	   }
	
	   