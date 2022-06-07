package com.diefenthaeler.jsp.demo.controller.carrinho;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class Carrinho {

    @GetMapping("/carrinho")
    public String getCarrinho(){
        return "/carrinho-de-compra/carrinho";
    }
}
