package minskole01.minskole01;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseSeven {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
	    System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win64\\chromedriver.exe");
	      // Create an instance of WebDriver
		   
		 
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com");
      
        
    
        driver.findElement(By.id("contact-us")).click();
        

        
        driver.findElement(By.id("login-portal")).click();
        
        driver.findElement(By.id("button-clicks")).click();
        
        System.out.println(driver.getTitle());
        
        // handles 
       Set<String> windowHandles=   driver.getWindowHandles();
       for(String handle:windowHandles) {
    	   System.out.println(handle);
    	   driver.switchTo().window(handle);
    	   System.out.println(driver.getTitle());
    	   
       }
 
	}

}
