package Task9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Question1 {

	public static void main(String[] args) {
		
		//Open firefox browser
		WebDriver driver = new FirefoxDriver();
		
		//Maximize the browser window
		driver.manage().window().maximize();
		
		//Navigate to URL
		driver.get("https://google.com");
		
		//Getting URL
		String URL = driver.getCurrentUrl();
		System.out.println("Current URL: "+URL);
		
		//Reload the page
		driver.navigate().refresh();
		
		//Close the browser
		driver.quit();
		
	}

}
