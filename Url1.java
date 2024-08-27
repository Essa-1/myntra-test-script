package opentobroswer;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Url1 {
	public static void main (String []args)throws InterruptedException, MalformedURLException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/?utm_source=dms_google&utm_medium=searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_SOK_New&gad_source=1&gclid=Cj0KCQjwq_G1BhCSARIsACc7Nxq5pHGODmXHOPOlAQxkL3WoJ0_AMt5loa0zaa6WwWcl5dhWuDU2wbwaAo3FEALw_wcB");
		Thread.sleep(2000);
		URL mainUrl=new URL("https://www.myntra.com/?utm_source=dms_google&utm_medium=searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_SOK_New&gad_source=1&gclid=Cj0KCQjwq_G1BhCSARIsACc7Nxq5pHGODmXHOPOlAQxkL3WoJ0_AMt5loa0zaa6WwWcl5dhWuDU2wbwaAo3FEALw_wcB");
		//men
		URL menUrl=new URL(mainUrl,"/men");
		driver.navigate().to(menUrl);
		Thread.sleep(2000);
		//women
		URL womenUrl=new URL(mainUrl,"/women");
		driver.navigate().to(womenUrl);
		Thread.sleep(2000);
		//kids
		URL kidsUrl=new URL(mainUrl,"/kids");
		driver.navigate().to(kidsUrl);
		Thread.sleep(2000);
		//home and living
		URL homeUrl=new URL(mainUrl,"/home-living");
		driver.navigate().to(homeUrl);
		Thread.sleep(2000);
		//beauty
		URL beautyUrl=new URL(mainUrl,"/personal-care");
		driver.navigate().to(beautyUrl);
		Thread.sleep(2000);
		//studio
		URL studioUrl=new URL(mainUrl,"/home");
		driver.navigate().to(studioUrl);
		Thread.sleep(2000);
		driver.manage().window().minimize();
		
		
	}
}