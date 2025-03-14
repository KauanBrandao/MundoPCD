package com.projeto.mundopcd.repositories;

import com.projeto.mundopcd.models.EnderecoEmpresa;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EnderecoEmpresaRepository {
    private List<EnderecoEmpresa> enderecosEmpresas = new ArrayList<>();
    private int proximoId = 1;

    public boolean existsById(int id) {
        return enderecosEmpresas.stream().anyMatch(e -> e.getIdEnderecoEmpresa() == id);
    }

    public EnderecoEmpresa buscarPorId(int id) {
        return enderecosEmpresas.stream()
                .filter(e -> e.getIdEnderecoEmpresa() == id)
                .findFirst()
                .orElse(null);
    }

    public List<EnderecoEmpresa> listar() {
        return new ArrayList<>(enderecosEmpresas);
    }

    public EnderecoEmpresa cadastrar(EnderecoEmpresa enderecoEmpresa) {
        enderecoEmpresa.setIdEnderecoEmpresa(proximoId++);
        enderecosEmpresas.add(enderecoEmpresa);
        return enderecoEmpresa;
    }

    public void atualizar(EnderecoEmpresa enderecoEmpresa, int id) {
        EnderecoEmpresa enderecoAtual = buscarPorId(id);
        if (enderecoAtual != null) {
            enderecoAtual.setLagradouro(enderecoEmpresa.getLagradouro());
            enderecoAtual.setNumero(enderecoEmpresa.getNumero());
            enderecoAtual.setCidade(enderecoEmpresa.getCidade());
            enderecoAtual.setEstado(enderecoEmpresa.getEstado());
            enderecoAtual.setCep(enderecoEmpresa.getCep());
        }
    }

    public void deletar(int id) {
        enderecosEmpresas.removeIf(e -> e.getIdEnderecoEmpresa() == id);
    }

}
