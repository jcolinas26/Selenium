package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mindera {

	static WebDriver driver;

	public static void main(String[] args) {

		// Create a new instance of the Firefox driver

		String website = "https://www.mindera.com/";
		System.setProperty("webdriver.gecko.driver", "/Users/JC/Desktop/JC/Selenium/geckodriver");
		driver = new FirefoxDriver();

		// Launch the Online Store Website
		driver.get(website);

		// Print a Log In message to the screen
		System.out.println("Successfully opened the website " + website);

		// open all menu options
		menuOptions();

		/*
		 * try{ parent4.click(); } catch(Exception e){
		 * System.out.println("exception"); e.printStackTrace(); }
		 */

	}

	static void menuOptions() {

		int i;
		WebElement hamburguer = hamburguer();
		;
		WebElement link;

		for (i = 2; i <= 5; i++) {

			sleep(2000);
			hamburguer.click();// Deploy hamburguer menu
			sleep(2000);

			link = driver.findElement(By.xpath("//*[@id='react-mount']/div/div[1]/div[2]/div[2]/a[" + i + "]"));
			link.click();
		}

		sleep(2000);
		hamburguer.click();
		sleep(2000);

		link = driver.findElement(By.xpath("//*[@id='react-mount']/div/div[1]/div[2]/div[2]/a[1]"));
		link.click();

	}

	static WebElement hamburguer() {

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

	static void sleep(int sec) {

		// Wait for x Sec
		try {
			Thread.sleep(sec);
			System.out.println("Wait for " + sec + "  sec");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
