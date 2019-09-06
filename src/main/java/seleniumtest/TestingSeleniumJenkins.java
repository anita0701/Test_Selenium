package seleniumtest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class TestingSeleniumJenkins {
	public static final String JENKINS_BUILD_PATH = "/var/lib/jenkins/workspace/MavenSeleniumDemoproject/";
	@Test
	public void test()
	{

		DesiredCapabilities capability = DesiredCapabilities.chrome();
		System.setProperty("webdriver.chrome.driver",JENKINS_BUILD_PATH+"drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://www.tsdugout.in/");
		String pageTitle = driver.getTitle();
		System.out.println("page title is :" + pageTitle);

	}		



}
