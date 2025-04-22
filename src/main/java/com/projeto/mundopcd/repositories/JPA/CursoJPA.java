package com.projeto.mundopcd.repositories.JPA;

import com.projeto.mundopcd.models.CursoModels;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoJPA extends JpaRepository<CursoModels, Integer> {
}
