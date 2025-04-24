package com.projeto.mundopcd.facade;

import com.projeto.mundopcd.application.CandidaturaApplication;
import com.projeto.mundopcd.models.CandidaturaModels;
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

    public CandidaturaModels buscarPorId(int id) {
        return candidaturaApplication.buscarPorId(id);
    }

    public CandidaturaModels cadastrar(CandidaturaModels candidaturaModels){
        return candidaturaApplication.cadastrar(candidaturaModels);
    }

    public void atualizar(CandidaturaModels candidaturaModels){
        candidaturaApplication.atualizar(candidaturaModels);
    }

    public void deletar(int id){
        candidaturaApplication.deletar(id);
    }
}
