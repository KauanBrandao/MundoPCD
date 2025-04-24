package com.projeto.mundopcd.application;

import com.projeto.mundopcd.entities.AdministradorEmpresa;
import com.projeto.mundopcd.models.AdministradorEmpresaModels;
import com.projeto.mundopcd.repositories.AdministradorEmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AdministradorEmpresaApplication {

    @Autowired
    private AdministradorEmpresaRepository administradorEmpresaRepository;

    public AdministradorEmpresaModels buscarPorId(int id) {
        return administradorEmpresaRepository.buscarPorId(id);
    }

    public List<AdministradorEmpresaModels> listar() {
        return administradorEmpresaRepository.listar();
    }

    public AdministradorEmpresaModels cadastrar(AdministradorEmpresaModels administradorEmpresaModels) {
        AdministradorEmpresa administradorEmpresa = AdministradorEmpresa.toAdministradorEmpresa(administradorEmpresaModels);

        administradorEmpresa.validarAdministrador();
        return administradorEmpresaRepository.cadastrar(administradorEmpresaModels);
    }

    public void deletar(int id) {
        administradorEmpresaRepository.deletar(id);
    }

    public void atualizar(AdministradorEmpresaModels administradorEmpresaModels) {
        administradorEmpresaRepository.atualizar(administradorEmpresaModels);
    }
}
