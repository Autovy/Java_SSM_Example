package controller;

import com.sun.deploy.net.HttpRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IndexController implements Controller {

    // 控制器通过ModelAndView将模型（数据）和视图（前端展示）联系起来
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse reponse) throws Exception{
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("message", "Hello Srping MVC");
        return mav;

    }


}

