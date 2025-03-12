package com.projeto.mundopcd.repository;

import com.projeto.mundopcd.models.AdministradorEmpresa;
import com.projeto.mundopcd.models.Empresas;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AdministradorEmpresaRepository {

    private List<AdministradorEmpresa> administradoresEmpresa = new ArrayList<>();
    private int proximoId = 1;

    // Criar
    public AdministradorEmpresa salvarAdministrador(Empresas idEmpresa, String nomeEmpresa,
                                                    String email, String senha) {
        AdministradorEmpresa administradorEmpresa = new AdministradorEmpresa(proximoId++, idEmpresa, nomeEmpresa, email, senha);
        administradoresEmpresa.add(administradorEmpresa);
        return administradorEmpresa;
    }

    // Buscar
    public AdministradorEmpresa buscarAdministrador(int idAdmin) {
        for (AdministradorEmpresa administradorEmpresa : administradoresEmpresa) {
            if (administradorEmpresa.getIdAdmin() == idAdmin) {
                return administradorEmpresa;
            }
        }
        return null; // Retorna null se não encontrar
    }

    // Atualizar
    public boolean atualizarAdministrador(int idAdmin, Empresas novoIdEmpresa, String novoNomeEmpresa, String novoEmail, String novaSenha) {
        AdministradorEmpresa administradorEmpresa = buscarAdministrador(idAdmin);
        if (administradorEmpresa != null) {
            administradorEmpresa.setIdEmpresa(novoIdEmpresa);
            administradorEmpresa.setNomeEmpresa(novoNomeEmpresa);
            administradorEmpresa.setEmail(novoEmail);
            administradorEmpresa.setSenha(novaSenha);
            return true;
        }
        return false;
    }

    // Deletar
    public boolean deletarAdministrador(int idAdmin) {
        AdministradorEmpresa administradorEmpresa = buscarAdministrador(idAdmin);
        if (administradorEmpresa != null) {
            administradoresEmpresa.remove(administradorEmpresa);
            return true;
        }
        return false;
    }

    // Listar
    public List<AdministradorEmpresa> listarAdministradores() {
        return new ArrayList<>(administradoresEmpresa);
    }
}
