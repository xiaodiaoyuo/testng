package com.course.testng;

/**
 * Created by jany.nie on 2019/6/20.
 */
public class OrderSaveException extends Throwable {

    public OrderSaveException() {
    }

    public OrderSaveException(String s) {
        System.out.println("str--------"+s);
    }


}
