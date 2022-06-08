package com.diefenthaeler.jsp.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Despesa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String descricao;

    @Enumerated(EnumType.STRING)
    private Categoria categoria;

    @Temporal(TemporalType.DATE)
    private Date data;
    private BigDecimal valor;
    private String observacoes;



}
