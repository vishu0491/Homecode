package minskole01.minskole01;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestCaseThree {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
		
				// Webelement -- methods 
		
		
				// Webdriver -- methods
				
				//<input name="first_name" type="text" class="feedback-input" placeholder="First Name" fdprocessedid="povzi">

	  	        System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win64\\chromedriver.exe");
		  // Create an instance of WebDriver
		        // Create an instance of WebDriver
		        WebDriver driver = new ChromeDriver();
		        driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");
                WebElement headerElement= driver.findElement(By.cssSelector("h2[name='contactme']"));
                
                //<h2 name="contactme" class="section_header">CONTACT US</h2>
                String elementText = headerElement.getText();
                System.out.println(elementText);
                
                WebElement FirstName=driver.findElement(By.name("first_name"));
                FirstName.sendKeys("vishal");
                
                //clear
                FirstName.clear();
                //Get Attribute 
                //// <input class="contact_button" type="submit" value="SUBMIT" fdprocessedid="cqarv">
                
                WebElement submit_button=driver.findElement(By.cssSelector("input[class='contact_button'][type='submit']"));
                String ele =submit_button.getAttribute("value");
                System.out.println(ele);
        		
        		Thread.sleep(3000);
        		driver.quit();
        		
                
                
                
	}

}
