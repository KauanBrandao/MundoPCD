package com.projeto.mundopcd.repositories.JPA;

import com.projeto.mundopcd.models.EnderecoCandidato;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EnderecoCandidatoJPA extends JpaRepository <EnderecoCandidato, Integer> {

    Optional<EnderecoCandidato> findByLogradouroAndNumeroAndCidadeAndEstadoAndCep(
            String logradouro, String numero, String cidade, String estado, String cep
    );
}
