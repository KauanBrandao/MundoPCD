package com.projeto.mundopcd.application;

import com.projeto.mundopcd.entities.Administrador;
import com.projeto.mundopcd.models.AdministradorModels;
import com.projeto.mundopcd.repositories.AdministradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AdministradorApplication {

    @Autowired
    private AdministradorRepository administradorRepository;

    public AdministradorModels buscarPorId(int id) {
        return administradorRepository.buscarPorId(id);
    }

    public List<AdministradorModels> listar() {
        return administradorRepository.listar();
    }

    public AdministradorModels cadastrar(AdministradorModels administradorModels) {
        Administrador administrador = Administrador.toAdministradorEmpresa(administradorModels);

        administrador.validarAdministrador();
        return administradorRepository.cadastrar(administradorModels);
    }

    public void deletar(int id) {
        administradorRepository.deletar(id);
    }

    public void atualizar(AdministradorModels administradorModels) {
        administradorRepository.atualizar(administradorModels);
    }
}
