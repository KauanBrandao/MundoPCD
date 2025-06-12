package com.projeto.mundopcd.repositories.JPA;

import com.projeto.mundopcd.models.EmpresaModels;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaJPA extends JpaRepository<EmpresaModels, Integer> {
    public EmpresaModels findByEmail(String email);
    public boolean existsByEmail(String email);
}
