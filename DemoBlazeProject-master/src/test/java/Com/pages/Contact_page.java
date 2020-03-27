package Com.pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contact_page {
	WebDriver driver;
	WebElement textbox;

	public void url() //Launching Chrome browser
	{
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\Chrome jars\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.get("https://google.com");
	System.out.println(driver.getTitle());

	}
	public void demoblaze_homePage()//opening Demoblaze Application
	{
		driver.get("https://demoblaze.com/index.html");
		System.out.println(driver.getTitle());
	}
	public void clickcontact()//select contact option
	{
		driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a")).click();
	}
	public void details()//passing sendkeys for message
	{
		driver.findElement(By.id("recipient-email")).sendKeys("ramya@gmail.com");
		driver.findElement(By.id("recipient-name")).sendKeys("Ramya");
		driver.findElement(By.id("message-text")).sendKeys("hello");
}
	public void send()
	{
		driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]")).click();
	}

}
