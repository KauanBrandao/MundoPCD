package com.projeto.mundopcd.repositories.JPA;

import com.projeto.mundopcd.models.PapelModels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PapelJPA extends JpaRepository<PapelModels, Integer> {
}
