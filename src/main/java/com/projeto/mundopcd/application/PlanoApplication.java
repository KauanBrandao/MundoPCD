package com.projeto.mundopcd.application;

import com.projeto.mundopcd.models.Planos;
import com.projeto.mundopcd.repositories.PlanoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
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

    public void atualizar(Planos planos) {
        planoRepository.atualizar(planos);
    }

    public String deletar(int id) {
        return planoRepository.deletar(id);
    }
}