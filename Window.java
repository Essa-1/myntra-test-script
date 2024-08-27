package opentobroswer;
import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

import org.openqa.selenium.chrome.ChromeDriver;
public class Window {
	
	public static void main(String[]args)throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/?utm_source=dms_google&utm_medium=searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_SOK_New&gad_source=1&gclid=Cj0KCQjw2ou2BhCCARIsANAwM2HUTMae1qFJWKTPX7YIRQznzinPje7WABRnVOoVkJPFYhINvaZEJ9gaAgINEALw_wcB");
		for(int i=1;i<4;i++) {
		driver.switchTo().newWindow(WindowType.WINDOW);
		}
		Thread.sleep(2000);
//		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.myntra.com/shop/men");
		Thread.sleep(2000);Thread.sleep(2000);
//		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.myntra.com/shop/women");
		Thread.sleep(2000);
//		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.myntra.com/shop/kids");
		
		Set<String> allWid =driver.getWindowHandles();
		for(String Wid:allWid) {
			String widTitle=driver.switchTo().window(Wid).getTitle();
			System.out.println("widTitle");
			if(widTitle.equals("Online Shopping for Women, Men, Kids Fashion &amp; Lifestyle - Myntra"));
			
			{
				System.out.println("1st window");
			}
			 if(widTitle.equals("Men Shopping Online - Shop for Mens Clothing & Accessories in India | Myntra")) 
			{
				System.out.println("2nd window");
				int xAxis=driver.manage().window().getPosition().getX();
				System.out.println("the x axis is = " + xAxis);
				int yAxis=driver.manage().window().getPosition().getY();
				System.out.println("the y axis is = " + yAxis);
			}
			else if(widTitle.equals("Online Shopping for Women - Shop For Women Clothes, Shoes, Bags & More"))
			{
				System.out.println("3rd window");
				int windowHeight=driver.manage().window().getSize().getHeight();
				System.out.println("the window height is = " + windowHeight);
				int windowWidth=driver.manage().window().getSize().getWidth();
				System.out.println("the window height is = " + windowWidth);
			}
			else if(widTitle.equals("Kids Clothing - Buy Kids Clothes, Dresses & Bottom wear Online in India"))
			{
				System.out.println("4th window");
			
			 //set the size of child window
			 Dimension definedsize = new Dimension(800,500);
			 driver.manage().window().setSize(definedsize);
			 //set the position
			 Point defineposition=new Point(180,170 );
			 driver.manage().window().setPosition(defineposition);
		
			 
			}
			 
					
		}
	}

}
