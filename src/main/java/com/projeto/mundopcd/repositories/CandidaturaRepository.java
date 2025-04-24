package com.projeto.mundopcd.repositories;

import com.projeto.mundopcd.models.CandidaturaModels;
import com.projeto.mundopcd.repositories.JPA.CandidaturaJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class CandidaturaRepository {

    private final CandidaturaJPA candidaturaJpa;

    @Autowired
    public CandidaturaRepository(CandidaturaJPA candidaturasJpa) {
        this.candidaturaJpa = candidaturasJpa;
    }

    public List listar(){
        return candidaturaJpa.findAll();
    }

    public boolean existsById(int id) {
        return this.candidaturaJpa.existsById(id);
    }

    public CandidaturaModels buscarPorId(int id) {
        return this.candidaturaJpa.findById(id).get();
    }

    public CandidaturaModels cadastrar(CandidaturaModels candidaturaModels){
        return candidaturaJpa.save(candidaturaModels);
    }

    public void atualizar(CandidaturaModels candidaturaModels) {
        this.candidaturaJpa.save(candidaturaModels);
    }

    public void deletar(int id){
        this.candidaturaJpa.deleteById(id);
    }

}
