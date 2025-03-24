package com.projeto.mundopcd.facade;

import com.projeto.mundopcd.models.Planos;
import com.projeto.mundopcd.application.PlanoApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PlanoFacade {

    @Autowired
    private PlanoApplication application;

    public List<Planos> listar() {
        return application.listar();
    }

    public Planos buscarPorId(int id) {
        return application.buscarPorId(id);
    }

    public Planos cadastrar(Planos planos) {
        return application.cadastrar(planos);
    }

    public void atualizar(Planos planos, int id) {
        application.atualizar(planos, id);
    }

    public void deletar(int id) {
        application.deletar(id);
    }
}
