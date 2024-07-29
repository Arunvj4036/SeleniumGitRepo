package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class github {

	
	@Test
	 public void test() {
	 
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://github.com/");
	 System.out.println("github launched");
	}
	 
}
