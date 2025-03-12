package com.projeto.mundopcd.repositories;

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

    public Object buscarPorId(int id) {
        try {
            if (existsById(id)) {
                for (EnderecoCandidato endereco : enderecos) {
                    if (endereco.getIdEnderecoCandidato() == id) {
                        return endereco;
                    }
                }
            }
            return "Não existe endereço com o id " + id;
        } catch (Exception e) {
            return "Erro: " + e.getMessage();
        }
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
}
