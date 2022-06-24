package com.tester.extend.demo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class testMethodsDemo {

    @Test
    public void test1(){
        Assert.assertEquals(1,2);
    }

    @Test
    public void test2(){
        Assert.assertEquals(1,1);
    }

    @Test
    public void test3(){
        Assert.assertEquals("aaaa","aaaa");
    }

    @Test
    public void logDemo(){
        Reporter.log("this's a log");
        throw  new RuntimeException("ziji de yichang");
    }
}
