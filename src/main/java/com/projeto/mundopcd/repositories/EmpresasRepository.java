package com.projeto.mundopcd.repositories;

import com.projeto.mundopcd.models.Empresas;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmpresasRepository {

    private List<Empresas> empresas = new ArrayList<>();

    public boolean existsById(int id) {
        return empresas.stream().anyMatch(emp -> emp.getIdEmpresa() == id);
    }

    public Empresas buscarPorId(int id) {
        return empresas.stream().filter(emp -> emp.getIdEmpresa() == id).
                findFirst().
                orElse(null);
    }


    public List<Empresas> listar() {
        return empresas;
    }

    public Empresas cadastrar(Empresas empresa) {
        empresas.add(empresa);
        return empresa;
    }

    public void atualizar(Empresas empresa) {
        for (Empresas emp : empresas) {
            if (emp.getIdEmpresa() == empresa.getIdEmpresa()) {
                emp.setIdEmpresa(empresa.getIdEmpresa());
                emp.setNomeEmpresa(empresa.getNomeEmpresa());
                emp.setCnpj(empresa.getCnpj());
                emp.setIdEnderecoEmpresa(empresa.getIdEnderecoEmpresa());
                emp.setIdPlano(empresa.getIdPlano());
                emp.setSetor(empresa.getSetor());
                emp.setEmailContato(empresa.getEmailContato());
                emp.setPoliticaInclusao(empresa.getPoliticaInclusao());
            }
        }
    }

    public void deletar(int id) {
        if (existsById(id)) {
            empresas.removeIf(emp -> emp.getIdEmpresa() == id);
        }
    }
}
