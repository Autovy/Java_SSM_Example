package com.select.mapper;

import com.select.pojo.OrderItem;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

// 中间表OrderItem，与Product建立多对一关系
// 提供listByOrder方法给OrderMapper
public interface OrderItemMapper {

    @Select(" select * from order_item_ where oid = #{oid}")
    @Results({
            @Result(property="product",column="pid",one=@One(select="com.select.mapper.ProductMapper.get"))
    })

    public List<OrderItem> listByOrder(int oid);
}

