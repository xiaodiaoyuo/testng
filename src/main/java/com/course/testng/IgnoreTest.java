package com.course.testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/**
 * Created by jany.nie on 2019/6/18.
 */
public class IgnoreTest {


    @BeforeSuite
    public void beforeSuit(){
        System.out.println("IgnoreTest   beforeSuit===========");
    }


    @AfterSuite
    public void afterSuit(){
        System.out.println("IgnoreTest  afterSuit===========");
    }


    @Test
    public void ignore1(){
        System.out.println("==========1=========");
    }
    @Test(enabled = false)
    public void ignore2(){
        System.out.println("========2========");
    }

    @Test(enabled = false)
    public void ignore3(){
        System.out.println("========3=======");
    }

}
