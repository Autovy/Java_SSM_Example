package com.select.mapper;

import com.select.pojo.Order;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

// Order与OrderItem的一对多关系,提供list方法（返回含Product的Order对象）
public interface OrderMapper {

    @Select("select * from order_")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "orderItems", javaType = List.class, column = "id",
                    many = @Many(select = "com.select.mapper.OrderItemMapper.listByOrder"))
    })
    public List<Order> list();

}
