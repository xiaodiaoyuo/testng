package com.course.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * Created by jany.nie on 2019/6/19.
 */
public class DataProvideTest {
    @Test(dataProvider = "data")
    public void testDataProvide(String name,int age){
        System.out.println("name:"+name+","+"age:"+age);
    }


    @DataProvider(name="data")
    public Object[][] provideData(){
        Object[][] o = new Object[][]{
                {"zhangsan", 12},
            {"lisi", 20},
            {"wangwu", 31}
        };
        return o;
    }


    @Test(dataProvider = "methodProvide")
    public void provideTest1(String name,int age){
        System.out.println("test1111111111111111=======name:"+name+","+"age:"+age);
    }



    @Test(dataProvider =  "methodProvide")
    public void provideTest2(String name,int age){
        System.out.println("test222222222222=======name:"+name+","+"age:"+age);
    }

    @DataProvider(name= "methodProvide")
    public Object[][] provideData1(Method method){
        Object[][] result =null;
        if(method.getName().equals("provideTest1")){
            result = new Object[][]{
                    {"zhangsan", 22},
                    {"lisi", 30},

            };
        }else if(method.getName().equals("provideTest2")){
            result = new Object[][]{
                    {"wangwu", 31}
            };

        }
        return result;
    }
}

