package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pojo.Product;

@Controller
public class ProductController {

    @RequestMapping("/addProduct")
    // addProduct.jsp提交的数据会注入到product中
    public ModelAndView add(Product product) throws Exception{
        // 映射到showProduct页面
        ModelAndView mav = new ModelAndView("showProduct");
        return mav;
    }


}
