package com.projeto.mundopcd.application;

import com.projeto.mundopcd.facade.PlanoFacade;
import com.projeto.mundopcd.models.Plano;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PlanoApplication {

    @Autowired
    private PlanoFacade facade;

    public List<Plano> listar() {
        return facade.listar();
    }

    public Plano buscarPorId(int id) {
        return facade.buscarPorId(id);
    }

    public Plano cadastrar(Plano plano) {
        return facade.cadastrar(plano);
    }

    public void atualizar(Plano plano) {
        facade.atualizar(plano);
    }

    public String deletar(int id) {
        return facade.deletar(id);
    }
}