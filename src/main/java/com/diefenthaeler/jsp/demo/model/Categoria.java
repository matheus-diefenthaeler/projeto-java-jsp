package com.diefenthaeler.jsp.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Categoria {

    ALIMENTAÇÃO("Alimentacao"),
    TRANSPORTE("Transporte"),
    VESTUARIO("Vestuario"),
    CUIDADOS_PESSOAIS("Cuidados"),
    MORADIA("Moradia"),
    LAZER("Lazer"),
    EDUCAÇÃO("Educacao"),
    COMPRAS("Compras"),
    DIVERSÃO("Diversao");

    private final String nome;
}
