package com.projeto.mundopcd.application;

import com.projeto.mundopcd.models.Curso;
import com.projeto.mundopcd.repositories.CursoRepository;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class CursoApplication {

    private CursoRepository cursoRepository;

    public CursoApplication(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    public List listar() {
        return cursoRepository.listar();
    }

    public Curso buscarPorId(int id) {
        return cursoRepository.buscarPorId(id);
    }

    public Curso cadastrar(Curso curso){
        return cursoRepository.cadastrar(curso);
    }

    public void atualizar(Curso curso){
        cursoRepository.atualizar(curso);
    }

    public void deletar(int id){
        cursoRepository.deletar(id);
    }
}
