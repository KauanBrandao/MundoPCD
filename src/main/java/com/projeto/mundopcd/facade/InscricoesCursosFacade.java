package com.projeto.mundopcd.facade;

import com.projeto.mundopcd.application.InscricoesCursosApplication;
import com.projeto.mundopcd.models.InscricoesCursos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class InscricoesCursosFacade {

    @Autowired
    private InscricoesCursosApplication application;

    public List<InscricoesCursos> listar() {
        return application.listar();
    }

    public InscricoesCursos buscarPorId(int id) {
        return application.buscarPorId(id);
    }

    public InscricoesCursos cadastrar(InscricoesCursos inscricao) {
        return application.cadastrar(inscricao);
    }

    public void atualizar(InscricoesCursos inscricao, int id) {
        application.atualizar(inscricao, id);
    }

    public void deletar(int id) {
        application.deletar(id);
    }
}