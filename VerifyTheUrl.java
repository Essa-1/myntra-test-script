package opentobroswer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
public class VerifyTheUrl {
public static void main(String[]args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	String actualUrl=driver.getCurrentUrl();
	String expectedUrl="https://www.facebook.com/";
	System.out.println("actualUrl= "+ actualUrl);
if(actualUrl.equals(expectedUrl))
{
	System.out.println("the url is verified and found the correct");
}
else {
	System.out.println("the url is verified and found the incorrect");
}
}
}
