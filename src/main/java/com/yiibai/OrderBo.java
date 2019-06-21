package com.yiibai;

/**
 * Created by jany.nie on 2019/6/20.
 */
public class OrderBo{
    public void save(Order order) throws OrderSaveException {

        if (order == null) {
            throw new OrderSaveException("Order is empty!");
        }

        // persist it

    }

    public void update(Order order) throws OrderUpdateException, OrderNotFoundException {

        if (order == null) {
            throw new OrderUpdateException("Order is empty!");
        }

        // if order is not available in database
        throw new OrderNotFoundException("Order is not exists");

    }
}
