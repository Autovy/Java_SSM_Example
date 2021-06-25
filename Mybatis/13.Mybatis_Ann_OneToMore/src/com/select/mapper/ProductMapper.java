package com.select.mapper;

import com.select.pojo.Product;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProductMapper {

    // ProductMapper为多，这里联系one并调用其get方法
    @Select("select * from product_")
    @Results({
            @Result(property = "category", column = "cid", one = @One(select="com.select.mapper.CategoryMapper.get"))
    })
    public List<Product> list();

}
