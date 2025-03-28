package com.projeto.mundopcd.application;

import com.projeto.mundopcd.repositories.CandidaturaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CandidaturaApplication {

    private CandidaturaRepository candidaturaRepository;

    public CandidaturaApplication(CandidaturaRepository candidaturaRepository) {
        this.candidaturaRepository = candidaturaRepository;
    }

    public List listar(){
        return candidaturaRepository.listar();
    }
}
