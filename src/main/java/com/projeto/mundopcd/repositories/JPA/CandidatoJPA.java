package com.projeto.mundopcd.repositories.JPA;

import com.projeto.mundopcd.models.CandidatoModels;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidatoJPA extends JpaRepository<CandidatoModels, Integer> {
    public CandidatoModels findByEmail(String email);
    public boolean existsByEmail(String email);
}
