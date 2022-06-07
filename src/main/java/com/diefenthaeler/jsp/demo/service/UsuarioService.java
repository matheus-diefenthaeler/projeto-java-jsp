package com.diefenthaeler.jsp.demo.service;

import com.diefenthaeler.jsp.demo.model.Usuario;
import com.diefenthaeler.jsp.demo.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public Usuario salvar (Usuario usuarios){
        return usuarioRepository.save(usuarios);
    }
}