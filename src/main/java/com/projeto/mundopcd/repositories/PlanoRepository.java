package com.projeto.mundopcd.repositories;

import com.projeto.mundopcd.models.Plano;
import com.projeto.mundopcd.repositories.JPA.PlanoJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PlanoRepository {

    private final PlanoJPA planoJpa;

    @Autowired
    public PlanoRepository(PlanoJPA planoJpa) {
        this.planoJpa = planoJpa;
    }

    public List<Plano> listar() {
        return this.planoJpa.findAll();
    }

    public Plano buscarPorId(int id) {
        return this.planoJpa.findById(id).get();
    }

    public Plano cadastrar(Plano plano) {
        return this.planoJpa.save(plano);
    }

    public void atualizar(Plano plano, int id) {
        Plano planoInDb = this.planoJpa.findById(id).get();

        planoInDb.setNome(plano.getNome());
        planoInDb.setTipo(plano.getTipo());
        planoInDb.setValor(plano.getValor());
        this.planoJpa.save(planoInDb);
    }

    public void deletar(int id) {
        this.planoJpa.deleteById(id);
    }
}
