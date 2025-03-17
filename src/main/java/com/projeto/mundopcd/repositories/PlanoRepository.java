package com.projeto.mundopcd.repositories;

import com.projeto.mundopcd.models.Plano;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PlanoRepository {

    private List<Plano> planos = new ArrayList<>();

    public List<Plano> listar() {
        return planos;
    }

    public Plano buscarPorId(int id) {
        return planos.stream()
                .filter(plano -> plano.getIdPlano() == id)
                .findFirst()
                .orElse(null);
    }

    public Plano cadastrar(Plano plano) {
        planos.add(plano);
        return plano;
    }

    public void atualizar(Plano planoAtualizado) {
        for (Plano plano : planos) {
            if (plano.getIdPlano() == planoAtualizado.getIdPlano()) {
                plano.setNomePlano(planoAtualizado.getNomePlano());
                plano.setNomeCandidatura(planoAtualizado.getNomeCandidatura());
                plano.setNomeCandidato(planoAtualizado.getNomeCandidato());
                plano.setIdCandidatura(planoAtualizado.getIdCandidatura());
                plano.setIdCandidato(planoAtualizado.getIdCandidato());
                break;
            }
        }
    }

    public String deletar(int id) {
        planos.removeIf(plano -> plano.getIdPlano() == id);
        return "Plano com id " + id + " deletado com sucesso!";
    }
}