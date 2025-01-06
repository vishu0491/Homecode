package minskole01.minskole01;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCase16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");

	       // Create an instance of WebDriver
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://webdriveruniversity.com/Actions/index.html");
	       
	       
	       Actions actions = new Actions(driver);
	       
	       driver.manage().window().maximize();
	       
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       
	       // test Case Drag and Drop 
	       
	      /// WebElement draggle = driver.findElement(By.className("ui-widget-content ui-draggable ui-draggable-handle"));
	       
	     //  WebElement  dropebal = driver.findElement(By.cssSelector("class=\"ui-widget-header ui-droppable\""));
	      
//	      WebElement draggable = driver.findElement(By.id("draggable")) ;
//	      WebElement droppable = driver.findElement(By.id("droppable"));
//	       
//	      actions.dragAndDrop(draggable,droppable).perform();
//	      
//	      WebElement para =driver.findElement(By.tagName("p"));
//	      
//	      System.out.println(para.getText());
//	      
//	      if(para.getText().equals("Dropped!")) {
//	    	  System.out.println("Test Case pass");
//	      }
//	      else {
//	    	  System.out.println("test case failed");
//	      }
	      
	      // Test case 2
	      
	    WebElement  hoverE =  driver.findElement(By.cssSelector("#div-hover > div.dropdown.hover > button"));
	     
	    actions.moveToElement(hoverE).perform();
	    
	   WebElement linkE = driver.findElement(By.cssSelector("#div-hover > div.dropdown.hover > div > a"));
	    
	   System.out.println(linkE.isDisplayed());
	   
	   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	   wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#div-hover > div.dropdown.hover > div > a")));
	   wait.until(ExpectedConditions.elementToBeClickable(linkE));
	   
	   linkE.click();
	   Alert alert = driver.switchTo().alert();
	   System.out.println(alert.getText());
	   alert.accept();
	   
	   
	   // double clcik 
	   
	   WebElement Doubleclick  = driver.findElement(By.id("double-click"));
	   
	   System.out.println(Doubleclick.getText());
	   
	   actions.doubleClick().perform();
	   
	   System.out.println(Doubleclick.getCssValue("color"));
	   
	   // click and hold opertions
	   
	   
	   WebElement clickAndhold = driver.findElement(By.id("click-box"));
	   System.out.println(clickAndhold.getText());
	   
	   actions.clickAndHold(clickAndhold).perform();
	   System.out.println(clickAndhold.getText());
	   
	   
	   // well done! keep holding that click now ....
	   
	   WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(10));
	   
	   
	   wait2.until(ExpectedConditions.textToBePresentInElementLocated(By.id("click-box"),"Well done! keep holding that click now....."));
	   
	   if(clickAndhold.getText().equals("well done! keep holding that click now ....")) {
		   System.out.println("test Case pass");
	   }
	   else {
		   System.out.println("test caseFaile");
	   }
	  // wait2.until(ExpectedConditions.textToBe(null, null))
	 
	   
	             
	   		
	}

}
