package com.projeto.mundopcd.repositories;

import com.projeto.mundopcd.models.EnderecoEmpresaModels;
import com.projeto.mundopcd.repositories.JPA.EnderecoEmpresaJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EnderecoEmpresaRepository {
    private final EnderecoEmpresaJPA enderecoEmpresaJpa;

    @Autowired
    public EnderecoEmpresaRepository(EnderecoEmpresaJPA enderecoEmpresaJpa) {
        this.enderecoEmpresaJpa = enderecoEmpresaJpa;
    }

    public boolean existsById(int id) {
        return this.enderecoEmpresaJpa.existsById(id);
    }

    public EnderecoEmpresaModels buscarPorId(int id) {
        return this.enderecoEmpresaJpa.findById(id).get();
    }

    public List<EnderecoEmpresaModels> listar() {
        return this.enderecoEmpresaJpa.findAll();
    }

    public EnderecoEmpresaModels cadastrar(EnderecoEmpresaModels enderecoEmpresaModels) {
        return this.enderecoEmpresaJpa.save(enderecoEmpresaModels);
    }

    public void atualizar(EnderecoEmpresaModels enderecoEmpresaModels) {
        this.enderecoEmpresaJpa.save(enderecoEmpresaModels);
    }

    public void deletar(int id) {
        this.enderecoEmpresaJpa.deleteById(id);
    }

}
