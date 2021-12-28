package com.automation.training;

import org.testng.Assert;
import org.testng.annotations.*;

public class AutomationTest {
    @DataProvider(name= "username")
    public Object[] [] username(){
        return new Object[][] {{"Nora.macias"}, {"Nora.leos"}, {"NoraMl"}};
    }

    @Test (dataProvider = "username")
    public void testConcact(String username) {
        String a = "i love";
        String b = "test automation";
        String result = a + " " + b;
        Assert.assertEquals(result, "i love test automation");
        System.out.println(result +" "+ username);

    }

    @BeforeMethod
    public void login() {
        System.out.println("login to te app metodo antes");
    }

    @AfterMethod
    public void logout() {
        System.out.println("log out from the app. metodo despues ");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Antes del test ");
    }
    @AfterTest
    public void afterTest() {
        System.out.println("despues del test ");
    }
    @Test
    public void testConcact1() {
        System.out.println("Test 1");
        Assert.assertEquals("Test1", "Test1");
    }


}
