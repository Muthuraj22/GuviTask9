package Task9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {

	public static void main(String[] args) {
		
		//Open Chrome
		WebDriver driver = new ChromeDriver();
		
		// navigates to demoblaze website and maximize
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		
		// Verify if the title of the page is store
		if (driver.getTitle() == "STORE") {
			System.out.println("Page landed on correct website");
			
		} else {
			System.out.println("Page not landed on correct website");
		}
		
		
		
	}

}
