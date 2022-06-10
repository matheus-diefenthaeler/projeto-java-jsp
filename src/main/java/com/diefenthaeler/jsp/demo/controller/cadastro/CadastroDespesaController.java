package com.diefenthaeler.jsp.demo.controller.cadastro;

import com.diefenthaeler.jsp.demo.model.Despesa;
import com.diefenthaeler.jsp.demo.service.DespesaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@Slf4j
@RequestMapping("/cadastrodespesa")
public class CadastroDespesaController {

    @Autowired
    private DespesaService despesaService;

    @GetMapping
    public String getCadastroDespesa(){
        return "/cadastro/cadastro-de-despesa";
    }


    @PostMapping
    public ModelAndView salvar(@Valid Despesa despesa){
        // falta gravar no banco
        log.info("Objeto de despesa antes de persistir{}", despesa);
        Despesa despesaEntity = despesaService.salvar(despesa);
        log.info("Objeto de despesa apos de persistir{}", despesaEntity);
        ModelAndView modelAndView = new ModelAndView("/cadastro/cadastro-de-despesa");
        modelAndView.addObject("mensagem", "Despesa salva com sucesso");
        return modelAndView;
    }
}
