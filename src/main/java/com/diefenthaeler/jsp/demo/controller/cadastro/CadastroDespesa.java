package com.diefenthaeler.jsp.demo.controller.cadastro;

import com.diefenthaeler.jsp.demo.model.Despesa;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/cadastrodespesa")
public class CadastroDespesa {

    @GetMapping
    public String getCadastroDespesa(){
        return "/cadastro/cadastro-de-despesa";
    }


    @PostMapping
    public String salvar(Despesa despesa){
        // falta gravar no banco
        log.info("Objeto de despesa {}", despesa);
        return "/cadastro/cadastro-de-despesa";
    }

}
