package com.projeto.mundopcd.facade;

import com.projeto.mundopcd.models.PlanoModels;
import com.projeto.mundopcd.application.PlanoApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PlanoFacade {

    @Autowired
    private PlanoApplication application;

    public List<PlanoModels> listar() {
        return application.listar();
    }

    public PlanoModels buscarPorId(int id) {
        return application.buscarPorId(id);
    }

    public PlanoModels cadastrar(PlanoModels planoModels) {
        return application.cadastrar(planoModels);
    }

    public void atualizar(PlanoModels planoModels) {
        application.atualizar(planoModels);
    }

    public void deletar(int id) {
        application.deletar(id);
    }
}
