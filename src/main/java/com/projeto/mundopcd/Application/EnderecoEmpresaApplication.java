package com.projeto.mundopcd.Application;

import com.projeto.mundopcd.models.EnderecoEmpresa;
import com.projeto.mundopcd.repository.EnderecoEmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EnderecoEmpresaApplication {

    @Autowired
    private EnderecoEmpresaRepository enderecoEmpresaRepository;

    public Object bucarporId(int id){
        return enderecoEmpresaRepository.buscarPorId(id);
    }

    public List<EnderecoEmpresa> listarEnderecos(){
        return enderecoEmpresaRepository.listarEnderecos();
    }

    public void removerEndereco(int id){
        enderecoEmpresaRepository.removerEndereco(id);
    }

    public EnderecoEmpresa cadastrar(String logradouro, String numero, String cidade, String estado, String cep) {
        return enderecoEmpresaRepository.criarEndereco(logradouro, numero, cidade, estado, cep);
    }

    public boolean atualizarEndereco(int id, String logradouro, String numero, String cidade, String estado, String cep) {
        return enderecoEmpresaRepository.atualizarEndereco(id, logradouro, numero, cidade, estado, cep);
    }
}
