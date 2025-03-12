package com.projeto.mundopcd.application;

import com.projeto.mundopcd.facade.InscricoesCursosFacade;
import com.projeto.mundopcd.models.InscricoesCursos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class InscricoesCursosApplication {

    @Autowired
    private InscricoesCursosFacade facade;

    public InscricoesCursos salvar(InscricoesCursos inscricao) {
        return facade.salvar(inscricao);
    }

    public List<InscricoesCursos> buscarTodos() {
        return facade.buscarTodos();
    }

    public InscricoesCursos buscarPorId(int id) {
        return facade.buscarPorId(id).orElse(null);
    }

    public void atualizar(InscricoesCursos inscricao) {
    facade.atualizar(inscricao);
    }

    public void deletar(int id) {
        facade.deletar(id);
    }
}