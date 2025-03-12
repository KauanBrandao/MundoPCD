package com.projeto.mundopcd.application;

import com.projeto.mundopcd.models.AdministradorEmpresa;
import com.projeto.mundopcd.models.Empresas;
import com.projeto.mundopcd.repositories.AdministradorEmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
public class AdministradorEmpresaApplication {

    @Autowired
    private AdministradorEmpresaRepository administradorEmpresaRepository;


    public AdministradorEmpresa cadastrarAdministrador(Empresas idEmpresa, String nomeEmpresa, String email, String senha) {
        return administradorEmpresaRepository.salvarAdministrador(idEmpresa, nomeEmpresa, email, senha);
    }

    public AdministradorEmpresa buscarAdministradorPorId(int idAdmin) {
        return administradorEmpresaRepository.buscarAdministrador(idAdmin);
    }


    public boolean atualizarAdministrador(int idAdmin, Empresas novoIdEmpresa, String novoNomeEmpresa, String novoEmail, String novaSenha) {
        return administradorEmpresaRepository.atualizarAdministrador(idAdmin, novoIdEmpresa, novoNomeEmpresa, novoEmail, novaSenha);
    }


    public boolean removerAdministrador(int idAdmin) {
        return administradorEmpresaRepository.deletarAdministrador(idAdmin);
    }


    public List<AdministradorEmpresa> listarAdministradores() {
        return administradorEmpresaRepository.listarAdministradores();
    }
}
