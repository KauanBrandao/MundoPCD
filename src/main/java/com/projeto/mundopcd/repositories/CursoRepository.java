package com.projeto.mundopcd.repositories;
import com.projeto.mundopcd.models.CursoModels;
import com.projeto.mundopcd.repositories.JPA.CursoJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class CursoRepository {

    private final CursoJPA cursoJpa;

    @Autowired
    public CursoRepository(CursoJPA cursoJpa) {
        this.cursoJpa = cursoJpa;
    }

    public List listar() {
        return this.cursoJpa.findAll();
    }

    public boolean existsById(int id) {
        return this.cursoJpa.existsById(id);
    }

    public CursoModels buscarPorId(int id) {
        return this.cursoJpa.findById(id).get();
    }

    public CursoModels cadastrar(CursoModels cursoModels){
        return cursoJpa.save(cursoModels);
    }

    public void atualizar(CursoModels cursoModels) {
        cursoJpa.save(cursoModels);
    }

    public void deletar(int id){
        this.cursoJpa.deleteById(id);
    }
}
