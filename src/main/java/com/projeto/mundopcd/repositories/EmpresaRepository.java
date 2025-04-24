package com.projeto.mundopcd.repositories;

import com.projeto.mundopcd.models.EmpresaModels;
import com.projeto.mundopcd.repositories.JPA.EmpresaJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmpresaRepository {

    private final EmpresaJPA empresaJpa;

    @Autowired
    public EmpresaRepository(EmpresaJPA empresaJpa) {
        this.empresaJpa = empresaJpa;
    }

    public boolean existsById(int id) {
        return this.empresaJpa.existsById(id);
    }

    public EmpresaModels buscarPorId(int id) {
        return this.empresaJpa.findById(id).get();
    }

    public List<EmpresaModels> listar() {
        return this.empresaJpa.findAll();
    }

    public EmpresaModels cadastrar(EmpresaModels empresaModels) {
       return this.empresaJpa.save(empresaModels);
    }

    public void atualizar(EmpresaModels empresaModels) {
        this.empresaJpa.save(empresaModels);
    }

    public void deletar(int id) {
        this.empresaJpa.deleteById(id);
    }


}
