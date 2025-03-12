package com.projeto.mundopcd.repositories;

import com.projeto.mundopcd.models.InscricoesCursos;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class InscricoesCursosRepository {

    private final List<InscricoesCursos> inscricoes = new ArrayList<>();
    private int nextId = 1;

    public InscricoesCursos salvar(InscricoesCursos inscricao) {
        inscricao.setIdInscricaoCurso(nextId++);
        inscricoes.add(inscricao);
        return inscricao;
    }

    public List<InscricoesCursos> buscarTodos() {
        return new ArrayList<>(inscricoes);
    }

    public Optional<InscricoesCursos> buscarPorId(int id) {
        return inscricoes.stream()
                .filter(inscricao -> inscricao.getIdInscricaoCurso() == id)
                .findFirst();
    }

public void atualizar(InscricoesCursos inscricaoAtualizada) {
    for (int i = 0; i < inscricoes.size(); i++) {
        InscricoesCursos inscricao = inscricoes.get(i);
        if (inscricao.getIdInscricaoCurso() == inscricaoAtualizada.getIdInscricaoCurso()) {
            inscricoes.set(i, inscricaoAtualizada);
            break;
        }
   }

    public void deletar(int id) {
        inscricoes.removeIf(inscricao -> inscricao.getIdInscricaoCurso() == id);
    }
}