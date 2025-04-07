package com.projeto.mundopcd.facade;

import com.projeto.mundopcd.application.CandidaturaApplication;
import com.projeto.mundopcd.models.Candidatura;
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

    public Candidatura buscarPorId(int id) {
        return candidaturaApplication.buscarPorId(id);
    }

    public Candidatura cadastrar(Candidatura curso){
        return candidaturaApplication.cadastrar(curso);
    }

    public void atualizar(Candidatura curso, int id){
        candidaturaApplication.atualizar(curso, id);
    }

    public void deletar(int id){
        candidaturaApplication.deletar(id);
    }
}
