package com.myspring.test;

import com.myspring.pojo.Category;
import com.myspring.pojo.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
        Category c = (Category) context.getBean("c");
        Product list = (Product) context.getBean("l");

        System.out.println(c.getName());
        System.out.println(list.getList());
    }

}
