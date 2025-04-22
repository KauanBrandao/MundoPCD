package com.projeto.mundopcd.application;

import com.projeto.mundopcd.models.CandidaturaModels;
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

    public CandidaturaModels buscarPorId(int id) {
        return candidaturaRepository.buscarPorId(id);
    }

    public CandidaturaModels cadastrar(CandidaturaModels curso){
        return candidaturaRepository.cadastrar(curso);
    }

    public void atualizar(CandidaturaModels curso){
        candidaturaRepository.atualizar(curso);
    }

    public void deletar(int id){
        candidaturaRepository.deletar(id);
    }
}
