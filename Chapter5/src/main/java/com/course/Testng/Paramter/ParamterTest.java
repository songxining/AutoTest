package com.course.Testng.Paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamterTest {

    @Test
    @Parameters({"name","age"})
    public void ParamterCase(String name,int age){
        System.out.println("name = "+name+"; age="+age);
    }
}
