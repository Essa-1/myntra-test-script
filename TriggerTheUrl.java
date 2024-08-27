package opentobroswer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TriggerTheUrl {
	public static void main(String[]args) {
		//lunch the broswer
		WebDriver driver=new ChromeDriver();
		//trigger the url---main url of an appin
		//driver.get("https://www.selenium.dev/");
		//Invalid ArgumentException..sel..run..unchecked
		driver.get("Facebook.com/Signup");
	}

}
