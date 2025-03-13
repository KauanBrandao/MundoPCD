package com.projeto.mundopcd.facade;

import com.projeto.mundopcd.application.CandidatosApplication;
import com.projeto.mundopcd.models.Candidatos;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class CandidatosFacade {

    CandidatosApplication candidatosApplication;

    public CandidatosFacade(CandidatosApplication candidatosApplication) {
        this.candidatosApplication = candidatosApplication;
    }

    public Candidatos buscarPorId(int id){
        return candidatosApplication.buscarPorId(id);
    }

    public List listar(){
        return candidatosApplication.listar();
    }

    public void atualizar(Candidatos candidato, int id){
        candidatosApplication.atualizar(candidato, id);
    }

    public Candidatos cadastrar(Candidatos candidatos){
        return candidatosApplication.cadastrar(candidatos);
    }

    public void deletar(int id){
        candidatosApplication.deletar(id);
    }
}
