package com.how2java.test;
 
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
 
import com.how2java.pojo.Category;

// 表明测试类为spring
@RunWith(SpringJUnit4ClassRunner.class)
// 定位Spring配置文件
@ContextConfiguration("classpath:applicationContext.xml")
public class TestSpring {
    // 自动装配Category对象
    @Autowired
    Category c;
    // 测试程序
    @Test
    public void test(){
        System.out.println(c.getName());
    }
}