package com.course.testng;

import org.testng.annotations.Test;

/**
 * Created by jany.nie on 2019/6/19.
 */
public class TimeOutTest {

    @Test(timeOut = 3000)
    public void testsuc() throws InterruptedException {
    Thread.sleep(2000);
    }

    @Test(timeOut = 3000)
    public void testFailed() throws InterruptedException {
        Thread.sleep(4000);
    }


}
