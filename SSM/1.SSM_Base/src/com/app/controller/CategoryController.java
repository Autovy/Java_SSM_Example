package com.app.controller;

import com.app.pojo.Category;
import com.app.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

// 标志控制类
@Controller
// 映射访问路径
@RequestMapping("")
public class CategoryController {

    // 自动装配categoryService
    @Autowired
    CategoryService categoryService;

    //映射访问路径
    @RequestMapping("listCategory")
    public ModelAndView listCategory(){
        ModelAndView mav = new ModelAndView();
        // 调用categoryService的服务
        List<Category> cs = categoryService.list();

        // 放入转发参数
        mav.addObject("cs", cs);
        mav.setViewName("listCategory");
        return mav;


    }


}
