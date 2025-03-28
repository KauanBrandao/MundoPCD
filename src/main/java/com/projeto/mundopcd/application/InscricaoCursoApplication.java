package com.projeto.mundopcd.application;

import com.projeto.mundopcd.models.InscricaoCurso;
import com.projeto.mundopcd.repositories.InscricaoCursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class InscricaoCursoApplication {

    @Autowired
    private InscricaoCursoRepository inscricaoCursoRepository;

    public List<InscricaoCurso> listar() {
        return inscricaoCursoRepository.listar();
    }

    public InscricaoCurso buscarPorId(int id) {
        return inscricaoCursoRepository.buscarPorId(id);
    }

    public InscricaoCurso cadastrar(InscricaoCurso inscricao) {
        return inscricaoCursoRepository.cadastrar(inscricao);
    }

    public void atualizar(InscricaoCurso inscricao, int id) {
        inscricaoCursoRepository.atualizar(inscricao, id);
    }

    public void deletar(int id) {
        inscricaoCursoRepository.deletar(id);
    }
}