package com.projeto.mundopcd.repositories;

import com.projeto.mundopcd.models.Empresas;
import com.projeto.mundopcd.models.EnderecoCandidato;
import com.projeto.mundopcd.repositories.JPA.EnderecoCandidatoJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EnderecoCandidatoRepository {

    private final EnderecoCandidatoJPA enderecoCandidatoJpa;

    @Autowired
    public EnderecoCandidatoRepository(EnderecoCandidatoJPA enderecoCandidatoJpa) {
        this.enderecoCandidatoJpa = enderecoCandidatoJpa;
    }

    public boolean existsById(int id) {
        return this.enderecoCandidatoJpa.existsById(id);
    }

    public EnderecoCandidato buscarPorId(int id) {
        return this.enderecoCandidatoJpa.findById(id).get();
    }

    public List<EnderecoCandidato> listar() {
        return this.enderecoCandidatoJpa.findAll();
    }

    public EnderecoCandidato cadastrar(EnderecoCandidato endereco) {
        return this.enderecoCandidatoJpa.save(endereco);
    }

    public void deletar(int id) {
        if (existsById(id)) {
           this.enderecoCandidatoJpa.deleteById(id);
        }
    }

    public void atualizar(EnderecoCandidato endereco, int id) {
        EnderecoCandidato enderecoInDb = buscarPorId(id);

        enderecoInDb.setLogradouro(endereco.getLogradouro());
        enderecoInDb.setNumero(endereco.getNumero());
        enderecoInDb.setCidade(endereco.getCidade());
        enderecoInDb.setEstado(endereco.getEstado());
        enderecoInDb.setCep(endereco.getCep());
        this.enderecoCandidatoJpa.save(enderecoInDb);

    }

}
