package com.projeto.mundopcd.repositories;

import com.projeto.mundopcd.repositories.JPA.AdministradorEmpresaJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.projeto.mundopcd.models.AdministradorEmpresaModels;
import java.util.List;

@Repository
public class AdministradorEmpresaRepository {
    private final AdministradorEmpresaJPA administradorEmpresaJpa;

    @Autowired
    public AdministradorEmpresaRepository(AdministradorEmpresaJPA administradorEmpresaJpa) {
        this.administradorEmpresaJpa = administradorEmpresaJpa;
    }

    public boolean existsById(int id) {
        return this.administradorEmpresaJpa.existsById(id);
    }

    public AdministradorEmpresaModels buscarPorId(int id) {
       return this.administradorEmpresaJpa.findById(id).get();
    }

    public List<AdministradorEmpresaModels> listar() {
        return this.administradorEmpresaJpa.findAll();
    }

    public AdministradorEmpresaModels cadastrar(AdministradorEmpresaModels administradorEmpresaModels) {
        return administradorEmpresaJpa.save(administradorEmpresaModels);
    }

    public void atualizar(AdministradorEmpresaModels administradorEmpresaModels) {
        administradorEmpresaJpa.save(administradorEmpresaModels);
    }

    public void deletar(int id) {
        administradorEmpresaJpa.deleteById(id);
    }

}