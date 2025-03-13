package com.projeto.mundopcd.repositories;

import com.projeto.mundopcd.models.InscricoesCursos;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InscricoesCursosRepository {

    private List<InscricoesCursos> inscricoes = new ArrayList<>();

    public List<InscricoesCursos> listar() {
        return inscricoes;
    }

    public boolean existsById(int id) {
        return inscricoes.stream().anyMatch(inscricao -> inscricao.getIdInscricaoCurso() == id);
    }

    public InscricoesCursos buscarPorId(int id) {
        return inscricoes.stream()
                .filter(inscricao -> inscricao.getIdInscricaoCurso() == id)
                .findFirst()
                .orElse(null);
    }

    public InscricoesCursos cadastrar(InscricoesCursos inscricao) {
        inscricoes.add(inscricao);
        return inscricao;
    }

    public void atualizar(InscricoesCursos inscricaoAtualizada) {
        for (InscricoesCursos inscricao : inscricoes) {
            if (inscricao.getIdInscricaoCurso() == inscricaoAtualizada.getIdInscricaoCurso()) {
                inscricao.setNomeInscricaoCurso(inscricaoAtualizada.getNomeInscricaoCurso());
                inscricao.setDescricaoInscricaoCurso(inscricaoAtualizada.getDescricaoInscricaoCurso());
                break;
            }
        }
    }

    public String deletar(int id) {
        inscricoes.removeIf(inscricao -> inscricao.getIdInscricaoCurso() == id);
        return "Inscrição com id " + id + " deletada com sucesso!";
    }
}