package com.projeto.mundopcd.facade;

import com.projeto.mundopcd.application.EmpresasApplication;
import com.projeto.mundopcd.models.Empresas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmpresasFacade {

    @Autowired
    private EmpresasApplication empresasApplication;

    public Object buscarPorId(int id) {
        return empresasApplication.buscarPorId(id);
    }

    public List<Empresas> listar() {
        return empresasApplication.listar();
    }

    public Empresas cadastrar(Empresas empresa) {
        return empresasApplication.cadastrar(empresa);
    }

    public void deletar(int id) {
        empresasApplication.deletar(id);
    }
}
