package com.projeto.mundopcd.application;

import com.projeto.mundopcd.entities.Curso;
import com.projeto.mundopcd.models.CursoModels;
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

    public CursoModels buscarPorId(int id) {
        return cursoRepository.buscarPorId(id);
    }

    public CursoModels cadastrar(CursoModels cursoModels){
        Curso curso = Curso.toCurso(cursoModels);

        curso.validar();
        return cursoRepository.cadastrar(cursoModels);
    }

    public void atualizar(CursoModels cursoModels){
        cursoRepository.atualizar(cursoModels);
    }

    public void deletar(int id){
        cursoRepository.deletar(id);
    }
}
