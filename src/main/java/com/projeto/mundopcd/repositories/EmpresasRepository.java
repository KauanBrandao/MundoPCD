package com.projeto.mundopcd.repositories;

import com.projeto.mundopcd.models.Empresas;
import com.projeto.mundopcd.repositories.JPA.EmpresasJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmpresasRepository {

    private final EmpresasJPA empresasJpa;

    @Autowired
    public EmpresasRepository(EmpresasJPA empresasJpa) {
        this.empresasJpa = empresasJpa;
    }

    public boolean existsById(int id) {
        return this.empresasJpa.existsById(id);
    }

    public Empresas buscarPorId(int id) {
        return this.empresasJpa.findById(id).get();
    }

    public List<Empresas> listar() {
        return this.empresasJpa.findAll();
    }

    public Empresas cadastrar(Empresas empresa) {
       return this.empresasJpa.save(empresa);
    }

    public void atualizar(Empresas empresa, int id) {

        Empresas empInDB = this.empresasJpa.findById(id).get();

        empInDB.setNomeEmpresa(empresa.getNomeEmpresa());
        empInDB.setCnpj(empresa.getCnpj());
        empInDB.setIdEnderecoEmpresa(empresa.getIdEnderecoEmpresa());
        empInDB.setIdPlano(empresa.getIdPlano());
        empInDB.setSetor(empresa.getSetor());
        empInDB.setEmailContato(empresa.getEmailContato());
        empInDB.setPoliticaInclusao(empresa.getPoliticaInclusao());
        this.empresasJpa.save(empInDB);


    }

    public void deletar(int id) {
        if (existsById(id)) {
            this.empresasJpa.deleteById(id);
        }
    }
}
