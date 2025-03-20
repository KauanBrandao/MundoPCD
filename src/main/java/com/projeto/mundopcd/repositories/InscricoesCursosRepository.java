package com.projeto.mundopcd.repositories;

import com.projeto.mundopcd.models.Cursos;
import com.projeto.mundopcd.models.InscricoesCursos;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InscricoesCursosRepository {

    private List<InscricoesCursos> inscricoes = new ArrayList<>();
    private int proximoId = 1;

    public List<InscricoesCursos> listar() {
        return inscricoes;
    }

    public InscricoesCursos buscarPorId(int id) {
        return inscricoes.stream()
                .filter(inscricao -> inscricao.getIdInscricaoCurso() == id)
                .findFirst()
                .orElse(null);
    }

    public InscricoesCursos cadastrar(InscricoesCursos inscricao) {
        inscricao.setIdInscricaoCurso(proximoId);
        inscricoes.add(inscricao);
        return inscricao;
    }

    public void atualizar(InscricoesCursos inscricaoAtualizada, int id) {
        InscricoesCursos cursoAtual = buscarPorId(id);

        cursoAtual.setNomeInscricaoCurso(inscricaoAtualizada.getNomeInscricaoCurso());
        cursoAtual.setDescricaoInscricaoCurso(inscricaoAtualizada.getDescricaoInscricaoCurso());
    }

    public void deletar(int id) {
        inscricoes.removeIf(p -> p.getIdInscricaoCurso() == id);
    }
}