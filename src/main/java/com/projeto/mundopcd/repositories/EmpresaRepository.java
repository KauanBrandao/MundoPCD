package com.projeto.mundopcd.repositories;

import com.projeto.mundopcd.models.Empresa;
import com.projeto.mundopcd.repositories.JPA.EmpresaJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmpresaRepository {

    private final EmpresaJPA empresaJpa;

    @Autowired
    public EmpresaRepository(EmpresaJPA empresaJpa) {
        this.empresaJpa = empresaJpa;
    }

    public boolean existsById(int id) {
        return this.empresaJpa.existsById(id);
    }

    public Empresa buscarPorId(int id) {
        return this.empresaJpa.findById(id).get();
    }

    public List<Empresa> listar() {
        return this.empresaJpa.findAll();
    }

    public Empresa cadastrar(Empresa empresa) {
       return this.empresaJpa.save(empresa);
    }

    public void atualizar(Empresa empresa, int id) {

        Empresa empInDB = this.empresaJpa.findById(id).get();

        empInDB.setNomeEmpresa(empresa.getNomeEmpresa());
        empInDB.setCnpj(empresa.getCnpj());
        empInDB.setEnderecoEmpresa(empresa.getEnderecoEmpresa());
        empInDB.setPlano(empresa.getPlano());
        empInDB.setSetor(empresa.getSetor());
        empInDB.setEmailContato(empresa.getEmailContato());
        empInDB.setPoliticaInclusao(empresa.getPoliticaInclusao());
        this.empresaJpa.save(empInDB);


    }

    public void deletar(int id) {
        this.empresaJpa.deleteById(id);
    }
}
