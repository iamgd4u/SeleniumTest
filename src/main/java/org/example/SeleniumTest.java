package org.example;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    @Test
    public void testTitle() {
        // Set up WebDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Open website
        driver.get("https://www.google.com");

        // Test title
        String title = driver.getTitle();
        Assert.assertEquals("Google", title);

        // Quit WebDriver
        driver.quit();
    }
}