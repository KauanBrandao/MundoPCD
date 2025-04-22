package com.projeto.mundopcd.repositories;

import com.projeto.mundopcd.models.InscricaoCursoModels;
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

    public List<InscricaoCursoModels> listar() {
        return inscricoesJPA.findAll();
    }

    public InscricaoCursoModels buscarPorId(int id) {
        return inscricoesJPA.findById(id).get();
    }

    public InscricaoCursoModels cadastrar(InscricaoCursoModels inscricao) {
        return inscricoesJPA.save(inscricao);
    }

    public void atualizar(InscricaoCursoModels inscricao) {
        inscricoesJPA.save(inscricao);
    }

    public void deletar(int id) {
        this.inscricoesJPA.deleteById(id);
    }
}