package com.java.test;

import com.app.mapper.CategoryMapper;
import com.app.pojo.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

// Spring+Mybatis整合的关键在：
    // 1、数据库配置整合进Spring配置
    // 2、Mapper对象创建交给Spring创建（拿到的对象的属性，已经被注入好相关值了，里面数据类型由数据库的数据而定）

// 导入测试类
@RunWith(SpringJUnit4ClassRunner.class)
// 导入Spring+Mybatis配置文件
@ContextConfiguration("classpath:applicationContext.xml")
public class CategoryTest {

    // 拿到注入的CategoryMapper对象（该对象已注入数据库的sqlSession调用相应的sql方法）
    @Autowired
    private CategoryMapper categoryMapper;

    // 测试添加方法
    @Test
    public void testAdd(){

        Category category = new Category();
        category.setName("test");
        categoryMapper.add(category);

    }

    // 测试列出所有数据
    @Test
    public void testList(){

        System.out.println(categoryMapper);
        List<Category> cs  = categoryMapper.list();
        for(Category c : cs){
            System.out.println(c.getName());
        }

    }


}