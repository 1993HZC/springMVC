
package com.markov.controller;

import com.markov.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
    @RequestMapping(path = "saveAccount")
    private String saveAccount(Account account){
        System.out.println(account);
        return "success";
    }
}