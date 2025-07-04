package com.projeto.mundopcd.application;

import com.projeto.mundopcd.entities.Empresa;
import com.projeto.mundopcd.models.EmpresaModels;
import com.projeto.mundopcd.repositories.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

        Empresa empresa = Empresa.toEmpresa(empresaModels);

        empresa.validarTudo();
        return empresaRepository.cadastrar(empresaModels);
    }

    public void deletar(int id) {
        empresaRepository.deletar(id);
    }

    public void atualizar(EmpresaModels empresaModels) {
        empresaRepository.atualizar(empresaModels);
    }

    public ResponseEntity<?> login(EmpresaModels empresaModels){
        return empresaRepository.login(empresaModels);
    }
}
