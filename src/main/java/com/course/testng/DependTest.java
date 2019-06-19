package com.course.testng;

import org.testng.annotations.Test;

/**
 * Created by jany.nie on 2019/6/19.
 */
public class DependTest {
    @Test
    public void test1(){
        System.out.println("test----------1------");
        throw new RuntimeException();
    }


    @Test(dependsOnMethods = {"test1"},alwaysRun= true)
    public void test2(){
        System.out.println("test---------2------");
    }
}
