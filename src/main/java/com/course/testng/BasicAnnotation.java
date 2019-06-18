package com.course.testng;

import org.testng.annotations.*;

/**
 * Created by jany.nie on 2019/6/18.
 */
public class BasicAnnotation {

    @Test
    public void testCase1(){
        System.out.println("测试用例1===========");
    }


    @Test
    public void testCase2(){
        System.out.println("测试用例2==========");
    }


    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod===========");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod===========");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass===========");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("afterClass===========");
    }

    @BeforeSuite
    public void beforeSuit(){
        System.out.println("beforeSuit===========");
    }


    @AfterSuite
    public void afterSuit(){
        System.out.println("afterSuit===========");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("afterTest===========");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("BeforeTest===========");
    }
}
