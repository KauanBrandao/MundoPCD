package com.projeto.mundopcd.facade;

import com.projeto.mundopcd.application.AdministradorEmpresaApplication;
import com.projeto.mundopcd.models.AdministradorEmpresaModels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AdministradorEmpresaFacade {

    @Autowired
    private AdministradorEmpresaApplication administradorEmpresaApplication;

    public AdministradorEmpresaModels buscarPorId(int id) {
        return administradorEmpresaApplication.buscarPorId(id);
    }

    public List<AdministradorEmpresaModels> listar() {
        return administradorEmpresaApplication.listar();
    }

    public AdministradorEmpresaModels cadastrar(AdministradorEmpresaModels administradorEmpresaModels) {
        return administradorEmpresaApplication.cadastrar(administradorEmpresaModels);
    }

    public void deletar(int id) {
        administradorEmpresaApplication.deletar(id);
    }

    public void atualizar(AdministradorEmpresaModels administradorEmpresaModels) {
        administradorEmpresaApplication.atualizar(administradorEmpresaModels);
    }

}