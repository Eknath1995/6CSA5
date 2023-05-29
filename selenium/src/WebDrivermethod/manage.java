package WebDrivermethod;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class manage {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver(); 	//chromeBrowser
		driver.get("https://www.fb.com");
		 Dimension a=new  Dimension (700,500);  //dimen
		driver.manage().window().setSize(a);
		
		Point b=new Point(0, 0);
		driver.manage().window().setPosition(b);
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		driver.manage().window().minimize();
//		
//		WebDriver driver1=new EdgeDriver();   		 // Edge browser
////		driver.get("https://demo.actitime.com/login.do");
//		 Dimension D=new  Dimension (700,500);
//			driver1.manage().window().setSize(D);
//			
//			Point c=new Point(700, 0);
//			driver1.manage().window().setPosition(c);
			
	}
}
