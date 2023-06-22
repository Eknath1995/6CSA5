package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		
//		WebElement email=driver.findElement(By.id("email"));  //fb
//		email.click();
//		email.sendKeys("9901188524");
//		WebElement password=driver.findElement(By.id("pass")); //fb
//		password.click();
//		password.sendKeys("helloji");
//----------------------------------------------------------------
//		----storing and searching the data----  //amazon
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("apple phones");
//	---------------	-------------------------------------------------------
//		----Direct searching----  //demo webshop
		
//		driver.findElement(By.id("small-searchterms")).sendKeys("cricket bat");
		
//		driver.findElement(By.name("q")).sendKeys("cricket bat");
		
//-----------------------------------------------------------------------
//				---acti- time----	
//   driver.switchTo().activeElement().sendKeys("helloo");
		
	}
}
