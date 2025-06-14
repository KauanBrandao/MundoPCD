package com.projeto.mundopcd.repositories.JPA;

import com.projeto.mundopcd.models.EnderecoCandidatoModels;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EnderecoCandidatoJPA extends JpaRepository <EnderecoCandidatoModels, Integer> {

    Optional<EnderecoCandidatoModels> findByLogradouroAndNumeroAndCidadeAndEstadoAndCep(
            String logradouro, String numero, String cidade, String estado, String cep
    );
}
