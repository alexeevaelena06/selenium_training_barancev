package ru.stqa.training.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

public class TestAdminLogin {
    private WebDriver driver;
    private Wait<WebDriver> wait;

    @Before
    public  void start() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-fullscreen");
        driver = new ChromeDriver(options);}

    @Test
    public void testAdminLogin() {
        driver.get("http://localhost/litecart/admin/");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("login")).click();
//        wait.until(ExpectedConditions.visibilityOfElementLocated((By) driver.findElement(By.cssSelector("head > title"))));
        
    }

    @After
    public void stop() {
        driver.quit();
        driver = null;
    }
}
