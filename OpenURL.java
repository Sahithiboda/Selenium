package home_page;

import org.openqa.selenium.By;
//import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenURL {
	public static void main(String[] args){
	
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sahithi\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("http://www.google.com/");
			WebElement element=driver.findElement(By.name("q"));
			element.sendKeys("theegiants");
			element.submit();
			
		   // driver.close();
		    //driver.quit();
			
			
		

	}
}
