package com.course.testng.multiThread;

import org.testng.annotations.Test;

/**
 * Created by jany.nie on 2019/6/19.
 */
public class MultiThreadOnAnnotion {

@Test(invocationCount = 10,threadPoolSize = 3)
    public void test(){
        System.out.println(1);
        System.out.printf("ThreadId： %s%n",Thread.currentThread().getId());
    }
}
