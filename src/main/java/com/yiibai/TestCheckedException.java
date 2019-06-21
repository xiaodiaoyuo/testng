package com.yiibai;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by jany.nie on 2019/6/20.
 */
public class TestCheckedException {
    OrderBo orderBo;
    Order data;

    @BeforeTest
    void setup() {
        orderBo = new OrderBo();

        data = new Order();
        data.setId(1000);
        data.setCreatedBy("maxsu");
    }

    @Test(expectedExceptions = OrderSaveException.class)
    public void throwIfOrderIsNull() throws OrderSaveException {
        orderBo.save(null);
    }

    /*
     * Example : Multiple expected exceptions Test is success if either of the
     * exception is thrown
     */
    @Test(expectedExceptions = { OrderUpdateException.class, OrderNotFoundException.class })
    public void throwIfOrderIsNotExists() throws OrderUpdateException, OrderNotFoundException {
        orderBo.update(data);
    }
}
