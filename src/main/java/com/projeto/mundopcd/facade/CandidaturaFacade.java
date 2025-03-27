package com.projeto.mundopcd.facade;

import com.projeto.mundopcd.application.CandidaturaApplication;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CandidaturaFacade {

    private CandidaturaApplication candidaturaApplication;

    public CandidaturaFacade(CandidaturaApplication candidaturaApplication) {
        this.candidaturaApplication = candidaturaApplication;
    }

    public List listar(){
        return this.candidaturaApplication.listar();
    }
}
