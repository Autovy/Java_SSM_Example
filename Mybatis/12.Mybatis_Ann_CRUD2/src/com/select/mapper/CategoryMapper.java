package com.select.mapper;

import com.select.CategoryDynaSqlProvider;
import com.select.pojo.Category;
import org.apache.ibatis.annotations.*;

import java.util.List;


// 映射动态的sql语句
public  interface CategoryMapper {

    // 方法内填写的是CategoryDynaSqlProvider类中定义的动态sql
    @InsertProvider(type = CategoryDynaSqlProvider.class, method = "add")
    public  int add(Category category);

    @DeleteProvider(type = CategoryDynaSqlProvider.class, method = "delete")
    public void delete(int id);

    @SelectProvider(type = CategoryDynaSqlProvider.class, method = "get")
    public Category get(int id);

    @UpdateProvider(type = CategoryDynaSqlProvider.class, method = "update")
    public int update(Category category);

    @SelectProvider(type =  CategoryDynaSqlProvider.class, method = "list")
    public List<Category> list();

}
