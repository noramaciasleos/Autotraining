package com.automation.training;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GoogleDriver {
    public WebDriver driver;

    public GoogleDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nora.macias\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        String title = driver.getTitle();
        System.out.println(title);  // “Google”
        driver.close();
    }
}


    /*    }

        public void Test(){


            WebElement searchbox =driver.findElement(By.name("q"));
            searchbox.clear();
            searchbox.sendKeys("mi primer prueba ");
            searchbox.submit();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        }
    }

}

     */
