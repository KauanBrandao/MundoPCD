/*package com.projeto.mundopcd.repositories;

import com.projeto.mundopcd.repositories.JPA.AdministradorEmpresaJPA;
import org.springframework.stereotype.Repository;
import com.projeto.mundopcd.models.AdministradorEmpresa;
import com.projeto.mundopcd.models.Empresas;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AdministradorEmpresaRepository {
    private AdministradorEmpresaJPA administradorEmpresaJpa;

    public boolean existsById(int id) {
        return this.administradorEmpresaJpa.existsById(id);
    }

    public AdministradorEmpresa buscarPorId(int id) {
       return this.administradorEmpresaJpa.findById(id).get();
    }

    public List<AdministradorEmpresa> listar() {
        return this.administradorEmpresaJpa.findAll();
    }

    public AdministradorEmpresa cadastrar(AdministradorEmpresa administradorEmpresa) {
        return administradorEmpresaJpa.save(administradorEmpresa);
    }

    public void atualizar(AdministradorEmpresa administradorEmpresa, int id) {
        AdministradorEmpresa admInDB = this.administradorEmpresaJpa.findById(id).get() ;
        if (admInDB != null) {
            admInDB.setIdEmpresa(administradorEmpresa.getIdEmpresa());
            admInDB.setNomeEmpresa(administradorEmpresa.getNomeEmpresa());
            admInDB.setEmail(administradorEmpresa.getEmail());
            admInDB.setSenha(administradorEmpresa.getSenha());
        }
    }

    public void deletar(int id) {
        administradorEmpresaJpa.deleteById(id);
    }

}

*/
