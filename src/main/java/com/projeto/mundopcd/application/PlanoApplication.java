package com.projeto.mundopcd.application;

import com.projeto.mundopcd.models.Plano;
import com.projeto.mundopcd.repositories.PlanoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
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

    public void atualizar(Plano plano) {
        planoRepository.atualizar(plano);
    }

    public String deletar(int id) {
        return planoRepository.deletar(id);
    }
}