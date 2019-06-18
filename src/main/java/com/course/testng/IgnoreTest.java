package com.course.testng;

import org.testng.annotations.Test;

/**
 * Created by jany.nie on 2019/6/18.
 */
public class IgnoreTest {
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
