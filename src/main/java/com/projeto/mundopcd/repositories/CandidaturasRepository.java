package com.projeto.mundopcd.repositories;

import com.projeto.mundopcd.models.Candidaturas;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CandidaturasRepository {

    private List<Candidaturas> candidaturas = new ArrayList<>();

    public List listar(){
        return candidaturas;
    }

}
