package minskole01.minskole01;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
	   System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");

       // Create an instance of WebDriver
       WebDriver driver = new ChromeDriver();
       driver.get("https://webdriveruniversity.com/Popup-Alerts/index.html");
       
        WebElement changeAlert = driver.findElement(By.id("confirm-alert-text"));
		driver.findElement(By.id("button4")).click();
		Alert alert = driver.switchTo().alert();
		
		// verify the alert text
		
		String alerttext = alert.getText();
		
		// ok
		System.out.println(alerttext);
		alert.accept();
		if(changeAlert.getText().equals("You pressed OK!")) {
			System.out.println("Test Case passed...");
		}
		else {
			System.out.println("Test case failed");
		}
		
		
		// cancele 
		
		driver.findElement(By.id("button4"));
		alert = driver.switchTo().alert();
		alert.dismiss();
		
		if(changeAlert.getText().equals("You pressed OK!")) {
			System.out.println("Test case passed");
		}
		
		else {
			System.out.println("Test case failed ");
		}
		
		
		
		

	}

}
