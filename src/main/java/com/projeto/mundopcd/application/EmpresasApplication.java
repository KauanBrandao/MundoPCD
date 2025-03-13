package com.projeto.mundopcd.application;

import com.projeto.mundopcd.models.Empresas;
import com.projeto.mundopcd.repositories.EmpresasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmpresasApplication {

    @Autowired
    private EmpresasRepository empresasRepository;

    public Object buscarPorId(int id) {
        return empresasRepository.buscarPorId(id);
    }

    public List<Empresas> listar() {
        return empresasRepository.listar();
    }

    public Empresas cadastrar(Empresas empresa) {
        return empresasRepository.cadastrar(empresa);
    }

    public void deletar(int id) {
        empresasRepository.deletar(id);
    }

    public void atualizar(Empresas empresa) {
        empresasRepository.atualizar(empresa);
    }
}
