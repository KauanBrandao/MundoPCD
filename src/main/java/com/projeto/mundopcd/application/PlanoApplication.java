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

    public Plano salvar(Plano plano) {
        return facade.salvar(plano);
    }

    public List<Plano> buscarTodos() {
        return facade.buscarTodos();
    }

    public Plano buscarPorId(int id) {
        return facade.buscarPorId(id).orElse(null);
    }

    public void deletar(int id) {
        facade.deletar(id);
    }
}