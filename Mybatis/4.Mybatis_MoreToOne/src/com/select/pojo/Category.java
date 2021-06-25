package com.select.pojo;

import java.util.List;

// 实体类映射表category_
// Category为一，Product为多，Category实体类包含了Product
public class Category {

    private int id;
    private String name;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String toString(){
        return "Category [id=" + id + ", name=" + name + "]";
    }


}
