package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class youtube {

	 @Test
	 public void test() {
	 
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.youtube.com/");
	 System.out.println("youtube launched");
	 

	}

}
