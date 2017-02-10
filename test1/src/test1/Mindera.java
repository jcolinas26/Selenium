package test1;

import org.openqa.selenium.By;
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
        
        WebElement parent1 = driver.findElement(By.id("react-mount"));
        System.out.println("element: " + parent1);
        WebElement parent2 = parent1.findElement(By.className("navigation-container"));
        System.out.println("element2: " + parent2);
        WebElement parent3 = parent2.findElement(By.className("navigation-items"));
        System.out.println("element3: " + parent3);
        WebElement parent4 = parent3.findElement(By.linkText("Blog"));
        System.out.println("element4: " + parent4);
       
        
        WebDriverWait waiting = new WebDriverWait(driver, 30, 2500);

        WebElement element = waiting.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Blog")));
        element.click();

        
       /* try{
        parent4.click();
        }
        catch(Exception e){
        	System.out.println("exception");
        	e.printStackTrace();
        }*/
		

    }

}
