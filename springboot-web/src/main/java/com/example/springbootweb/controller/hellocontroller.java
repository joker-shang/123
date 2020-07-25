package com.example.springbootweb.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class hellocontroller {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        log.info("hellowold");
        return "hellowold";
    }

}

