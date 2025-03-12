package com.projeto.mundopcd.repositories;
import com.projeto.mundopcd.models.Cursos;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CursosRepository {

    private List<Cursos> cursos = new ArrayList<Cursos>();

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

    public Object buscarPorId(int id) {
        try{
            if(cursos.get(id) != null) {
                return "Não existe um curso cadastrado com o id " + id;
            }else{
                return existsById(id);
            }
        } catch(Exception e){
            return "Erro: " + e.getMessage();
        }
    }

    public Cursos cadastrar(Cursos curso){
        cursos.add(curso);
        return curso;
    }

    public void atualizar(Cursos curso){
        for(Cursos cursos: cursos) {
            cursos.setTitulo(curso.getTitulo());
            cursos.setDescricao(curso.getDescricao());
            cursos.setCargaHoraria(curso.getCargaHoraria());
            cursos.setIdEmpresa(curso.getIdEmpresa());
        }
    }

    public String deletar(int id){
        cursos.remove(id);
        return "Curso com id " + id + " deletado com sucesso!";
    }
}
