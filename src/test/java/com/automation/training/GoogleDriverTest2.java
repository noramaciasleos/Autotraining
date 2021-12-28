package com.automation.training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public abstract class GoogleDriverTest2 {
    protected WebDriver driver;

    public GoogleDriverTest2() {
        super();
    }

    @BeforeTest
    public void beforeTest() {
        //Create a instance of your web driver - chrome
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nora.macias\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

