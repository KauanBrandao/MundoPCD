package com.projeto.mundopcd.application;

import com.projeto.mundopcd.models.EnderecoEmpresa;
import com.projeto.mundopcd.repositories.EnderecoEmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EnderecoEmpresaApplication {

    @Autowired
    private EnderecoEmpresaRepository enderecoEmpresaRepository;

    public Object buscarPorId(int id){
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

    public void atualizar(EnderecoEmpresa enderecoEmpresa, int id){
        enderecoEmpresaRepository.atualizar(enderecoEmpresa, id);
    }
}
