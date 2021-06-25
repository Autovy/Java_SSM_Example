package com.aop.test;

import com.aop.pojo.Product;
import com.aop.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});

        ProductService s = (ProductService) context.getBean("s");
        s.service();

    }
}
