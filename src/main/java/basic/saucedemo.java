package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class saucedemo {
	
	@Test
	 public void test() {
	 
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.saucedemo.com/v1/");
	 System.out.println("saucedemo launched");
	}
	 
}


