package com.projeto.mundopcd.application;

import com.projeto.mundopcd.models.EnderecoEmpresa;
import com.projeto.mundopcd.repositories.EnderecoEmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EnderecoEmpresaApplication {

    @Autowired
    private EnderecoEmpresaRepository enderecoEmpresaRepository;

    public EnderecoEmpresa buscarPorId(int id){
        return enderecoEmpresaRepository.buscarPorId(id);
    }

    public List<EnderecoEmpresa> listar(){
        return enderecoEmpresaRepository.listar();
    }

    public EnderecoEmpresa cadastrar(EnderecoEmpresa enderecoEmpresa){
        return enderecoEmpresaRepository.cadastrar(enderecoEmpresa);
    }

    public void deletar(int id){
        enderecoEmpresaRepository.deletar(id);
    }

    public void atualizar(EnderecoEmpresa enderecoEmpresa){
        enderecoEmpresaRepository.atualizar(enderecoEmpresa);
    }
}
