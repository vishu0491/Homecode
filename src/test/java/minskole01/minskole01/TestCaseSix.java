package minskole01.minskole01;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win64\\chromedriver.exe");
	      // Create an instance of WebDriver
		   
		 
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        
        // driver.window.maximize()

        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("[name=\"q\"]")).sendKeys("Python");
        driver.findElement(By.cssSelector("[name=\"q\"]")).sendKeys(Keys.ENTER);
        
        // get Current Url()
       
       String currenUrl = driver.getCurrentUrl();
        System.out.println(currenUrl);
        
        // get title()
        
       String Title= driver.getTitle();
       System.out.println(Title);
       
       if (Title.equals("Python - Google Search")) {
    	   System.out.println("Test case passs");
       }
       else {
    	   System.out.println("test case failed ");
    	   
       }
           
       // browser back 
       
       driver.navigate().back();
       
       Title = driver.getTitle();
       
       if(Title.equals("Python - Google Search")) {
    	   System.out.println("Test case pass");
       }
       else {
    	   System.out.println("Test case failed");
       }
        
      // driver.close();
      
        
        
        
		
		
		
		
		
	}

}
