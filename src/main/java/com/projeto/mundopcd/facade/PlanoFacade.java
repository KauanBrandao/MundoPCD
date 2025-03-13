package com.projeto.mundopcd.facade;

import com.projeto.mundopcd.models.Plano;
import com.projeto.mundopcd.repositories.PlanoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PlanoFacade {

    @Autowired
    private PlanoRepository repository;

    public List<Plano> listar() {
        return repository.listar();
    }

    public Plano buscarPorId(int id) {
        return repository.buscarPorId(id);
    }

    public Plano cadastrar(Plano plano) {
        return repository.cadastrar(plano);
    }

    public void atualizar(Plano plano) {
        repository.atualizar(plano);
    }

    public String deletar(int id) {
        return repository.deletar(id);
    }
}