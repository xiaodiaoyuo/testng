package com.course.testng.multiThread;

import org.testng.annotations.Test;

/**
 * Created by jany.nie on 2019/6/19.
 */
public class MultiThreadOnXml {

    @Test
    public void test1() {
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
    }

    @Test
    public void test2() {
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
    }

    @Test
    public void test3() {
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
    }

}
