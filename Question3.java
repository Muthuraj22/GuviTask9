package Task9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question3 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.wikipedia.org");
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.name("search"));
		search.sendKeys("Artificial Intelligence");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.id("toc-History")).click();
		
		String title = driver.getTitle();
		System.out.println("Title is: "+title);
		
		
	}

}
