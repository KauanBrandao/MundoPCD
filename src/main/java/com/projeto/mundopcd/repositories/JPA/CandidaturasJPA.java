package com.projeto.mundopcd.repositories.JPA;

import com.projeto.mundopcd.models.Candidaturas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidaturasJPA extends JpaRepository<Candidaturas, Integer> {
}
