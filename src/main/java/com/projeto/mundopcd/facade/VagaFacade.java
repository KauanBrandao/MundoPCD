package com.projeto.mundopcd.facade;

import com.projeto.mundopcd.application.VagaApplication;
import com.projeto.mundopcd.models.Vaga;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class VagaFacade {

    @Autowired
    private VagaApplication vagaApplication;

    public Object buscarPorId(int id) {
        return vagaApplication.buscarPorId(id);
    }

    public List<Vaga> listar() {
        return vagaApplication.listar();
    }

    public Vaga cadastrar(Vaga vaga) {
        return vagaApplication.cadastrar(vaga);
    }

    public void deletar(int id) {
        vagaApplication.deletar(id);
    }

    public void atualizar(Vaga vaga, int id) {
        vagaApplication.atualizar(vaga, id);
    }

}
