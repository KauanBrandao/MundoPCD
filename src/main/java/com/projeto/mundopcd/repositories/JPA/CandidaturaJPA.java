package com.projeto.mundopcd.repositories.JPA;

import com.projeto.mundopcd.models.CandidaturaModels;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidaturaJPA extends JpaRepository<CandidaturaModels, Integer> {
}
