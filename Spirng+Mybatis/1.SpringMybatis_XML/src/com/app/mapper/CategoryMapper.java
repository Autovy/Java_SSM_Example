package com.app.mapper;

import com.app.pojo.Category;

import java.util.List;

// sql方法映射（可以用注解，也可以与映射到Category.xml文件）
public interface CategoryMapper {

    public int add(Category category);

    public void delete(int id);

    public Category get(int id);

    public int update(Category category);

    public List<Category> list();

    public int count();

}
