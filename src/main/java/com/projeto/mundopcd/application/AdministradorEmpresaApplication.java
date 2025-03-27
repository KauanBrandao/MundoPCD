package com.projeto.mundopcd.application;

import com.projeto.mundopcd.models.AdministradorEmpresa;
import com.projeto.mundopcd.repositories.AdministradorEmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AdministradorEmpresaApplication {

    @Autowired
    private AdministradorEmpresaRepository administradorEmpresaRepository;

    public AdministradorEmpresa buscarPorId(int id) {
        return administradorEmpresaRepository.buscarPorId(id);
    }

    public List<AdministradorEmpresa> listar() {
        return administradorEmpresaRepository.listar();
    }

    public AdministradorEmpresa cadastrar(AdministradorEmpresa administradorEmpresa) {
        return administradorEmpresaRepository.cadastrar(administradorEmpresa);
    }

    public void deletar(int id) {
        administradorEmpresaRepository.deletar(id);
    }

    public void atualizar(AdministradorEmpresa administradorEmpresa, int id) {
        administradorEmpresaRepository.atualizar(administradorEmpresa, id);
    }
}
