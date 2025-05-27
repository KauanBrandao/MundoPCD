package com.projeto.mundopcd.repositories;

import com.projeto.mundopcd.models.AdministradorModels;
import com.projeto.mundopcd.repositories.JPA.AdministradorJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class AdministradorRepository {
    private final AdministradorJPA administradorJpa;

    @Autowired
    public AdministradorRepository(AdministradorJPA administradorJpa) {
        this.administradorJpa = administradorJpa;
    }

    public boolean existsById(int id) {
        return this.administradorJpa.existsById(id);
    }

    public AdministradorModels buscarPorId(int id) {
       return this.administradorJpa.findById(id).get();
    }

    public List<AdministradorModels> listar() {
        return this.administradorJpa.findAll();
    }

    public AdministradorModels cadastrar(AdministradorModels administradorModels) {
        return administradorJpa.save(administradorModels);
    }

    public void atualizar(AdministradorModels administradorModels) {
        administradorJpa.save(administradorModels);
    }

    public void deletar(int id) {
        administradorJpa.deleteById(id);
    }

}