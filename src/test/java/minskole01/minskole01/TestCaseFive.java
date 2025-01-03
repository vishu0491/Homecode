package minskole01.minskole01;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				 System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win64\\chromedriver.exe");
			      // Create an instance of WebDriver
				   
				 
		         WebDriver driver = new ChromeDriver();
		         driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");
		         
		         
		        WebElement ele = driver.findElement(By.cssSelector("h2[name=\"contactme\"]"));
		         
		        String  fonts = ele.getCssValue("Font-size");
		        System.out.println(fonts);
		        
		        
		        // get TagName 
		        
		        String tagName =ele.getTagName();
		        System.out.println(tagName);
		        
		        int a = 10;
		        
		        // get size()

		        Dimension size = ele.getSize();
		        int x = size.getHeight();
		        int y = size.getWidth();
		        System.out.println(x);
		        System.out.println(y);
		        
		        
		        Point co = ele.getLocation();
		        System.out.println();
		        System.out.println(co.x);
		        System.out.println(co.y);
		        
		        
		        
		        
		        		
		        
		         
		         
			 

	}

}
