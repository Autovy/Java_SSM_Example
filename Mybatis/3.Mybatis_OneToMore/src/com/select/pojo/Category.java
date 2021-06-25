package com.select.pojo;

import java.util.List;

// 实体类映射表category_
// Category为一，Product为多，Category实体类包含了Product
public class Category {

    private int id;
    private String name;
    List<Product> products;

    public int getId(){
        return id;
    }
    public void setId(){
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }


    public List<Product> getProducts(){
        return products;
    }

    public void  setProducts(List<Product> products){
        this.products = products;
    }

    public String toString(){
        return "Category [id=" + id + ", name=" + name + "]";
    }


}
