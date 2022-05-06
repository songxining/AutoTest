package com.course.Testng.Groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupsOnClass3 {

    public void teacher1(){
        System.out.println("teacher1run111111");
    }

    public void teacher2(){
        System.out.println("teacher2run2222222");
    }
}
