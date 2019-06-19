package com.tester.extend.demo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * Created by jany.nie on 2019/6/19.
 */
public class TestMethodsDemo {

@Test
    public void test1(){
    Assert.assertEquals(1,2);
}

    @Test
    public void test2(){
        Assert.assertEquals(1,1);
    }


    @Test
    public void test3(){
        Assert.assertEquals("aaa","aaa");
    }

@Test
    public void logDemo(){
        Reporter.log("这是自己写的日志==========");
        throw new RuntimeException("这是我们运行异常的日志");
}












}
