package com.vapasi.selenium.pages;

import com.vapasi.selenium.helpers.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends Driver {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage() {
        this.driver = Driver.getDriver();
        this.wait = Driver.getWait();
        PageFactory.initElements(driver,this);
    }

}
