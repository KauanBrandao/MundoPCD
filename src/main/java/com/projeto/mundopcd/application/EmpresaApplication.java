package com.projeto.mundopcd.application;

import com.projeto.mundopcd.models.Empresa;
import com.projeto.mundopcd.repositories.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmpresaApplication {

    @Autowired
    private EmpresaRepository empresaRepository;

    public Empresa buscarPorId(int id) {
        return empresaRepository.buscarPorId(id);
    }

    public List<Empresa> listar() {
        return empresaRepository.listar();
    }

    public Empresa cadastrar(Empresa empresa) {
        return empresaRepository.cadastrar(empresa);
    }

    public void deletar(int id) {
        empresaRepository.deletar(id);
    }

    public void atualizar(Empresa empresa, int id) {
        empresaRepository.atualizar(empresa, id);
    }
}
