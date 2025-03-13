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

    public List<InscricoesCursos> listar() {
        return facade.listar();
    }

    public InscricoesCursos buscarPorId(int id) {
        return facade.buscarPorId(id);
    }

    public InscricoesCursos cadastrar(InscricoesCursos inscricao) {
        return facade.cadastrar(inscricao);
    }

    public void atualizar(InscricoesCursos inscricao) {
        facade.atualizar(inscricao);
    }

    public String deletar(int id) {
        return facade.deletar(id);
    }
}