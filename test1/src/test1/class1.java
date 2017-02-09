package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class class1 {
	
public static void main(String[] args) {
		
		// Create a new instance of the Firefox driver
	WebDriver driver;
	String website = "http://www.amvelandia.com";
	System.setProperty("webdriver.gecko.driver", "/Users/JC/Desktop/JC/Selenium/geckodriver");
	driver =new FirefoxDriver();
		
        //Launch the Online Store Website
		driver.get(website);
 
        // Print a Log In message to the screen
        System.out.println("Successfully opened the website " + website);
        
        //Input a text in a textbox
        driver.findElement(By.name("s")).sendKeys("gracias");
        
        //Submit a query in an search inputbox
        driver.findElement(By.name("s")).submit();
        System.out.println("Submit on search box");
 
		//Wait for x Sec
        int sleep = 5000;
		try {
			Thread.sleep(sleep);
			System.out.println("Wait for " + sleep + "  sec");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		
		driver.findElement(By.partialLinkText("Opening doors")).click();
		
		/*
        // Close the driver
        driver.quit();*/
    }
}
