package com.projeto.mundopcd.facade;

import com.projeto.mundopcd.application.CursoApplication;
import com.projeto.mundopcd.models.CursoModels;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class CursoFacade {
    private CursoApplication cursoApplication;

    public CursoFacade(CursoApplication cursoApplication) {
        this.cursoApplication = cursoApplication;
    }

    public List listar() {
        return cursoApplication.listar();
    }

    public CursoModels buscarPorId(int id) {
        return cursoApplication.buscarPorId(id);
    }

    public CursoModels cadastrar(CursoModels cursoModels){
        return cursoApplication.cadastrar(cursoModels);
    }

    public void atualizar(CursoModels cursoModels){
        cursoApplication.atualizar(cursoModels);
    }

    public void deletar(int id) {
        cursoApplication.deletar(id);
    }
}
