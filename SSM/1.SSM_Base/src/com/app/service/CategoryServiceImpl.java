package com.app.service;

import com.app.mapper.CategoryMapper;
import com.app.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// 实现Category服务接口（调用mapper的方法访问数据库数据）
// 标志Service（类似于@Component，@Controller）
    // 1. 将类自动注册到Spring容器，而不需要定义bean
    // 2. 控制类可以直接通过接口调用到其实现类中的方法
@Service
public class CategoryServiceImpl implements CategoryService {

    // 获得注入数据库数据的对象（自动装配）
    @Autowired
    CategoryMapper categoryMapper;

    // 调用mapper里面的方法（sql方法），操作数据库
    public List<Category> list(){

        return categoryMapper.list();
    }

}
