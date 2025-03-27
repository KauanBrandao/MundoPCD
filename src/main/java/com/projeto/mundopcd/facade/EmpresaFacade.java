package com.projeto.mundopcd.facade;

import com.projeto.mundopcd.application.EmpresaApplication;
import com.projeto.mundopcd.models.Empresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmpresaFacade {

    @Autowired
    private EmpresaApplication empresaApplication;

    public Object buscarPorId(int id) {
        return empresaApplication.buscarPorId(id);
    }

    public List<Empresa> listar() {
        return empresaApplication.listar();
    }

    public Empresa cadastrar(Empresa empresa) {
        return empresaApplication.cadastrar(empresa);
    }

    public void deletar(int id) {
        empresaApplication.deletar(id);
    }

    public void atualizar(Empresa empresa, int id) {
        empresaApplication.atualizar(empresa, id);
    }
}
