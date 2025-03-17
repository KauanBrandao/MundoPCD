package com.projeto.mundopcd.facade;

import com.projeto.mundopcd.application.CursosApplication;
import com.projeto.mundopcd.models.Cursos;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class CursosFacade {
    private CursosApplication cursosApplication;

    public CursosFacade(CursosApplication cursosApplication) {
        this.cursosApplication = cursosApplication;
    }

    public List listar() {
        return cursosApplication.listar();
    }

    public Cursos buscarPorId(int id) {
        return cursosApplication.buscarPorId(id);
    }

    public Cursos cadastrar(Cursos curso){
        return cursosApplication.cadastrar(curso);
    }

    public void atualizar(Cursos curso, int id){
        cursosApplication.atualizar(curso, id);
    }

    public void deletar(int id) {
        cursosApplication.deletar(id);
    }
}
