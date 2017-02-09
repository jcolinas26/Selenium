package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mindera {
	
public static void main(String[] args) {
		
		// Create a new instance of the Firefox driver
	WebDriver driver;
	String website = "https://www.mindera.com/";
	System.setProperty("webdriver.gecko.driver", "/Users/JC/Desktop/JC/Selenium/geckodriver");
	driver =new FirefoxDriver();
		
        //Launch the Online Store Website
		driver.get(website);
 
        // Print a Log In message to the screen
        System.out.println("Successfully opened the website " + website);
        
        //Deploy hamburguer menu
        WebElement hamburguer = Midera3.hamburguer(driver);
        hamburguer.click();
        System.out.println("after click");        
     
        Mindera2.sleep(5000);

        driver.findElement(By.partialLinkText("Case")).click();
		

    }

}
