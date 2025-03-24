package com.projeto.mundopcd.repositories.JPA;

import com.projeto.mundopcd.models.Candidatos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidatosJPA extends JpaRepository<Candidatos, Integer> {
}
