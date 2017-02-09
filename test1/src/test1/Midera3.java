package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Midera3 {
	
	public static WebElement hamburguer(WebDriver driver){
		
		WebElement parent1 = driver.findElement(By.id("react-mount"));
        System.out.println("element: " + parent1);
        WebElement parent2 = parent1.findElement(By.className("navigation-container"));
        System.out.println("element2: " + parent2);
        WebElement parent3 = parent2.findElement(By.className("navigation-bar"));
        System.out.println("element3: " + parent3);
        WebElement parent4 = parent3.findElement(By.tagName("use"));
        System.out.println("element4: " + parent4);
		
		return parent4;
	}

}
