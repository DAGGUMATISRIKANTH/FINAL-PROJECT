package Com.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.FirefoxDriver;
import com.pages.WebDriverException;

import Excelutility.Excel;

public class Login_page 
{
		WebDriver driver;
		WebElement textbox;

		public void url(String browser) {
			
			try {
				if(browser.equalsIgnoreCase("chrome")) {

					 //To launch chrome browser
					 System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
					driver=new ChromeDriver();								 
				}
			else if(browser.equalsIgnoreCase("firefox")) {
					//To launch firefox browser
					System.setProperty("webdriver.gecko.driver","src/test/resources/Drivers/geckodriver.exe");
					driver=new FirefoxDriver();
				}
				
				//To maximise the browser
				 driver.manage().window().maximize();
				//To hold the browser for 50 seconds
				 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				 driver.get("https://google.com");
				 System.out.println(driver.getTitle());		
			
			} 
			catch(WebDriverException e) {
			System.out.println("browser could not be launched");
			}		
		public void demoblaze_homePage()
		{
			driver.get("https://demoblaze.com/index.html");
			System.out.println(driver.getTitle());
		}
		public void userclick()
		{
			driver.findElement(By.xpath("//*[@id=\"login2\"]")).click();
		}
		public void usernamepassword(int a) throws IOException, InterruptedException
		{
			Excel ex=new Excel();
			driver.findElement(By.id("loginusername")).sendKeys(ex.excel_username(a));
			driver.findElement(By.id("loginpassword")).sendKeys(ex.excel_password(a));
			WebElement d=driver.findElement(By.xpath("//*[@id=\"logInModal\"]//div//div//div[3]//button[2]"));
			d.click();
			}
		
}


