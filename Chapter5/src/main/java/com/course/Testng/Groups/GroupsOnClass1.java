package com.course.Testng.Groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass1 {

    public void stu1(){
        System.out.println("stu1run111111");
    }

    public void stu2(){
        System.out.println("stu1run22222222");
    }
}
