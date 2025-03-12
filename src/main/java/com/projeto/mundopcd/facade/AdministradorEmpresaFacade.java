package com.projeto.mundopcd.facade;

import com.projeto.mundopcd.Application.AdministradorEmpresaApplication;
import com.projeto.mundopcd.models.AdministradorEmpresa;
import com.projeto.mundopcd.models.Empresas;
import com.projeto.mundopcd.models.EnderecoEmpresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AdministradorEmpresaFacade {

    @Autowired
    private AdministradorEmpresaApplication administradorEmpresaApplication;

    public Object buscarPorId(int id){
       return administradorEmpresaApplication.buscarAdministradorPorId(id);
    }

    public List<AdministradorEmpresa> listarAdmnistradores(){
       return administradorEmpresaApplication.listarAdministradores();
    }

    public AdministradorEmpresa cadastrar(Empresas idEmpresa, String nomeEmpresa, String email, String senha){
        return administradorEmpresaApplication.cadastrarAdministrador(idEmpresa, nomeEmpresa, email, senha);
    }

    public boolean atualizarAdministrador(int idAdmin, Empresas novoIdEmpresa, String novoNomeEmpresa, String novoEmail, String novaSenha) {
        return administradorEmpresaApplication.atualizarAdministrador(idAdmin, novoIdEmpresa, novoNomeEmpresa, novoEmail, novaSenha);
    }

    public void removerAdmnistrador(int idAdmin){
        administradorEmpresaApplication.removerAdministrador(idAdmin);
    }

}
