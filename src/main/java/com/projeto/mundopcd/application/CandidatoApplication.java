package com.projeto.mundopcd.application;

import com.projeto.mundopcd.entities.Candidato;
import com.projeto.mundopcd.models.CandidatoModels;
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

    public CandidatoModels buscarPorId(int id){
        return candidatoRepository.buscarPorId(id);
    }

    public List listar(){
        return candidatoRepository.listar();
    }

    public void atualizar(CandidatoModels candidatoModels){
        candidatoRepository.atualizar(candidatoModels);
    }

    public CandidatoModels cadastrar(CandidatoModels candidatoModels) {
        Candidato candidato = Candidato.toCandidato(candidatoModels);
        candidato.validar();


        return candidatoRepository.cadastrar(candidatoModels);
    }

    public void deletar(int id){
        candidatoRepository.deletar(id);
    }
}
