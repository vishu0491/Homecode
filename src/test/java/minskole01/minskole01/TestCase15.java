package minskole01.minskole01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub -- Ajax Loader Checkek 
		   System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");

	       // Create an instance of WebDriver
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://webdriveruniversity.com/Popup-Alerts/index.html");
	       
	       driver.findElement(By.id("button3")).click();
	       
	       
	     //  driver.findElement(null)
	       
	       
		
		
		
		

	}

}
