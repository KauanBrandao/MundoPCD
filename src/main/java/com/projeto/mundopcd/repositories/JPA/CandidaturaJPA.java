package com.projeto.mundopcd.repositories.JPA;

import com.projeto.mundopcd.models.Candidatura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidaturaJPA extends JpaRepository<Candidatura, Integer> {
}
