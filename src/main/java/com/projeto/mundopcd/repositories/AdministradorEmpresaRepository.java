/*package com.projeto.mundopcd.repositories;

import org.springframework.stereotype.Repository;
import com.projeto.mundopcd.models.AdministradorEmpresa;
import com.projeto.mundopcd.models.Empresas;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AdministradorEmpresaRepository {
    private List<AdministradorEmpresa> administradoresEmpresa = new ArrayList<>();
    private int proximoId = 1;

    public boolean existsById(int idAdmin) {
        return administradoresEmpresa.stream().anyMatch(a -> a.getIdAdmin() == idAdmin);
    }

    public AdministradorEmpresa buscarPorId(int idAdmin) {
        return administradoresEmpresa.stream()
                .filter(a -> a.getIdAdmin() == idAdmin)
                .findFirst()
                .orElse(null);
    }

    public List<AdministradorEmpresa> listar() {
        return new ArrayList<>(administradoresEmpresa);
    }

    public AdministradorEmpresa cadastrar(AdministradorEmpresa administradorEmpresa) {
        administradorEmpresa.setIdAdmin(proximoId++);
        administradoresEmpresa.add(administradorEmpresa);
        return administradorEmpresa;
    }

    public void atualizar(AdministradorEmpresa administradorEmpresa, int idAdmin) {
        AdministradorEmpresa adminAtual = buscarPorId(idAdmin);
        if (adminAtual != null) {
            adminAtual.setIdEmpresa(administradorEmpresa.getIdEmpresa());
            adminAtual.setNomeEmpresa(administradorEmpresa.getNomeEmpresa());
            adminAtual.setEmail(administradorEmpresa.getEmail());
            adminAtual.setSenha(administradorEmpresa.getSenha());
        }
    }

    public void deletar(int idAdmin) {
        administradoresEmpresa.removeIf(a -> a.getIdAdmin() == idAdmin);
    }

}

*/
