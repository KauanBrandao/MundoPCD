package com.projeto.mundopcd.facade;

import com.projeto.mundopcd.models.Plano;
import com.projeto.mundopcd.repositories.PlanoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class PlanoFacade {

    @Autowired
    private PlanoRepository repository;

    public Plano salvar(Plano plano) {
        return repository.salvar(plano);
    }

    public List<Plano> buscarTodos() {
        return repository.buscarTodos();
    }

    public Optional<Plano> buscarPorId(int id) {
        return repository.buscarPorId(id);
    }

    public void deletar(int id) {
        repository.deletar(id);
    }
}