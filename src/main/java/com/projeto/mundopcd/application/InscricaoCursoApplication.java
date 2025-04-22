package com.projeto.mundopcd.application;

import com.projeto.mundopcd.models.InscricaoCursoModels;
import com.projeto.mundopcd.repositories.InscricaoCursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class InscricaoCursoApplication {

    @Autowired
    private InscricaoCursoRepository inscricaoCursoRepository;

    public List<InscricaoCursoModels> listar() {
        return inscricaoCursoRepository.listar();
    }

    public InscricaoCursoModels buscarPorId(int id) {
        return inscricaoCursoRepository.buscarPorId(id);
    }

    public InscricaoCursoModels cadastrar(InscricaoCursoModels inscricao) {
        return inscricaoCursoRepository.cadastrar(inscricao);
    }

    public void atualizar(InscricaoCursoModels inscricao) {
        inscricaoCursoRepository.atualizar(inscricao);
    }

    public void deletar(int id) {
        inscricaoCursoRepository.deletar(id);
    }
}