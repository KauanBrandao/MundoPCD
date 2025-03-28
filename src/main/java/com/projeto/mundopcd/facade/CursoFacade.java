package com.projeto.mundopcd.facade;

import com.projeto.mundopcd.application.CursoApplication;
import com.projeto.mundopcd.models.Curso;
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

    public Curso buscarPorId(int id) {
        return cursoApplication.buscarPorId(id);
    }

    public Curso cadastrar(Curso curso){
        return cursoApplication.cadastrar(curso);
    }

    public void atualizar(Curso curso, int id){
        cursoApplication.atualizar(curso, id);
    }

    public void deletar(int id) {
        cursoApplication.deletar(id);
    }
}
