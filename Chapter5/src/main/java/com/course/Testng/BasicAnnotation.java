package com.course.Testng;

import org.testng.annotations.*;

public class BasicAnnotation {

    @Test
    public void TestCase1(){
        System.out.println("this's a testcase!!!");
    }

    @BeforeMethod
    public void BeforeTestCase(){
        System.out.println("this's a beforeTestCase");
    }

    @AfterMethod
    public void AfterTestCase(){
        System.out.println("this's a aftertestcase");
    }

    @BeforeClass
    public void BeforeClassTest(){
        System.out.println("this's a beforeclass");
    }

    @AfterClass
    public void AfterclassTest(){
        System.out.println("this's a afterclass");
    }

}
