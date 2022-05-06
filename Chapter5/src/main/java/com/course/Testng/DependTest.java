package com.course.Testng;

import org.testng.annotations.Test;

public class DependTest {

    @Test
    public void Test1(){
        System.out.println("this's a test1");
        //throw new RuntimeException();
    }

    @Test(dependsOnMethods = {"Test1"})
    public void Test2(){
        System.out.println("this's a test2");
    }
}
