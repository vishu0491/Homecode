package minskole01.minskole01;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase12 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		     System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");

	        // Create an instance of WebDriver
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://webdriveruniversity.com/Popup-Alerts/index.html");
	        
	        driver.findElement(By.id("button1")).click();
	        
	        Alert alert = driver.switchTo().alert();
	        alert.accept();
            Thread.sleep(100);
            driver.quit();
            
	        
		
	     
		
	}

}
