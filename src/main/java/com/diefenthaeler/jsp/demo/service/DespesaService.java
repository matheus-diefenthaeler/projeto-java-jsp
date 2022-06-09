package com.diefenthaeler.jsp.demo.service;

import com.diefenthaeler.jsp.demo.model.Despesa;
import com.diefenthaeler.jsp.demo.repository.DespesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DespesaService {

    @Autowired
    private DespesaRepository despesaRepository;

    public Despesa salvar (Despesa despesa){
       return despesaRepository.save(despesa);

    }

}
