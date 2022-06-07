package com.diefenthaeler.jsp.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class HelloWorld2 {

    @GetMapping("/hello2")
    public String getHello2(){
        log.info("Acessando nova pagina");
        return "nome-da-pagina";
    }

}
