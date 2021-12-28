package com.automation.training;
    import org.openqa.selenium.Keys;
    import org.openqa.selenium.interactions.SendKeysAction;
    import org.testng.Assert;
    import org.testng.annotations.Test;
    import org.openqa.selenium.By;
    import org.openqa.selenium.WebElement;

    import java.security.Key;
    import java.util.concurrent.TimeUnit;



public class LocatorsTest extends GoogleDriverTest2 {
        @Test
    public  void  testLocatorId ()  {
            driver.get("https://www.google.com");
            WebElement searcher = driver.findElement(By.cssSelector("input[title=Buscar]"));
            searcher.sendKeys("santander"+ Keys.ENTER);
            driver.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);
            WebElement result = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/a/h3/span"));
            result.click();









            // driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

        }
}
