package com.course.testng.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by jany.nie on 2019/6/19.
 */
public class ParameterTest {

    @Test
    @Parameters({"name","age"})
    public void paraTest1(String name,int age){
    System.out.println("name===="+name+","+"age========"+age);

    }
}
