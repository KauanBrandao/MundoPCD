package com.projeto.mundopcd.application;

import com.projeto.mundopcd.models.Planos;
import com.projeto.mundopcd.repositories.PlanoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PlanoApplication {

    @Autowired
    private PlanoRepository planoRepository;

    public List<Planos> listar() {
        return planoRepository.listar();
    }

    public Planos buscarPorId(int id) {
        return planoRepository.buscarPorId(id);
    }

    public Planos cadastrar(Planos planos) {
        return planoRepository.cadastrar(planos);
    }

    public void atualizar(Planos planos, int id) {
        planoRepository.atualizar(planos, id);
    }

    public void deletar(int id) {
        planoRepository.deletar(id);
    }
}
