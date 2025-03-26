package com.projeto.mundopcd.repositories;

import com.projeto.mundopcd.models.Planos;
import com.projeto.mundopcd.repositories.JPA.PlanosJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PlanoRepository {

    private final PlanosJPA planosJpa;

    @Autowired
    public PlanoRepository(PlanosJPA planosJpa) {
        this.planosJpa = planosJpa;
    }

    public List<Planos> listar() {
        return this.planosJpa.findAll();
    }

    public Planos buscarPorId(int id) {
        return this.planosJpa.findById(id).get();
    }

    public Planos cadastrar(Planos plano) {
        return this.planosJpa.save(plano);
    }

    public void atualizar(Planos plano, int id) {
        Planos planoInDb = this.planosJpa.findById(id).get();

        if (planoInDb != null) {
            planoInDb.setNomePlano(plano.getNomePlano());
            this.planosJpa.save(planoInDb);
        }
    }

    public void deletar(int id) {
        this.planosJpa.deleteById(id);
    }
}
