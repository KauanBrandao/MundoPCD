package com.projeto.mundopcd.application;

import com.projeto.mundopcd.entities.Plano;
import com.projeto.mundopcd.models.PlanoModels;
import com.projeto.mundopcd.repositories.PlanoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PlanoApplication {

    @Autowired
    private PlanoRepository planoRepository;

    public List<PlanoModels> listar() {
        return planoRepository.listar();
    }

    public PlanoModels buscarPorId(int id) {
        return planoRepository.buscarPorId(id);
    }

    public PlanoModels cadastrar(PlanoModels planoModels) {
        Plano plano = Plano.toPlano(planoModels);

        plano.executarValidacoes();
        return planoRepository.cadastrar(planoModels);
    }

    public void atualizar(PlanoModels planoModels) {
        planoRepository.atualizar(planoModels);
    }

    public void deletar(int id) {
        planoRepository.deletar(id);
    }
}
