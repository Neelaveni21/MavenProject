package TestClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SImpleCode {
    @Test
    public void openGoogle() {
       
        
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        String title = driver.getTitle();
        System.out.println("Title: " + title);

        Assert.assertTrue(title.contains("Google"));

        driver.quit();
    }
}

