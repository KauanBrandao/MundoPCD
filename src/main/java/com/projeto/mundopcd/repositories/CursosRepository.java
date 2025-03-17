package com.projeto.mundopcd.repositories;
import com.projeto.mundopcd.models.Candidatos;
import com.projeto.mundopcd.models.Cursos;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CursosRepository {

    private List<Cursos> cursos = new ArrayList<Cursos>();
    private int proximoId = 1;

    public List listar() {
        return cursos;
    }

    public boolean existsById(int id) {
        if(cursos.get(id) != null) {
            return true;
        }else {
            return false;
        }
    }

    public Cursos buscarPorId(int id) {
        Cursos curso = cursos
                .stream()
                .filter(p -> p.getIdCurso() == id)
                .findFirst()
                .get();

        return curso;
    }

    public Cursos cadastrar(Cursos curso){
        curso.setIdCurso(proximoId++);
        cursos.add(curso);
        return curso;
    }

    public void atualizar(Cursos curso, int id) {
        Cursos cursoAtual = buscarPorId(id);

        cursoAtual.setTitulo(curso.getTitulo());
        cursoAtual.setDescricao(curso.getDescricao());
        cursoAtual.setCargaHoraria(curso.getCargaHoraria());
        cursoAtual.setIdEmpresa(curso.getIdEmpresa());
    }

    public void deletar(int id){
        cursos.removeIf(p -> p.getIdCurso() == id);
    }
}
