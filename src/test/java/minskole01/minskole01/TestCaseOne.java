package minskole01.minskole01;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestCaseOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win64\\chromedriver.exe");
		
		// create an instace of webdriver
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");
		
		
		// locator 
		// ctrl = shift = 0
		WebElement formInput = driver.findElement(By.id("contact_form"));

	if(formInput.isDisplayed()) {
		System.out.println("Test case pass..");
	}
	else {
		System.out.println("Test case failed");
	}
	// by Name
	WebElement headerElementByName=driver.findElement(By.name("contactme"));
	String txt =headerElementByName.getText();
	if(txt.equals("CONTACT US")){
		System.out.println("Test case pass 2");
	}
	else {
		System.out.println("Test case failed 2");
	}
	
	//By class name 
	WebElement headerByClassName=driver.findElement(By.className("section_header"));
	String txt2= headerByClassName.getText();
	
	if (txt.equals("section_header")) {
		System.out.println("Test case pass 3");
	}
	else {
		System.out.println("test case Failed 3");
	}
		
	//By tagName 
	
	WebElement textareaEle=driver.findElement(By.tagName("textarea"));
		if(textareaEle.isDisplayed()) {
			System.out.println("Test case pass 4");
		}
		else {
			System.out.println("Test case Failed 4");
		}
		
	// By cssSelector
		WebElement textareaEle2=driver.findElement(By.cssSelector("#contact_form > textarea"));
		if (textareaEle2.isDisplayed()) {
			System.out.println("test case pass 5");
		}
		else {
			System.out.println("Test case failed 5");
		}
		
	// by xpath 
		
	WebElement	textareaEle3=driver.findElement(By.xpath("//*[@id=\"contact_form\"]/textarea"));
		if(textareaEle3.isDisplayed()) {
			System.out.println("Test case pass 6");
		}
		else {
			System.out.println("test case Failed");
		}

	}

}
