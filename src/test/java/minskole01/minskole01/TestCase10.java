package minskole01.minskole01;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class TestCase10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win64\\chromedriver.exe");
	      // Create an instance of WebDriver
		   
		 
       WebDriver driver = new ChromeDriver();
       driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
       
       // drop down
       
       // by visibale text 
      // by value 
       // index
   
      Select select = new Select (driver.findElement(By.id("dropdowm-menu-1")));
      select.selectByIndex(1);
      //select.selectByValue("python");
    //  select.selectByVisibleText("SQL");
      
       
       
	}

}
