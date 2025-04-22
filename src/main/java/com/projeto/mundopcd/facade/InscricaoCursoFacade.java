package com.projeto.mundopcd.facade;

import com.projeto.mundopcd.application.InscricaoCursoApplication;
import com.projeto.mundopcd.models.InscricaoCursoModels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class InscricaoCursoFacade {

    @Autowired
    private InscricaoCursoApplication application;

    public List<InscricaoCursoModels> listar() {
        return application.listar();
    }

    public InscricaoCursoModels buscarPorId(int id) {
        return application.buscarPorId(id);
    }

    public InscricaoCursoModels cadastrar(InscricaoCursoModels inscricao) {
        return application.cadastrar(inscricao);
    }

    public void atualizar(InscricaoCursoModels inscricao) {
        application.atualizar(inscricao);
    }

    public void deletar(int id) {
        application.deletar(id);
    }
}