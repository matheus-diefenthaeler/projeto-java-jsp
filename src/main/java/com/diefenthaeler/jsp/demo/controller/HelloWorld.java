package com.diefenthaeler.jsp.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class HelloWorld {

    @RequestMapping("/hello")
    public String getHello() {
        log.info("acessou metodo get url hello: ");
        return "hello";
    }
}
