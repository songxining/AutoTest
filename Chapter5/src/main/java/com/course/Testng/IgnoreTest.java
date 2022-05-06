package com.course.Testng;

import org.testng.annotations.Test;

public class IgnoreTest {

    @Test
    public void Ignore1(){
        System.out.println("ignore1 run");
    }

    @Test(enabled = false)
    public void Ignore2(){
        System.out.println("ignore2 run");
    }

    @Test
    public void Ignore3(){
        System.out.println("ignore3 run");
    }
}
