package com.projeto.mundopcd.facade;

import com.projeto.mundopcd.models.InscricoesCursos;
import com.projeto.mundopcd.repositories.InscricoesCursosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class InscricoesCursosFacade {

    @Autowired
    private InscricoesCursosRepository repository;

    public List<InscricoesCursos> listar() {
        return repository.listar();
    }

    public InscricoesCursos buscarPorId(int id) {
        return repository.buscarPorId(id);
    }

    public InscricoesCursos cadastrar(InscricoesCursos inscricao) {
        return repository.cadastrar(inscricao);
    }

    public void atualizar(InscricoesCursos inscricao) {
        repository.atualizar(inscricao);
    }

    public String deletar(int id) {
        return repository.deletar(id);
    }
}