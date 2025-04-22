package com.projeto.mundopcd.application;

import com.projeto.mundopcd.entities.Empresa;
import com.projeto.mundopcd.models.EmpresaModels;
import com.projeto.mundopcd.repositories.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmpresaApplication {

    @Autowired
    private EmpresaRepository empresaRepository;

    public EmpresaModels buscarPorId(int id) {
        return empresaRepository.buscarPorId(id);
    }

    public List<EmpresaModels> listar() {
        return empresaRepository.listar();
    }

    public EmpresaModels cadastrar(EmpresaModels empresaModels) {
        Empresa empresa = new Empresa();


        empresa.validarCNPJ(empresaModels.getCnpj());
        empresa.validarTelefone(empresaModels.getTelefone());
        empresa.validarEmail(empresaModels.getEmail());

        return empresaRepository.cadastrar(empresaModels);
    }

    public void deletar(int id) {
        empresaRepository.deletar(id);
    }

    public void atualizar(EmpresaModels empresaModels) {
        empresaRepository.atualizar(empresaModels);
    }
}
