package com.myspring.pojo;

import java.util.List;

public class Product {

    private String type;
    private int id;
    private List[] list;

    public List[] getList(){
        return this.list;
    }

    public void setList(List[] list){
        this.list = list;
    }




}
