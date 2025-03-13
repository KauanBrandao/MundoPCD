package com.projeto.mundopcd.facade;

import com.projeto.mundopcd.application.CandidaturasApplication;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CandidaturasFacade {

    private CandidaturasApplication candidaturasApplication;

    public CandidaturasFacade(CandidaturasApplication candidaturasApplication) {
        this.candidaturasApplication = candidaturasApplication;
    }

    public List listar(){
        return this.candidaturasApplication.listar();
    }
}
