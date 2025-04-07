package com.projeto.mundopcd.repositories;

import com.projeto.mundopcd.models.Candidatura;
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

    public Candidatura buscarPorId(int id) {
        return this.candidaturaJpa.findById(id).get();
    }

    public Candidatura cadastrar(Candidatura candidatura){
        return candidaturaJpa.save(candidatura);
    }

    public void atualizar(Candidatura candidatura, int id) {
        Candidatura candidaturaInDb = this.candidaturaJpa.findById(id).get();

        candidaturaInDb.setCandidato(candidatura.getCandidato());
        candidaturaInDb.setVaga(candidatura.getVaga());
        candidaturaJpa.save(candidaturaInDb);
    }

    public void deletar(int id){
        this.candidaturaJpa.deleteById(id);
    }

}
