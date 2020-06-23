package com.markov.controller;


import com.markov.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("response")
public class ResponseController {
    @Autowired
    private User user;

    @RequestMapping("testServlet")
    private String testString(Model model){
        user.setUsername("黄子城");
        user.setAge("666");
        model.addAttribute("user",user);
        return "success";

    }
    @RequestMapping("testVoid")
    private void testVoid(HttpServletRequest request, HttpServletResponse response) throws Exception{
        //第一种方式转发请求
//        request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request,response);
        //第二种方式重定向 不能定向WEB-INF下面的jsp,只能定向到根目录的位置
//        response.sendRedirect(request.getContextPath()+"/index.jsp");
        //第三种方式 直接响应
        response.getWriter().println("hello");
    }
    @RequestMapping("testModelAndView")
    public ModelAndView testModelAndView(){
        ModelAndView mv =new ModelAndView();
        user.setUsername("黄子城");
        user.setAge("666");
        mv.addObject("user",user);
        mv.setViewName("success");
        return mv;
    }
    @RequestMapping("testForwardOrRedict")
    public String testForwardOrRedict(){
        //转发
//        return "forward:/WEB-INF/pages/success.jsp";
//        重定向
        return "redirect:/index.jsp";
    }

    @RequestMapping("testResponseJson")
    public @ResponseBody  User testResponseJson(@RequestBody User user){

        user.setUsername("123");
        user.setAge("123");
        return user;
    }
}
