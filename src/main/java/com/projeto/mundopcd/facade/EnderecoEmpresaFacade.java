package com.projeto.mundopcd.facade;

import com.projeto.mundopcd.application.EnderecoEmpresaApplication;
import com.projeto.mundopcd.models.EnderecoEmpresaModels;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EnderecoEmpresaFacade {
    @Autowired
    private EnderecoEmpresaApplication enderecoEmpresaApplication;

    public Object buscarPorId(int id){
        return enderecoEmpresaApplication.buscarPorId(id);
    }

    public List<EnderecoEmpresaModels> listar(){
        return enderecoEmpresaApplication.listar();
    }

    public EnderecoEmpresaModels cadastrar(EnderecoEmpresaModels enderecoEmpresaModels){
        return enderecoEmpresaApplication.cadastrar(enderecoEmpresaModels);
    }

    public void deletar(int id){
        enderecoEmpresaApplication.deletar(id);
    }

    public void atualizar(EnderecoEmpresaModels enderecoEmpresaModels){
        enderecoEmpresaApplication.atualizar(enderecoEmpresaModels);
    }
}
