package com.projeto.mundopcd.repositories;

import com.projeto.mundopcd.models.Cursos;
import com.projeto.mundopcd.models.InscricoesCursos;
import com.projeto.mundopcd.repositories.JPA.InscricoesCursosJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InscricoesCursosRepository {

    private final InscricoesCursosJPA inscricoesJPA;

    @Autowired
    public InscricoesCursosRepository(InscricoesCursosJPA inscricoesJPA) {
        this.inscricoesJPA = inscricoesJPA;
    }

    public List<InscricoesCursos> listar() {
        return inscricoesJPA.findAll();
    }

    public InscricoesCursos buscarPorId(int id) {
        return inscricoesJPA.findById(id).get();
    }

    public InscricoesCursos cadastrar(InscricoesCursos inscricao) {
        return inscricoesJPA.save(inscricao);
    }

    public void atualizar(InscricoesCursos inscricaoAtualizada, int id) {
        InscricoesCursos cursoInDb = this.inscricoesJPA.findById(id).get();

        inscricoesJPA.save(cursoInDb);
    }

    public void deletar(int id) {
        this.inscricoesJPA.deleteById(id);
    }
}