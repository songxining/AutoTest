package com.course.Testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * 测试套件配置类
 */
public class SuiteConfig {

    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("this's a beforesuite");
    }

    @AfterSuite
    public void AfterSuite(){
        System.out.println("this's a aftersuite");
    }

}
