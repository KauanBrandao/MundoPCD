package com.projeto.mundopcd.repositories;
import com.projeto.mundopcd.models.Cursos;
import com.projeto.mundopcd.repositories.JPA.CursosJPA;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class CursosRepository {

    private CursosJPA cursosJpa;

    public List listar() {
        return this.cursosJpa.findAll();
    }

    public boolean existsById(int id) {
        return this.cursosJpa.existsById(id);
    }

    public Cursos buscarPorId(int id) {
        return this.cursosJpa.findById(id).get();
    }

    public Cursos cadastrar(Cursos curso){
        return cursosJpa.save(curso);
    }

    public void atualizar(Cursos curso, int id) {
        Cursos cursoInDB = this.cursosJpa.findById(id).get();

        cursoInDB.setTitulo(curso.getTitulo());
        cursoInDB.setDescricao(curso.getDescricao());
        cursoInDB.setCargaHoraria(curso.getCargaHoraria());
        cursoInDB.setIdEmpresa(curso.getIdEmpresa());
    }

    public void deletar(int id){
        this.cursosJpa.deleteById(id);
    }
}
