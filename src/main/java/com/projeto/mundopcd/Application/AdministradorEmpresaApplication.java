package com.projeto.mundopcd.Application;

import com.projeto.mundopcd.models.AdministradorEmpresa;
import com.projeto.mundopcd.models.Empresas;
import com.projeto.mundopcd.repository.AdministradorEmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdministradorEmpresaApplication {

    @Autowired
    private AdministradorEmpresaRepository administradorEmpresaRepository;

    // Criar
    public AdministradorEmpresa cadastrarAdministrador(Empresas idEmpresa, String nomeEmpresa, String email, String senha) {
        return administradorEmpresaRepository.salvarAdministrador(idEmpresa, nomeEmpresa, email, senha);
    }

    // Buscar
    public AdministradorEmpresa buscarAdministradorPorId(int idAdmin) {
        return administradorEmpresaRepository.buscarAdministrador(idAdmin);
    }

    // Atualizar
    public boolean atualizarAdministrador(int idAdmin, Empresas novoIdEmpresa, String novoNomeEmpresa, String novoEmail, String novaSenha) {
        return administradorEmpresaRepository.atualizarAdministrador(idAdmin, novoIdEmpresa, novoNomeEmpresa, novoEmail, novaSenha);
    }

    // Deletar
    public boolean removerAdministrador(int idAdmin) {
        return administradorEmpresaRepository.deletarAdministrador(idAdmin);
    }

    // Listar
    public List<AdministradorEmpresa> listarAdministradores() {
        return administradorEmpresaRepository.listarAdministradores();
    }
}
