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

    public void atualizar(EnderecoCandidato enderecoCandidato) {
        for (EnderecoCandidato ec : enderecos) {
            if (ec.getIdEnderecoCandidato() == enderecoCandidato.getIdEnderecoCandidato()) {
                ec.setIdEnderecoCandidato(enderecoCandidato.getIdEnderecoCandidato());
                ec.setLogradouro(enderecoCandidato.getLogradouro());
                ec.setNumero(enderecoCandidato.getNumero());
                ec.setCidade(enderecoCandidato.getCidade());
                ec.setEstado(enderecoCandidato.getEstado());
                ec.setCep(enderecoCandidato.getCep());
            }
        }
    }

}
