package com.projeto.mundopcd.repositories;

import com.projeto.mundopcd.models.Plano;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class PlanoRepository {

    private final List<Plano> planos = new ArrayList<>();
    private int nextId = 1;

    public Plano salvar(Plano plano) {
        plano.setIdPlano(nextId++);
        planos.add(plano);
        return plano;
    }

    public List<Plano> buscarTodos() {
        return new ArrayList<>(planos);
    }

    public Optional<Plano> buscarPorId(int id) {
        return planos.stream()
                .filter(plano -> plano.getIdPlano() == id)
                .findFirst();
    }

    public void deletar(int id) {
        planos.removeIf(plano -> plano.getIdPlano() == id);
    }
}