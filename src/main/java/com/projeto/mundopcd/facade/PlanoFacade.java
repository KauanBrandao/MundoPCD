package com.projeto.mundopcd.facade;

import com.projeto.mundopcd.models.Plano;
import com.projeto.mundopcd.application.PlanoApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PlanoFacade {

    @Autowired
    private PlanoApplication application;

    public List<Plano> listar() {
        return application.listar();
    }

    public Plano buscarPorId(int id) {
        return application.buscarPorId(id);
    }

    public Plano cadastrar(Plano plano) {
        return application.cadastrar(plano);
    }

    public void atualizar(Plano plano, int id) {
        application.atualizar(plano, id);
    }

    public void deletar(int id) {
        application.deletar(id);
    }
}
