package com.projeto.mundopcd.facade;

import com.projeto.mundopcd.application.CandidatoApplication;
import com.projeto.mundopcd.models.Candidato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class CandidatoFacade {

    @Autowired
    CandidatoApplication candidatoApplication;

    public Candidato buscarPorId(int id){
        return candidatoApplication.buscarPorId(id);
    }

    public List listar(){
        return candidatoApplication.listar();
    }

    public void atualizar(Candidato candidato){
        candidatoApplication.atualizar(candidato);
    }

    public Candidato cadastrar(Candidato candidato){
        return candidatoApplication.cadastrar(candidato);
    }

    public void deletar(int id){
        candidatoApplication.deletar(id);
    }
}
