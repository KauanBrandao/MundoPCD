package com.projeto.mundopcd.facade;

import com.projeto.mundopcd.application.CandidatoApplication;
import com.projeto.mundopcd.models.CandidatoModels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class CandidatoFacade {

    @Autowired
    CandidatoApplication candidatoApplication;
    
    public CandidatoModels buscarPorId(int id){
        return candidatoApplication.buscarPorId(id);
    }

    public List listar(){
        return candidatoApplication.listar();
    }

    public void atualizar(CandidatoModels candidatoModels){
        candidatoApplication.atualizar(candidatoModels);
    }

    public ResponseEntity<?> cadastrar(CandidatoModels candidatoModels){
        return candidatoApplication.cadastrar(candidatoModels);
    }

    public void deletar(int id){
        candidatoApplication.deletar(id);
    }

    public ResponseEntity<?> login(CandidatoModels candidatoModels){
        return candidatoApplication.login(candidatoModels);
    }

}