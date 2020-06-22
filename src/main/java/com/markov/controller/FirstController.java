
package com.markov.controller;

import com.markov.domain.Account;
import com.markov.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(path="param")
public class FirstController {
    @RequestMapping(path="hello")
    private String responseHello(){
        System.out.println();
        return "success";
    }
    @RequestMapping(path="testParam")
    private String responseParams(String username,String password){

        System.out.println(username);
        System.out.println(password);
        return "success";
    }
    @RequestMapping(path="saveAccount")
    private String saveAccount(Account account){
        System.out.println(account);
        return "success";
    }
    @RequestMapping(path="saveUser")
    private String saveUser(User user){
        System.out.println(user);
        return "success";
    }
    @RequestMapping(path="testServlet")
    private String testServerler(HttpServletRequest request, HttpServletResponse response){
        System.out.println(request);
        System.out.println(request.getSession());
        System.out.println(response);
        return "success";
    }
    @RequestMapping(path="testPathVariable/{sid}")
    private String testPathVariable(@PathVariable(name="sid") String id){
        System.out.println(id);
        return "success";
    }

}