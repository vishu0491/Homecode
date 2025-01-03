package minskole01.minskole01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestCase11 {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");

	        // Create an instance of WebDriver
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
	        
//	        
//	        
//		       List <WebElement> dropdpwns = driver.findElements(By.tagName("select"));
//		       // [drp1 , drp2 , drp3]
//		       for(WebElement dropdown:dropdpwns) {
//		    	   Select select = new Select(dropdown);
//		    	   select.selectByIndex(3);
//		    	  
//		       }
//	        
	        // click all the check box 
	        
	        List<WebElement> checkboxs =driver.findElements(By.cssSelector("input[type=\"checkbox\"]"));
	        
	        // click on all checkbox 
	        for (WebElement checkbox:checkboxs) {
	        	
	        	if (!checkbox.isSelected()) {
	        		checkbox.click();
	        	}
	        	
	        }
	        
	        
	        
	        
	        // check all Radio button 
	        
	        
	        List<WebElement> radiobuttons = driver.findElements(By.cssSelector("#radio-buttons>input"));
	               	       
	        // click allradio button 
	        for(WebElement radiobutton:radiobuttons) {
	        		radiobutton.click();
	        		if(radiobutton.isSelected()) {
	        			System.out.println("Test Case pass");
	        		}
	        		
	        	}
	        
	        
	        Thread.sleep(1000);
	        
	        driver.quit();
	        
	        
	        
	}
	
	
}
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        

