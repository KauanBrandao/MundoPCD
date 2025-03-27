package com.projeto.mundopcd.repositories.JPA;

import com.projeto.mundopcd.models.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaJPA extends JpaRepository<Empresa, Integer> {
}
