package com.course.testng.group;

import org.testng.annotations.Test;

/**
 * Created by jany.nie on 2019/6/18.
 */
@Test(groups = "stu")
public class GroupOnClass2 {
    public void stu1(){
        System.out.println("GroupOnClass2===========中的stu111111111111");
    }

    public void stu2(){
        System.out.println("GroupOnClass2===========中的stu22222222222");
    }
}
