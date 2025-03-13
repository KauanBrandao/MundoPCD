package com.projeto.mundopcd.repositories;

import com.projeto.mundopcd.models.Empresas;
import com.projeto.mundopcd.models.EnderecoCandidato;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EnderecoCandidatoRepository {

    private List<EnderecoCandidato> enderecos = new ArrayList<>();

    public boolean existsById(int id) {
        return enderecos.stream().anyMatch(endereco -> endereco.getIdEnderecoCandidato() == id);
    }

    public EnderecoCandidato buscarPorId(int id) {
        return enderecos.stream().filter(end -> end.getIdEnderecoCandidato() == id).
                findFirst().
                orElse(null);
    }

    public List<EnderecoCandidato> listar() {
        return enderecos;
    }

    public EnderecoCandidato cadastrar(EnderecoCandidato endereco) {
        enderecos.add(endereco);
        return endereco;
    }

    public void deletar(int id) {
        if (existsById(id)) {
            enderecos.removeIf(endereco -> endereco.getIdEnderecoCandidato() == id);
        }
    }

    public void atualizar(EnderecoCandidato endereco, int id) {
        EnderecoCandidato enderecoAtual = buscarPorId(id);

        enderecoAtual.setIdEnderecoCandidato(endereco.getIdEnderecoCandidato());
        enderecoAtual.setLogradouro(endereco.getLogradouro());
        enderecoAtual.setNumero(endereco.getNumero());
        enderecoAtual.setCidade(endereco.getCidade());
        enderecoAtual.setEstado(endereco.getEstado());
        enderecoAtual.setCep(endereco.getCep());
    }

}
