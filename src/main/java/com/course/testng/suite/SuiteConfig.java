package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * Created by jany.nie on 2019/6/18.
 */
public class SuiteConfig {
    @BeforeSuite
    public void beforeSuit(){
        System.out.println("beforeSuit====run=======");
    }


    @AfterSuite
    public void afterSuit(){
        System.out.println("afterSuit=====run======");
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
