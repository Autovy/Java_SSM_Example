package com.select.mapper;

import com.select.pojo.Category;
import javafx.scene.chart.CategoryAxis;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CategoryMapper {

    // Category为一
    @Select("select * from category_ where id=#{id}")
    public Category get(int id);


}

