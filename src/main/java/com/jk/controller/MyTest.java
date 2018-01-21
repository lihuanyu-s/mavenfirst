package com.jk.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class MyTest {

    @RequestMapping("seleUserlist")
    public  void  seleUserlist(){
        System.out.println(123);
        System.out.println(123);
        System.out.println(123);
    }
}

