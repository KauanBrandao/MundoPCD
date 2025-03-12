package com.projeto.mundopcd.facade;

import com.projeto.mundopcd.models.InscricoesCursos;
import com.projeto.mundopcd.repositories.InscricoesCursosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class InscricoesCursosFacade {

    @Autowired
    private InscricoesCursosRepository repository;

    public InscricoesCursos salvar(InscricoesCursos inscricao) {
        return repository.salvar(inscricao);
    }

    public List<InscricoesCursos> buscarTodos() {
        return repository.buscarTodos();
    }

    public Optional<InscricoesCursos> buscarPorId(int id) {
        return repository.buscarPorId(id);
    }

    public void atualizar(InscricoesCursos inscricao) {
    repository.atualizar(inscricao);
    }

    public void deletar(int id) {
        repository.deletar(id);
    }
}