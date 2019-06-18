package com.course.testng.group;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

/**
 * Created by jany.nie on 2019/6/18.
 */
public class GroupsOnMethod {

    @Test(groups = "server")
    public void test1(){
        System.out.println("===server=======1=========");
    }
    @Test(groups = "server")
    public void test2(){
        System.out.println("===server=====2========");
    }

    @Test(groups = "client")
    public void test3(){
        System.out.println("===client=====3=======");
    }

    @Test(groups = "client")
    public void test4(){
        System.out.println("===client=====4=======");
    }

    @BeforeGroups("server")
    public void beforeGroupOnServer(){
        System.out.println("before group on server======");
    }
    @AfterGroups("server")
    public void afterGroupOnServer(){
        System.out.println("before group on server======");
    }
}
