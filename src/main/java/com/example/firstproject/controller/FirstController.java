package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    // 1.controller가 요청을 받음 /hi
    @GetMapping("/hi")
    public String LogIn(Model model){
        //3.model정의
        model.addAttribute("username","david");
        return "greetings"; //2.greetings.mustache로 이동시켜줌
    }

    @GetMapping("/bye")
    public String LogOut(Model model){
        model.addAttribute("nickname","david");
        return "goodbye";
    }
}
