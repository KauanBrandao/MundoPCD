package com.projeto.mundopcd.repositories;

import com.projeto.mundopcd.repositories.JPA.AdministradorEmpresaJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.projeto.mundopcd.models.AdministradorEmpresa;
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

    public AdministradorEmpresa buscarPorId(int id) {
       return this.administradorEmpresaJpa.findById(id).get();
    }

    public List<AdministradorEmpresa> listar() {
        return this.administradorEmpresaJpa.findAll();
    }

    public AdministradorEmpresa cadastrar(AdministradorEmpresa administradorEmpresa) {
        return administradorEmpresaJpa.save(administradorEmpresa);
    }

    public void atualizar(AdministradorEmpresa administradorEmpresa) {
        administradorEmpresaJpa.save(administradorEmpresa);
    }

    public void deletar(int id) {
        administradorEmpresaJpa.deleteById(id);
    }

}