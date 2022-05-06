package com.course.Testng.Paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {

    @Test(dataProvider = "data")
    public void TestDataProvider(String name,int age){
        System.out.println("name ="+name+"; age ="+age);
    }

    @DataProvider(name="data")
    public Object[][] providerData(){
        Object[][] o = new Object[][]{
                {"zhangsan",10},
                {"lisi",20},
                {"wangwu",30}
        };
        return o;
    }


    @Test(dataProvider = "methodData")
    public void test1(String name,int  age){
        System.out.println("name ="+name+"; age="+age);
    }

    @Test(dataProvider = "methodData")
    public void test2(String name,int age){
        System.out.println("name ="+name+"; age="+age);
    }

    @DataProvider(name="methodData")
    public Object[][] testDataProvider(Method method){
        Object[][] result=null;

        if (method.getName().equals("test1")){
            result= new Object[][]{
                    {"zhangsan",20},
                    {"lisi",25}
            };
        }else if (method.getName().equals("test2")){
            result = new Object[][]{
                    {"wangwu",50},
                    {"zhaoliu",60}
            };
        }
        return result;
    }

}
