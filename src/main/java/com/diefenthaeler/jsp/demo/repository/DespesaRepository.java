package com.diefenthaeler.jsp.demo.repository;

import com.diefenthaeler.jsp.demo.model.Despesa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DespesaRepository extends JpaRepository<Despesa,Long> {
}
