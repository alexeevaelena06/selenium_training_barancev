package ru.stqa.training.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;


public class MyFirstTest {
    private WebDriver driver;
//    private Wait<WebDriver> wait;

    @Before
    public  void start() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-fullscreen");
        driver = new ChromeDriver(options);
//        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability(ChromeOptions.CAPABILITY, options);
//        driver = new ChromeDriver(caps);
        System.out.println(((HasCapabilities) driver).getCapabilities());
//        driver = new ChromeDriver(
//                new ChromeDriverService.Builder()
//                .usingDriverExecutable(new File("C:/Tools/chromedriver.exe")).build());
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
