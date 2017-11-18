package me.travisgray.controllers;

import me.travisgray.repositories.BankMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ${TravisGray} on 11/17/2017.
 */
@Controller
public class BankMemberController {
    @Autowired
    BankMemberRepository bankMemberRepository;

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/secure")
    public String secure(){
        return "secure";
    }
}
