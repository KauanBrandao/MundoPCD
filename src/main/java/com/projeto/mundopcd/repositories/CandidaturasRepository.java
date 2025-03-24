package com.projeto.mundopcd.repositories;

import com.projeto.mundopcd.repositories.JPA.CandidaturasJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class CandidaturasRepository {

    private final CandidaturasJPA candidaturasJpa;

    @Autowired
    public CandidaturasRepository(CandidaturasJPA candidaturasJpa) {
        this.candidaturasJpa = candidaturasJpa;
    }

    public List listar(){
        return candidaturasJpa.findAll();
    }

}
