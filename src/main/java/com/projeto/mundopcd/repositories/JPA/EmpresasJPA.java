package com.projeto.mundopcd.repositories.JPA;

import com.projeto.mundopcd.models.Empresas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresasJPA extends JpaRepository<Empresas, Integer> {
}
