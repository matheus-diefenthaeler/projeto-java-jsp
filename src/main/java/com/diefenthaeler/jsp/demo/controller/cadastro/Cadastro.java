package com.diefenthaeler.jsp.demo.controller.cadastro;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Slf4j
public class Cadastro {

    @RequestMapping(value = "/cadastro", method = RequestMethod.GET)
    public String getCadastro(){
        return "/cadastro/cadastro-usuario";
    }

}
