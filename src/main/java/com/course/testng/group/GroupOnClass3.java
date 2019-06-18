package com.course.testng.group;

import org.testng.annotations.Test;

/**
 * Created by jany.nie on 2019/6/18.
 */
@Test(groups = "teacher")
public class GroupOnClass3 {
    public void teacher1(){
        System.out.println("GroupOnClass3===========teacher1");
    }

    public void teacher2(){
        System.out.println("GroupOnClass3==========中的teacher2");
    }
}
