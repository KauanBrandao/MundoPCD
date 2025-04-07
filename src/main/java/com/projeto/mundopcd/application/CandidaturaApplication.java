package com.projeto.mundopcd.application;

import com.projeto.mundopcd.models.Candidatura;
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

    public Candidatura buscarPorId(int id) {
        return candidaturaRepository.buscarPorId(id);
    }

    public Candidatura cadastrar(Candidatura curso){
        return candidaturaRepository.cadastrar(curso);
    }

    public void atualizar(Candidatura curso, int id){
        candidaturaRepository.atualizar(curso, id);
    }

    public void deletar(int id){
        candidaturaRepository.deletar(id);
    }
}
