package seleniumtest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestingSeleniumJenkins {
        
	     @Test
		 public void test()
		 {
			  System.setProperty("webdriver.chrome.driver","/home/anita/eclipse-workspace/seleniumtest/drivers/chromedriver");
			 WebDriver driver = new ChromeDriver();
			 driver.get("https://www.tsdugout.in/");
			 String pageTitle = driver.getTitle();
			 System.out.println("page title is :" + pageTitle);
			 
		 }		

	

}
