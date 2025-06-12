package com.projeto.mundopcd.application;

import com.projeto.mundopcd.entities.Candidato;
import com.projeto.mundopcd.models.CandidatoModels;
import com.projeto.mundopcd.repositories.CandidatoRepository;
import com.projeto.mundopcd.repositories.JPA.CandidatoJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class CandidatoApplication {

    @Autowired
    private CandidatoRepository candidatoRepository;

    @Autowired
    private CandidatoJPA jpa;

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

    public ResponseEntity<?> cadastrar(CandidatoModels candidatoModels) {
        Candidato candidato = Candidato.toCandidato(candidatoModels);
        candidato.validar();

        if(jpa.existsByEmail(candidatoModels.getEmail())){
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Email já cadastrado!");
        }

        candidatoRepository.cadastrar(candidatoModels);
        return ResponseEntity.ok(candidatoModels);
    }

    public void deletar(int id){
        candidatoRepository.deletar(id);
    }

    public ResponseEntity<?> login(CandidatoModels candidatoModels){
        return candidatoRepository.login(candidatoModels);
    }

}
