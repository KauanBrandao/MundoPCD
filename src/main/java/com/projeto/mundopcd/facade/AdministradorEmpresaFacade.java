/*package com.projeto.mundopcd.facade;

import com.projeto.mundopcd.application.AdministradorEmpresaApplication;
import com.projeto.mundopcd.models.AdministradorEmpresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AdministradorEmpresaFacade {

    @Autowired
    private AdministradorEmpresaApplication administradorEmpresaApplication;

    public AdministradorEmpresa buscarPorId(int id) {
        return administradorEmpresaApplication.buscarPorId(id);
    }

    public List<AdministradorEmpresa> listar() {
        return administradorEmpresaApplication.listar();
    }

    public AdministradorEmpresa cadastrar(AdministradorEmpresa administradorEmpresa) {
        return administradorEmpresaApplication.cadastrar(administradorEmpresa);
    }

    public void deletar(int id) {
        administradorEmpresaApplication.deletar(id);
    }

    public void atualizar(AdministradorEmpresa administradorEmpresa, int idAdmin) {
        administradorEmpresaApplication.atualizar(administradorEmpresa, idAdmin);
    }

}


 */