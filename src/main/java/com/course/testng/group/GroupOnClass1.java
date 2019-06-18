package com.course.testng.group;

import org.testng.annotations.Test;

/**
 * Created by jany.nie on 2019/6/18.
 */
@Test(groups = "stu")
public class GroupOnClass1 {
    public void stu1(){
        System.out.println("GroupOnClass1============中的stu1");
    }

    public void stu2(){
        System.out.println("GroupOnClass1============中的stu2");
    }
}
