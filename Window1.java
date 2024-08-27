package opentobroswer;
import java.util.Set;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

import org.openqa.selenium.chrome.ChromeDriver;
public class Window1 {
	
	public static void main(String[]args) {
		WebDriver driver=new ChromeDriver();
		for(int i=0;i<4;i++)
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/?utm_source=dms_google&utm_medium=searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_SOK_New&gad_source=1&gclid=Cj0KCQjw2ou2BhCCARIsANAwM2HUTMae1qFJWKTPX7YIRQznzinPje7WABRnVOoVkJPFYhINvaZEJ9gaAgINEALw_wcB");
		
		
		
	}
}
