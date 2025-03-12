package com.projeto.mundopcd.facade;

import com.projeto.mundopcd.Application.EnderecoEmpresaApplication;
import com.projeto.mundopcd.models.EnderecoEmpresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EnderecoEmpresaFacade {

    @Autowired
    private EnderecoEmpresaApplication enderecoEmpresaApplication;

    public Object bucarporId(int id) {
        return enderecoEmpresaApplication.bucarporId(id);
    }

    public List<EnderecoEmpresa> listarEnderecos() {
        return enderecoEmpresaApplication.listarEnderecos();
    }

    public void removerEndereco(int id) {
        enderecoEmpresaApplication.removerEndereco(id);
    }

    public EnderecoEmpresa cadastrar(String logradouro, String numero, String cidade, String estado, String cep) {
        return enderecoEmpresaApplication.cadastrar(logradouro, numero, cidade, estado, cep);
    }

    public boolean atualizarEndereco(int id, String logradouro, String numero, String cidade, String estado, String cep) {
        return enderecoEmpresaApplication.atualizarEndereco(id, logradouro, numero, cidade, estado, cep);
    }
}
