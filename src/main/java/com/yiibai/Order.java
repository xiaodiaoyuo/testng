package com.yiibai;

/**
 * Created by jany.nie on 2019/6/20.
 */
public class Order {
    private int Id;
    private String CreatedBy;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getCreatedBy() {
        return CreatedBy;
    }

    public void setCreatedBy(String createdBy) {
        CreatedBy = createdBy;
    }
    public Order() {


    }

    public Order(int id, String createdBy) {

        Id = id;
        CreatedBy = createdBy;
    }
}
