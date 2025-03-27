package com.projeto.mundopcd.application;

import com.projeto.mundopcd.models.Plano;
import com.projeto.mundopcd.repositories.PlanoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PlanoApplication {

    @Autowired
    private PlanoRepository planoRepository;

    public List<Plano> listar() {
        return planoRepository.listar();
    }

    public Plano buscarPorId(int id) {
        return planoRepository.buscarPorId(id);
    }

    public Plano cadastrar(Plano plano) {
        return planoRepository.cadastrar(plano);
    }

    public void atualizar(Plano plano, int id) {
        planoRepository.atualizar(plano, id);
    }

    public void deletar(int id) {
        planoRepository.deletar(id);
    }
}
