package com.select.mapper;

import com.select.pojo.Category;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;


// 将映射的xml文件用注解的方法放在Mapper类中(sql语句不变)
public  interface CategoryMapper {

    @Insert("insert into category_ (name) values (#{name})")
    public  int add(Category category);

    @Delete("delete from category_ where  id = #{id}")
    public void delete(int id);

    @Select(" select * from category_ where id = #{id}")
    public Category get(int id);

    @Update("update category_ set  name=#{name} where id = #{id}")
    public int update(Category category);

    @Select("select * from category_")
    public List<Category> list();

}
