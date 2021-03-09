package com.vapasi.selenium.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Driver {
    protected static WebDriver driver;
    protected static WebDriverWait wait;

    static {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 6);
    }
    public static WebDriver getDriver() {
        return driver;
    }

    public static void setUrl() {
        driver.get("http://spree-vapasi.herokuapp.com");
    }
    public void close() {
        driver.close();
    }

    public static void clearCookies(){
        driver.manage().deleteAllCookies();
    }
    public static WebDriverWait getWait() {
        return wait;
    }
}
