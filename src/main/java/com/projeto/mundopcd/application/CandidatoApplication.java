package com.projeto.mundopcd.application;

import com.projeto.mundopcd.models.Candidato;
import com.projeto.mundopcd.repositories.CandidatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class CandidatoApplication {

    @Autowired
    private CandidatoRepository candidatoRepository;

    public CandidatoApplication(CandidatoRepository candidatoRepository){
        this.candidatoRepository = candidatoRepository;
    }

    public Candidato buscarPorId(int id){
        return candidatoRepository.buscarPorId(id);
    }

    public List listar(){
        return candidatoRepository.listar();
    }

    public void atualizar(Candidato candidato, int id){
        candidatoRepository.atualizar(candidato, id);
    }

    public Candidato cadastrar(Candidato candidato) {
        return candidatoRepository.cadastrar(candidato);
    }

    public void deletar(int id){
        candidatoRepository.deletar(id);
    }
}
