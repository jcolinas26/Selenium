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
        
        driver.findElement(By.name("s")).sendKeys("gracias");
        driver.findElement(By.name("s")).submit();
        System.out.println("Submit on search box");
        //driver.findElement(By.partialLinkText("Opening doors")).click();
 
		//Wait for 5 Sec
		/*try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        // Close the driver
        driver.quit();*/
    }
}
