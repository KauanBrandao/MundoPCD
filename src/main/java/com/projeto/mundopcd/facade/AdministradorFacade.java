package com.projeto.mundopcd.facade;

import com.projeto.mundopcd.application.AdministradorApplication;
import com.projeto.mundopcd.models.AdministradorModels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class AdministradorFacade {

    @Autowired
    private AdministradorApplication administradorApplication;

    public AdministradorModels buscarPorId(int id) {
        return administradorApplication.buscarPorId(id);
    }

    public List<AdministradorModels> listar() {
        return administradorApplication.listar();
    }

    public AdministradorModels cadastrar(AdministradorModels administradorModels) {
        return administradorApplication.cadastrar(administradorModels);
    }

    public void deletar(int id) {
        administradorApplication.deletar(id);
    }

    public void atualizar(AdministradorModels administradorModels) {
        administradorApplication.atualizar(administradorModels);
    }

}