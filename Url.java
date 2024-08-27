package opentobroswer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Url {
	public static void main (String []args)throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("s_google&utm_medium=searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_SOK_New&gad_source=1&gclid=Cj0KCQjwq_G1BhCSARIsACc7NxoxRmmZijnTPQsrsMBTR8AFvLdnCx7_Pn9uL0o4X5_t1-r5yjEXt3QaArjwEALw_wcB");
		Thread.sleep(2000);
		//men
		driver.get("https://www.myntra.com/shop/men");
		Thread.sleep(2000);
		//women
		driver.get("https://www.myntra.com/shop/women");
		Thread.sleep(2000);
		//kids
		driver.get("https://www.myntra.com/shop/kids");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		//home and living
		driver.get("https://www.myntra.com/shop/home-living");
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		//beauty
		driver.get("https://www.myntra.com/personal-care");
		
		Thread.sleep(2000);
		//studio
		driver.get("https://www.myntra.com/studio/home");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		
				
	}
	

}
