package opentobroswer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrePostCondition {
	public static void main(String[]args)throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	
	// facebook
	//pre condition
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	
	driver.manage().window().fullscreen();
	Thread.sleep(2000);
	
	//post condition
	driver.manage().window().minimize();
	
	// flipkart 
	// pre condition
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	
	driver.manage().window().fullscreen();
	Thread.sleep(2000);
	
	//post condition
	driver.manage().window().minimize();
	}
}
