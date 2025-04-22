package com.projeto.mundopcd.application;

import com.projeto.mundopcd.models.EnderecoEmpresaModels;
import com.projeto.mundopcd.repositories.EnderecoEmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EnderecoEmpresaApplication {

    @Autowired
    private EnderecoEmpresaRepository enderecoEmpresaRepository;

    public EnderecoEmpresaModels buscarPorId(int id){
        return enderecoEmpresaRepository.buscarPorId(id);
    }

    public List<EnderecoEmpresaModels> listar(){
        return enderecoEmpresaRepository.listar();
    }

    public EnderecoEmpresaModels cadastrar(EnderecoEmpresaModels enderecoEmpresaModels){
        return enderecoEmpresaRepository.cadastrar(enderecoEmpresaModels);
    }

    public void deletar(int id){
        enderecoEmpresaRepository.deletar(id);
    }

    public void atualizar(EnderecoEmpresaModels enderecoEmpresaModels){
        enderecoEmpresaRepository.atualizar(enderecoEmpresaModels);
    }
}
