package com.projeto.mundopcd.repositories;

import com.projeto.mundopcd.models.Vagas;
import com.projeto.mundopcd.repositories.JPA.VagasJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class VagasRepository {

    private final VagasJPA vagasJpa;

    @Autowired
    public VagasRepository(VagasJPA vagasJpa) {
        this.vagasJpa = vagasJpa;
    }

    public boolean existsById(int id) {
       return this.vagasJpa.existsById(id);
    }

    public Vagas buscarPorId(int id) {
        return this.vagasJpa.findById(id).get();
    }

    public List<Vagas> listar() {
        return this.vagasJpa.findAll();
    }

    public Vagas cadastrar(Vagas vaga) {
        return this.vagasJpa.save(vaga);
    }

    public void deletar(int id) {
        if (existsById(id)) {
            this.vagasJpa.deleteById(id);
        }
    }

    public void atualizar(Vagas vaga, int id) {
        Vagas vagaInDb = this.vagasJpa.findById(id).get();

        vagaInDb.setTitulo(vaga.getTitulo());
        vagaInDb.setDescricao(vaga.getDescricao());
        vagaInDb.setRequisitos(vaga.getRequisitos());
        vagaInDb.setSalario(vaga.getSalario());
        vagaInDb.setTipoContratacao(vaga.getTipoContratacao());
        vagaInDb.setLocalizacao(vaga.getLocalizacao());
        vagaInDb.setIdEmpresa(vaga.getIdEmpresa());
        this.vagasJpa.save(vagaInDb);
    }

}
