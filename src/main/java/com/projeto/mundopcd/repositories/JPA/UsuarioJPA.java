package com.projeto.mundopcd.repositories.JPA;

import com.projeto.mundopcd.models.UsuarioModels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioJPA extends JpaRepository<UsuarioModels, Integer> {
}
