package com.projeto.mundopcd.application;

import com.projeto.mundopcd.repositories.CandidaturasRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CandidaturasApplication {

    private CandidaturasRepository candidaturasRepository;

    public CandidaturasApplication(CandidaturasRepository candidaturasRepository) {
        this.candidaturasRepository = candidaturasRepository;
    }

    public List listar(){
        return candidaturasRepository.listar();
    }
}
