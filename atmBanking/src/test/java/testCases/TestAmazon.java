package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestAmazon 
{
	@Test
	public void openAmazon()
	{
		ChromeOptions options =new ChromeOptions();
		options.setHeadless(true);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver(options);
		driver.get("https://www.amazon.com");
		System.out.print("The page title is "+driver.getTitle());
		System.out.println("This is the git");
		
		System.out.println("New git Practice");
		
	}

}
