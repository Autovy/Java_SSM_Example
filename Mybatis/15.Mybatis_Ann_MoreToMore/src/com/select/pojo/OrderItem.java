package com.select.pojo;

// 中间表实体类，联系多对多的双方，并且拥有修改双方的方法
// 将多对多的关系拆分为Order与OrderItem的一对多关系，OrderItem与Product的多对一关系
public class OrderItem {

    private int id;
    private int number;
    private Order order;
    private Product product;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public Order getOrder() {
        return order;
    }
    public void setOrder(Order order) {
        this.order = order;
    }
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }

}
