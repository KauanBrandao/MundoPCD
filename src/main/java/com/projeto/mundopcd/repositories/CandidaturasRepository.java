package com.projeto.mundopcd.repositories;

import com.projeto.mundopcd.repositories.JPA.CandidaturasJPA;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class CandidaturasRepository {

    private CandidaturasJPA candidaturasJpa;

    public List listar(){
        return candidaturasJpa.findAll();
    }

}
