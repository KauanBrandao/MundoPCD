package com.projeto.mundopcd.repositories;

import com.projeto.mundopcd.models.EnderecoCandidatoModels;
import com.projeto.mundopcd.repositories.JPA.EnderecoCandidatoJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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

    public EnderecoCandidatoModels buscarPorId(int id) {
        return this.enderecoCandidatoJpa.findById(id).get();
    }

    public List<EnderecoCandidatoModels> listar() {
        return this.enderecoCandidatoJpa.findAll();
    }

    public EnderecoCandidatoModels cadastrar(EnderecoCandidatoModels endereco) {
        return this.enderecoCandidatoJpa.save(endereco);
    }

    public void deletar(int id) {
        if (existsById(id)) {
           this.enderecoCandidatoJpa.deleteById(id);
        }
    }

    public void atualizar(EnderecoCandidatoModels endereco) {
        this.enderecoCandidatoJpa.save(endereco);
    }

}
