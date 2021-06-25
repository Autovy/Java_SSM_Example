package com.select.mapper;

import com.select.pojo.Product;
import org.apache.ibatis.annotations.Select;

//  OrderItem与Product的多对一关系
// 为OrderItem提供get方法
public interface ProductMapper {

    @Select("select * from product_ where id = #{id}")
    public Product get(int id);

}
