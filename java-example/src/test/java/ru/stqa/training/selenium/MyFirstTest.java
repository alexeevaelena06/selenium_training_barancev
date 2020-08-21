package ru.stqa.training.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class MyFirstTest {
    private WebDriver driver;
//    private Wait<WebDriver> wait;

    @Before
    public  void start() {
        driver = new ChromeDriver();
//        wait = new WebDriverWait(driver, Duration.ofSeconds(10)).withMessage("Element was not found");
    }

    @Test
    public void myFirstTest() {
        driver.get("http://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("webdriver" + Keys.ENTER);
        Actions actionProvider = new Actions(driver);
        Action keydown = actionProvider.keyDown(Keys.CONTROL).sendKeys("a").build();
        keydown.perform();

    }

    @After
    public void stop() {
        driver.quit();
        driver = null;
    }

}
