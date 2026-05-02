package TestClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SImpleCode {
    @Test
    public void openGoogle() {
    	 ChromeOptions options = new ChromeOptions();

         // IMPORTANT for CI/CD
    	 options.addArguments("--headless=new");
    	 options.addArguments("--no-sandbox");
    	 options.addArguments("--disable-dev-shm-usage");
    	 options.addArguments("--remote-allow-origins=*");

        
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.google.com");

        String title = driver.getTitle();
        System.out.println("Title: " + title);

        Assert.assertTrue(title.contains("Google"));

        driver.quit();
    }
}

