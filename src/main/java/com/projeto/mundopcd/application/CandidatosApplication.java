package com.projeto.mundopcd.application;

import com.projeto.mundopcd.models.Candidatos;
import com.projeto.mundopcd.repositories.CandidatosRepository;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class CandidatosApplication {

    private CandidatosRepository candidatosRepository;

    public CandidatosApplication(CandidatosRepository candidatosRepository){
        this.candidatosRepository = candidatosRepository;
    }

    public Candidatos buscarPorId(int id){
        return candidatosRepository.buscarPorId(id);
    }

    public List listar(){
        return candidatosRepository.listar();
    }

    public void atualizar(Candidatos candidato, int id){
        candidatosRepository.atualizar(candidato, id);
    }

    public Candidatos cadastrar(Candidatos candidatos){
        return candidatosRepository.cadastrar(candidatos);
    }

    public void deletar(int id){
        candidatosRepository.deletar(id);
    }
}
