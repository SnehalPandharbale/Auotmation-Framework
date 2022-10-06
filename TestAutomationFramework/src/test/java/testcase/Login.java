package testcase;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import base.BaseTest;

public class Login extends BaseTest {
    
	 
	  @Test
	  public static void LoginTest() throws InterruptedException
	  {	
		 
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		  Thread.sleep(2000);
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(("(//p[@class = 'MuiTypography-root makeStyles-navigationMenuTypography-14 MuiTypography-body1' and @type ='body2'])[6]")))).click();
		    Thread.sleep(3000);
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(("(//p[@class = 'MuiTypography-root makeStyles-navigationMenuTypography-14 MuiTypography-body1' and @type ='body2'])[7]")))).click();
		    Thread.sleep(5000);
		    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/div[2]/div[1]/div[4]/button/span[1]")).click();
		    Thread.sleep(5000);
   		   driver.findElement(By.xpath("//div[@id='root']/div/div/div/div[2]/div/div[2]/div/div[2]/div/div/div/div")).click();
//   		   Thread.sleep(3000);
		    
//		    WebElement farmer_dropdown=driver.findElement((By.xpath("//div[@id='root']/div/div/div/div[2]/div/div[2]/div/div[2]/div/div/div/div")));
//		    System.out.println("raj");
//
//		    Select farmer=new Select(farmer_dropdown);
//
//		    List<WebElement> dropdown=farmer.getOptions();
//
//		     for(int i=0;i<dropdown.size();i++){
//
//		     String drop_down_values=dropdown.get(i).getText();
//
//		     System.out.println("dropdown values are "+drop_down_values);

		     
//		     
//		      List<WebElement> l = driver.findElements((By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/div[2]/div/div[2]/div/div/div/div[1]/div[2]")));
//		      // list iteration
//		      Thread.sleep(5000);
//		     System.out.println("Elements are:");
//		      for(int j = 0; j< l.size(); j++) {
//		         //identify separate div
//		         String v = l.get(j).getText();
//		        // System.out.println("DAF");
//		         System.out.println(v);
//		        // driver.findElement(By.id("react-select-8-option-3"));
//		      }
		    Thread.sleep(5000);
		    driver.findElement(By.id("react-select-8-option-3"));
		    Thread.sleep(3000);
		    driver.findElement(By.id("react-select-8-option-2"));
		    Thread.sleep(2000);
		    driver.findElement(By.id("react-select-8-option-1")).click();
		    Thread.sleep(2000);
		    
		 
		        }
}