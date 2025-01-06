package minskole01.minskole01;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCase17_JS_exe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");

	       // Create an instance of WebDriver
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://www.saucedemo.com/v1/");
	       
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	            
	       // Selenium 
//	       
//	       driver.findElement(By.id("user-name")).sendKeys("standard_user");
//	       driver.findElement(By.id("password")).sendKeys("secret_sauce");
//	       
	       
	       
	       JavascriptExecutor js = (JavascriptExecutor) driver;

	    // Set username and password using JavaScript
	    js.executeScript("document.getElementById('user-name').value='standard_user'");
	    js.executeScript("document.getElementById('password').value='secret_sauce'");

	    // Click the login button using JavaScript
	    js.executeScript("document.getElementById('login-button').click();");

	    // Wait for the login to complete and validate the URL
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.urlToBe("https://www.saucedemo.com/inventory.html"));

	    if (driver.getCurrentUrl().equals("https://www.saucedemo.com/inventory.html")) {
	        System.out.println("Test Case Pass");
	    } else {
	        System.out.println("Test Case Fail");
	    }

	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
//	       JavascriptExecutor js = (JavascriptExecutor)driver;
//	       
//	       js.executeScript("document.getElementById('user-name').value='standard_user';");  
//	      
//	       js.executeScript("document.getElementById('password').value='secret_sauce';");
//	       js.executeScript("document.getElementById('login-button').click();");
//	       
//	       
//	       if(driver.getCurrentUrl().equals("https://www.saucedemo.com/v1/inventory.html")) {
//	    	   System.out.println("testCase pass");
//	       }
//	       else {
//	    	   System.out.println("Test Case Fail");
//	       }
//		
//	       
		
  	}

}
