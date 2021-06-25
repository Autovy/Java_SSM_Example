package com.aop.service;

import org.springframework.stereotype.Component;

@Component("s")
public class ProductService {
    public void service(){
        System.out.println("main_service");
    }
}
