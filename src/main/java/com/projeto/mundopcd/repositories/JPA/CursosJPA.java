package com.projeto.mundopcd.repositories.JPA;

import com.projeto.mundopcd.models.Cursos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursosJPA extends JpaRepository<Cursos, Integer> {
}
