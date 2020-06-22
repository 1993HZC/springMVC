package com.markov.controller;


import com.markov.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
        //第二种方式重定向 不能定向WEB-INF下面的jsp
//        response.sendRedirect(request.getContextPath()+"/index.jsp");
        //第三种方式 直接响应
        response.getWriter().println("hello");
    }
}
