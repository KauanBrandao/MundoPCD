package com.projeto.mundopcd.repositories;

import com.projeto.mundopcd.models.Vaga;
import com.projeto.mundopcd.repositories.JPA.VagaJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class VagaRepository {

    private final VagaJPA vagaJpa;

    @Autowired
    public VagaRepository(VagaJPA vagaJpa) {
        this.vagaJpa = vagaJpa;
    }

    public boolean existsById(int id) {
       return this.vagaJpa.existsById(id);
    }

    public Vaga buscarPorId(int id) {
        return this.vagaJpa.findById(id).get();
    }

    public List<Vaga> listar() {
        return this.vagaJpa.findAll();
    }

    public Vaga cadastrar(Vaga vaga) {
        return this.vagaJpa.save(vaga);
    }

    public void deletar(int id) {
        if (existsById(id)) {
            this.vagaJpa.deleteById(id);
        }
    }

    public void atualizar(Vaga vaga, int id) {
        Vaga vagaInDb = this.vagaJpa.findById(id).get();

        vagaInDb.setTitulo(vaga.getTitulo());
        vagaInDb.setDescricao(vaga.getDescricao());
        vagaInDb.setRequisitos(vaga.getRequisitos());
        vagaInDb.setSalario(vaga.getSalario());
        vagaInDb.setTipoContratacao(vaga.getTipoContratacao());
        vagaInDb.setLocalizacao(vaga.getLocalizacao());
        vagaInDb.setEmpresa(vaga.getEmpresa());
        this.vagaJpa.save(vagaInDb);
    }

}
