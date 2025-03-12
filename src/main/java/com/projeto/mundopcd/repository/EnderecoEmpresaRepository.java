package com.projeto.mundopcd.repository;

import com.projeto.mundopcd.models.EnderecoEmpresa;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EnderecoEmpresaRepository {
    private List<EnderecoEmpresa> enderecos = new ArrayList<>();
    private int proximoId = 1;

    // Criar um novo endereço
    public EnderecoEmpresa criarEndereco(String logradouro, String numero, String cidade, String estado, String cep) {
        EnderecoEmpresa enderecoEmpresa = new EnderecoEmpresa(proximoId++, logradouro, numero, cidade, estado, cep);
        enderecos.add(enderecoEmpresa);
        return enderecoEmpresa;
    }

    // Ler todos os endereços
    public List<EnderecoEmpresa> listarEnderecos() {
        return enderecos;
    }

    // Buscar endereço por ID
    public EnderecoEmpresa buscarPorId(int id) {
        for (EnderecoEmpresa enderecoEmpresa : enderecos) {
            if (enderecoEmpresa.getIdEnderecoEmpresa() == id) {
                return enderecoEmpresa;
            }
        }
        return null;
    }

    // Atualizar endereço por ID
    public boolean atualizarEndereco(int id, String logradouro, String numero, String cidade, String estado, String cep) {
        EnderecoEmpresa enderecoEmpresa = buscarPorId(id);
        if (enderecoEmpresa != null) {
            enderecoEmpresa.setLagradouro(logradouro);
            enderecoEmpresa.setNumero(numero);
            enderecoEmpresa.setCidade(cidade);
            enderecoEmpresa.setEstado(estado);
            enderecoEmpresa.setCep(cep);
            return true;
        }
        return false;
    }

    // Remover endereço por ID
    public boolean removerEndereco(int id) {
        EnderecoEmpresa enderecoEmpresa = buscarPorId(id);
        if (enderecoEmpresa != null) {
            enderecos.remove(enderecoEmpresa);
            return true;
        }
        return false;
    }
}
