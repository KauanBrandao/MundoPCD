package com.projeto.mundopcd.repositories;

import com.projeto.mundopcd.models.EnderecoEmpresa;
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

    public EnderecoEmpresa buscarPorId(int id) {
        return this.enderecoEmpresaJpa.findById(id).get();
    }

    public List<EnderecoEmpresa> listar() {
        return this.enderecoEmpresaJpa.findAll();
    }

    public EnderecoEmpresa cadastrar(EnderecoEmpresa enderecoEmpresa) {
        return this.enderecoEmpresaJpa.save(enderecoEmpresa);
    }

    public void atualizar(EnderecoEmpresa enderecoEmpresa) {
        this.enderecoEmpresaJpa.save(enderecoEmpresa);
    }

    public void deletar(int id) {
        this.enderecoEmpresaJpa.deleteById(id);
    }

}
