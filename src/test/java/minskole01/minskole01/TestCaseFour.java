package minskole01.minskole01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win64\\chromedriver.exe");
	    // Create an instance of WebDriver
		   
             WebDriver driver = new ChromeDriver();
	    //     driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");
	        
	        // click()
	         
//	         driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)")).sendKeys("vishal");
//	         driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)")).sendKeys("jadhav");
//	         driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)")).sendKeys("vishal@gmail.com");
//	         driver.findElement(By.cssSelector("#contact_form > textarea")).sendKeys("hiii");
//	         driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)")).click();
//	         
	        //driver.quit();
	         // submit() --- form
//	        driver.findElement(By.id("contact_form")).submit();
	         
             
	        driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		      
	         // is Dispalyed () // boolean
	         
	       boolean headerE = driver.findElement(By.cssSelector("#main-header > h1")).isDisplayed();
	        
	        if (headerE) {
	        	System.out.println("Test case pass");
	        }
	        else
	        {
	        	System.out.println("Test case failed");
	        }
	        
	        
	        // is selected 
	        
	      boolean PumpkinE= driver.findElement(By.xpath("//*[@id=\"radio-buttons-selected-disabled\"]/input[3]")).isSelected();
	       if (PumpkinE) {
	    	   System.out.println("Test case pass 2");
	       }
	       
	       else {
	    	   System.out.println("Test case dailed 2");
	       }
	        
	       // isEnabled() // boolean
	        
	        boolean CabbageE = driver.findElement(By.cssSelector("#radio-buttons-selected-disabled > input[type=radio]:nth-child(3)")).isEnabled();
	        
	        if(CabbageE) {
	        	System.out.println("test case fail...");
	        }
	        else {
	        	System.out.println("test case pass...2");
	        }
	        
	        
	       
//	       // is Enabled 
//	       boolean CabbageE=driver.findElement(By.xpath("//*[@id=\"radio-buttons-selected-disabled\"]/input[2]")).isEnabled();
//	       if(CabbageE) {
//	    	   System.out.println("test Case pass 3");
//	       }
//	       else {
//	    	   System.out.println("Test case failed 3");
//	       }
	    	  
 
	}

}
