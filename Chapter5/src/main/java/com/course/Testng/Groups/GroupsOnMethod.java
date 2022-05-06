package com.course.Testng.Groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {

    @Test(groups = "server")
    public void  GroupsOnServer1(){
        System.out.println("this's  a serverGroups1");
    }

    @Test(groups = "server")
    public void  GroupsOnServer2(){
        System.out.println("this's  a serverGroups2");
    }

    @Test(groups = "client")
    public void  GroupsOnClient1(){
        System.out.println("this's  a client1Groups");
    }

    @Test(groups = "client")
    public void  GroupsOnClient2(){
        System.out.println("this's  a client2Groups");
    }

    @BeforeGroups("server")
    public void BeforeGroups(){
        System.out.println("this's a OnServerMethod");
    }

    @AfterGroups("server")
    public void AfterGroups(){
        System.out.println("this's a AfterServerMethod");
    }

    @BeforeGroups("client")
    public void BeforeOnGroups(){
        System.out.println("this's a OnClientMethod");
    }

    @AfterGroups("client")
    public void AfterOnGroups(){
        System.out.println("this's a AfterClientMethod");
    }

}
