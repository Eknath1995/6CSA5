package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName_locator {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com");
		
		driver.findElement(By.className("sc-fEUNkw gAkuDn"));
		driver.findElement(By.className("sc-1ly0uwc-0 kisDCD sc-dRaagA jtRcBY"));
		driver.findElement(By.className("sc-1mo3ldo-0 fihUGr"));
		driver.findElement(By.className("sc-gTPyfa ghviNw"));
		driver.findElement(By.className("sc-1mo3ldo-0 fihUGr"));
		driver.findElement(By.className("sc-didJYH hreiEm"));
		driver.findElement(By.className("sc-re4bd0-8 ibtWwj"));
		driver.findElement(By.className("sc-re4bd0-6 fpEMYb modalWrapper sc-ljUfdc cpfuER"));
		driver.findElement(By.className("sc-fEUNkw gAkuDn"));
		driver.findElement(By.className("sc-13lc47p-0 hOPtIO"));
		
		System.out.println("Class name identified");
		
		driver.close();
		driver.quit();
	}
}
