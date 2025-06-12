package com.projeto.mundopcd.facade;

import com.projeto.mundopcd.application.EmpresaApplication;
import com.projeto.mundopcd.models.EmpresaModels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class EmpresaFacade {

    @Autowired
    private EmpresaApplication empresaApplication;

    public Object buscarPorId(int id) {
        return empresaApplication.buscarPorId(id);
    }

    public List<EmpresaModels> listar() {
        return empresaApplication.listar();
    }

    public EmpresaModels cadastrar(EmpresaModels empresaModels) {
        return empresaApplication.cadastrar(empresaModels);
    }

    public void deletar(int id) {
        empresaApplication.deletar(id);
    }

    public void atualizar(EmpresaModels empresaModels) {
        empresaApplication.atualizar(empresaModels);
    }

    public ResponseEntity<?> login(EmpresaModels empresaModels){
        return empresaApplication.login(empresaModels);
    }
}
