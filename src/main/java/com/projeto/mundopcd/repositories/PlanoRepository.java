package com.projeto.mundopcd.repositories;

import com.projeto.mundopcd.models.Planos;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class PlanoRepository {

    private List<Planos> planos = new ArrayList<>();
    private int proximoId = 1;

    public List<Planos> listar() {
        return planos;
    }

    public Planos buscarPorId(int id) {
        return planos.stream()
                .filter(planos -> planos.getIdPlano() == id)
                .findFirst()
                .orElse(null);
    }

    public Planos cadastrar(Planos planos) {
        planos.setIdPlano(proximoId++);
        this.planos.add(planos);
        return planos;
    }

    public void atualizar(Planos planosAtualizado) {
        for (Planos planos : this.planos) {
            if (planos.getIdPlano() == planosAtualizado.getIdPlano()) {
                planos.setNomePlano(planosAtualizado.getNomePlano());
                planos.setNomeCandidatura(planosAtualizado.getNomeCandidatura());
                planos.setNomeCandidato(planosAtualizado.getNomeCandidato());
                planos.setIdCandidatura(planosAtualizado.getIdCandidatura());
                planos.setIdCandidato(planosAtualizado.getIdCandidato());
                break;
            }
        }
    }

    public String deletar(int id) {
        planos.removeIf(planos -> planos.getIdPlano() == id);
        return "Planos com id " + id + " deletado com sucesso!";
    }
}