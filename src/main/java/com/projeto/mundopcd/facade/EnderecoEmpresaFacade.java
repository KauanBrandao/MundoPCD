package com.projeto.mundopcd.facade;

import com.projeto.mundopcd.application.EnderecoEmpresaApplication;
import com.projeto.mundopcd.models.EnderecoEmpresa;

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

    public List<EnderecoEmpresa> listar(){
        return enderecoEmpresaApplication.listar();
    }

    public EnderecoEmpresa cadastrar(EnderecoEmpresa enderecoEmpresa){
        return enderecoEmpresaApplication.cadastrar(enderecoEmpresa);
    }

    public void deletar(int id){
        enderecoEmpresaApplication.deletar(id);
    }

    public void atualizar(EnderecoEmpresa enderecoEmpresa, int id){
        enderecoEmpresaApplication.atualizar(enderecoEmpresa, id);
    }
}
