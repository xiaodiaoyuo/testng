package com.course.testng;

import org.testng.annotations.Test;

/**
 * Created by jany.nie on 2019/6/19.
 */
public class ExpectedException {
    //期望结果为某个异常时
    //失败异常
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeFailed(){
        System.out.println("这是一个失败的测试用例===========");
    }


    //成功异常
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeSuccess(){

        System.out.println("这是一个成功的测试用例===========");
        throw new RuntimeException();
    }







}
