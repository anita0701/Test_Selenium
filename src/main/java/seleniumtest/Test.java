package seleniumtest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

		 public static void main(String[] args) 
		 {
			  System.setProperty("webdriver.chrome.driver","/home/anita/eclipse-workspace/seleniumtest/drivers/chromedriver");
			 WebDriver driver = new ChromeDriver();
			 driver.get("http://google.com");
			 String pageTitle = driver.getTitle();
			 System.out.println("page title is :" + pageTitle);
			 
		 }		

	

}
