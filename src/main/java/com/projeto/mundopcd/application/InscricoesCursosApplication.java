package com.projeto.mundopcd.application;

import com.projeto.mundopcd.models.InscricoesCursos;
import com.projeto.mundopcd.repositories.InscricoesCursosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class InscricoesCursosApplication {

    @Autowired
    private InscricoesCursosRepository inscricoesCursosRepository;

    public List<InscricoesCursos> listar() {
        return inscricoesCursosRepository.listar();
    }

    public InscricoesCursos buscarPorId(int id) {
        return inscricoesCursosRepository.buscarPorId(id);
    }

    public InscricoesCursos cadastrar(InscricoesCursos inscricao) {
        return inscricoesCursosRepository.cadastrar(inscricao);
    }

    public void atualizar(InscricoesCursos inscricao, int id) {
        inscricoesCursosRepository.atualizar(inscricao, id);
    }

    public void deletar(int id) {
        inscricoesCursosRepository.deletar(id);
    }
}