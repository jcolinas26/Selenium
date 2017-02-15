package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
        
        WebElement p = driver.findElement(By.xpath("//*[@id='react-mount']/div/div[1]/div[2]/div[2]/a[5]"));
        p.click();
        
       /* try{
        parent4.click();
        }
        catch(Exception e){
        	System.out.println("exception");
        	e.printStackTrace();
        }*/
		

    }

}
