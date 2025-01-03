package minskole01.minskole01;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase14 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		   System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");

	       // Create an instance of WebDriver
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://webdriveruniversity.com/Popup-Alerts/index.html");
	       
	       driver.findElement(By.id("button2")).click();
	       
	     Thread.sleep(100);
	     WebElement modalText = driver.findElement(By.xpath("//div[@class=\"modal-content\"]"));
	     String text = modalText.getText();
         System.out.println("Text from modal: " + text);
	     
	     
//	      driver.findElement(By.className("modal-body")).click();
	     
//	        String text  =gettext.getText();
//	        
//	        System.out.println("text");
//	        
	       
	       
	     WebElement  close = driver.findElement(By.xpath("//button[@class=\"btn btn-default\"]"));
	     
	     
	     
	     close.click();
	     
	       
	       
	      // Thread.sleep(100);
	       
	       
//	      String gettext= driver.findElement(By.id("modal-body")).getText();
//	      
//	      System.out.println(gettext);
//	       
	      
	       
	       
	       
	       
//	       WebElement changeAlert = driver.findElement(By.id("confirm-alert-text"));
//	     
//	       driver.findElement(By.id("button4")).click();
//	       
//	       Alert alert = driver.switchTo().alert();
//	       
	       
	       
	       
	       
	   
	       

	}

}
