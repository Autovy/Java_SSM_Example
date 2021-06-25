package controller;

import com.sun.deploy.net.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class IndexController{

    // 控制器通过ModelAndView将模型（数据）和视图（前端展示）联系起来
    @RequestMapping("index")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse reponse) throws Exception{
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("message", "Hello Srping MVC");
        return mav;

    }


}

