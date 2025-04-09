package com.projeto.mundopcd.repositories;
import com.projeto.mundopcd.models.Curso;
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

    public Curso buscarPorId(int id) {
        return this.cursoJpa.findById(id).get();
    }

    public Curso cadastrar(Curso curso){
        return cursoJpa.save(curso);
    }

    public void atualizar(Curso curso) {
        cursoJpa.save(curso);
    }

    public void deletar(int id){
        this.cursoJpa.deleteById(id);
    }
}
