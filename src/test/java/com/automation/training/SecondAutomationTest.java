package com.automation.training;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class SecondAutomationTest {

    @Test(groups = {"grupo1"})
    public void testConcact1(){
        String a= "i love";
        String b ="test automation";
        String result= a +" " + b;
        Assert.assertEquals(result, "i love test automations");
        System.out.println(result);
        System.out.println("este es gpo 1 de pruebas");

    }

    @Test (groups = {"grupo1" })
    public void testConcact2() {
        System.out.println("Test 2 grupo 2");
        Assert.assertEquals("Test2", "Test2");

    }
    @Parameters({"stringA", "stringB"})
    @Test (groups = {"grupo2" })
    public  void testContact(String a , String b){
        String result= a  + b;
        Assert.assertEquals(result,"I love test automation");
        System.out.println(result);
    }


}
