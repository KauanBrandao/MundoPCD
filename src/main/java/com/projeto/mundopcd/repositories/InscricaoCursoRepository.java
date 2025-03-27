package com.projeto.mundopcd.repositories;

import com.projeto.mundopcd.models.InscricaoCurso;
import com.projeto.mundopcd.repositories.JPA.InscricaoCursoJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InscricaoCursoRepository {

    private final InscricaoCursoJPA inscricoesJPA;

    @Autowired
    public InscricaoCursoRepository(InscricaoCursoJPA inscricoesJPA) {
        this.inscricoesJPA = inscricoesJPA;
    }

    public List<InscricaoCurso> listar() {
        return inscricoesJPA.findAll();
    }

    public InscricaoCurso buscarPorId(int id) {
        return inscricoesJPA.findById(id).get();
    }

    public InscricaoCurso cadastrar(InscricaoCurso inscricao) {
        return inscricoesJPA.save(inscricao);
    }

    public void atualizar(InscricaoCurso inscricaoAtualizada, int id) {
        InscricaoCurso cursoInDb = this.inscricoesJPA.findById(id).get();

        inscricoesJPA.save(cursoInDb);
    }

    public void deletar(int id) {
        this.inscricoesJPA.deleteById(id);
    }
}