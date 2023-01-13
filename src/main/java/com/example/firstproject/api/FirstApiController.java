package com.example.firstproject.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
// RestController연습

@RestController //RestAPI 용 컨트롤러 일반 컨트롤러와 다르게 JSON 반환 (일반 컨트롤러는 html코드 반환)
public class FirstApiController {

    @GetMapping("/api/hello")
    public String hello(){
        return "hello world";
    }
}
