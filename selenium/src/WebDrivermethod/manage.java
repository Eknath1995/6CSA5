package WebDrivermethod;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class manage {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver(); 	//chromeBrowser
//		driver.get("https://www.fb.com");
		 Dimension a=new  Dimension (300,500);
		driver.manage().window().setSize(a);
		
		Point b=new Point(0, 0);
		driver.manage().window().setPosition(b);
		
		WebDriver driver1=new EdgeDriver();   		 // Edge browser
//		driver.get("https://demo.actitime.com/login.do");
		 Dimension D=new  Dimension (300,500);
			driver.manage().window().setSize(D);
			
			Point c=new Point(700, 0);
			driver.manage().window().setPosition(c);
			
	}
}
