package base;


import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ReadXLSdata;

public class BaseTest {
	
	
	public static WebDriver driver = null;
	public static Properties prop = new Properties();
	public static Properties Loc = new Properties();
	public static FileReader fr;
	public static FileReader fr1;
	
	@BeforeTest
	public void setUp() throws IOException, InterruptedException {
		
		if(driver==null) {
			FileReader fr = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\config.properties");
			FileReader fr1 = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\locator.properties");
			prop.load(fr);
			prop.load(fr1);
		}
		
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium - Java\\chromedriver.exe"); //base
		    driver = new ChromeDriver(); //base
			driver.get(prop.getProperty("testurl")); //properties
			
		}
		else if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
			 driver.get(prop.getProperty("testurl")); //properties
		}
		
	}
	@Test(dataProviderClass=ReadXLSdata.class,dataProvider="test")
//	@Test(dataProvider="testdata")
	public void clogin(String Phonenumber) throws InterruptedException {
	Thread.sleep(3000);
	driver.findElement(By.xpath(prop.getProperty("button_SignInWithPhone"))).click();
	Thread.sleep(9000);
	driver.findElement(By.xpath(prop.getProperty("textBox_LoginPhNumber"))).sendKeys(Phonenumber);
	
	Thread.sleep(6000);
	driver.findElement(By.xpath(prop.getProperty("Validate")));
	Thread.sleep(6000);
	WebElement verifybutton = driver.findElement(By.xpath(prop.getProperty("verifybutton")));
    verifybutton.click();
    Thread.sleep(3000);
    driver.findElement(By.xpath(prop.getProperty("textBox_DigitCode"))).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath(prop.getProperty("textBox_DigitCode"))).sendKeys("123456");
    Assert.assertTrue(false);
   
    Thread.sleep(5000);
    driver.findElement(By.xpath(prop.getProperty("button_Continue"))).click();
    Thread.sleep(3000);
    driver.get("http://awsdev11.samaaru.com:3001/");
	}
//	@DataProvider(name = "testdata")
//	public Object[][] tData()
// 	{
//	return new Object[][] {
//		{"1234510003"}
//	
//	};
//			
//	}
// 	@AfterMethod
//	public void tearDown() {
//		driver.close();
//		System.out.println("teardown successful");
//    
//	}
}
