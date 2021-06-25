package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.annotation.ModelAndViewResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 使用注解完成映射，不需要IndexController实现Controller接口
// 表明该类为控制器
@Controller
public class HelloController{
    // 将路径/hello映射到该方法
    @RequestMapping("/hello")
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("data", "Hello!!!");
        return mav;
    }
}
