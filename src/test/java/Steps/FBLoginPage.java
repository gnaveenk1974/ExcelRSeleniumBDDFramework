package Steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLoginPage {
	
		static WebDriver driver;
		public void initialiazation() {
			driver=new ChromeDriver();
		    driver.get("https://www.facebook.com/");

		}
		public void userDetails(String username, String password) {
			driver.findElement(By.id("email")).sendKeys(username);
	        driver.findElement(By.id("pass")).sendKeys(password);
		}
		public void login() {
	        
	        driver.findElement(By.name("login")).click();

		}
	    public void tearDown() {
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    	driver.close();
	    }
	

}
