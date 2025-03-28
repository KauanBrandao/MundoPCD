package com.projeto.mundopcd.repositories;

import com.projeto.mundopcd.repositories.JPA.CandidaturaJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class CandidaturaRepository {

    private final CandidaturaJPA candidaturasJpa;

    @Autowired
    public CandidaturaRepository(CandidaturaJPA candidaturasJpa) {
        this.candidaturasJpa = candidaturasJpa;
    }

    public List listar(){
        return candidaturasJpa.findAll();
    }

}
