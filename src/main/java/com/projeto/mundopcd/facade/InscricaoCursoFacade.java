package com.projeto.mundopcd.facade;

import com.projeto.mundopcd.application.InscricaoCursoApplication;
import com.projeto.mundopcd.models.InscricaoCurso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class InscricaoCursoFacade {

    @Autowired
    private InscricaoCursoApplication application;

    public List<InscricaoCurso> listar() {
        return application.listar();
    }

    public InscricaoCurso buscarPorId(int id) {
        return application.buscarPorId(id);
    }

    public InscricaoCurso cadastrar(InscricaoCurso inscricao) {
        return application.cadastrar(inscricao);
    }

    public void atualizar(InscricaoCurso inscricao, int id) {
        application.atualizar(inscricao, id);
    }

    public void deletar(int id) {
        application.deletar(id);
    }
}