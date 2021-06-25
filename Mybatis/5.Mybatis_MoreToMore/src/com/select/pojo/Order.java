package com.select.pojo;

import java.util.List;

// 多对多关系中，以Order为条件分组
// 其可以修改中间关系的对象
public class Order {

    private int id;
    private String code;

    List<OrderItem> orderItems;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public List<OrderItem> getOrderItems() {
        return orderItems;
    }
    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

}
