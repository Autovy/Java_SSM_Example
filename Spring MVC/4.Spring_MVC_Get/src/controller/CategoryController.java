package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pojo.Category;

@Controller
public class CategoryController {

    @RequestMapping("/addCategory")
    public ModelAndView add(Category category) throws Exception {
        ModelAndView mav = new ModelAndView("showCategory");
        return mav;
    }



}
