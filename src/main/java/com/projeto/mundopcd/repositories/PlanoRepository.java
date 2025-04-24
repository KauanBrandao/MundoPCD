package com.projeto.mundopcd.repositories;

import com.projeto.mundopcd.models.PlanoModels;
import com.projeto.mundopcd.repositories.JPA.PlanoJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PlanoRepository {

    private final PlanoJPA planoJpa;

    @Autowired
    public PlanoRepository(PlanoJPA planoJpa) {
        this.planoJpa = planoJpa;
    }

    public List<PlanoModels> listar() {
        return this.planoJpa.findAll();
    }

    public PlanoModels buscarPorId(int id) {
        return this.planoJpa.findById(id).get();
    }

    public PlanoModels cadastrar(PlanoModels planoModels) {
        return this.planoJpa.save(planoModels);
    }

    public void atualizar(PlanoModels planoModels) {
        this.planoJpa.save(planoModels);
    }

    public void deletar(int id) {
        this.planoJpa.deleteById(id);
    }
}
