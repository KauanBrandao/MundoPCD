package com.projeto.mundopcd.repositories;

import com.projeto.mundopcd.models.Empresas;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmpresasRepository {

    private final List<Empresas> empresas = new ArrayList<>();
    private int proximoId = 1;

    public boolean existsById(int id) {
        return empresas.stream().anyMatch(emp -> emp.getIdEmpresa() == id);
    }

    public Empresas buscarPorId(int id) {
        return empresas.stream().filter(emp -> emp.getIdEmpresa() == id).
                findFirst().get();
    }

    public List<Empresas> listar() {
        return empresas;
    }

    public Empresas cadastrar(Empresas empresa) {
        empresa.setIdEmpresa(proximoId++);
        empresas.add(empresa);
        return empresa;
    }

    public void atualizar(Empresas empresa, int id) {

        Empresas empAtual = buscarPorId(id);


        empAtual.setNomeEmpresa(empresa.getNomeEmpresa());
        empAtual.setCnpj(empresa.getCnpj());
        empAtual.setIdEnderecoEmpresa(empresa.getIdEnderecoEmpresa());
        empAtual.setIdPlano(empresa.getIdPlano());
        empAtual.setSetor(empresa.getSetor());
        empAtual.setEmailContato(empresa.getEmailContato());
        empAtual.setPoliticaInclusao(empresa.getPoliticaInclusao());


    }

    public void deletar(int id) {
        if (existsById(id)) {
            empresas.removeIf(emp -> emp.getIdEmpresa() == id);
        }
    }
}
