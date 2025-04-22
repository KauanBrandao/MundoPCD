package com.projeto.mundopcd.facade;

import com.projeto.mundopcd.application.VagaApplication;
import com.projeto.mundopcd.models.VagaModels;
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

    public List<VagaModels> listar() {
        return vagaApplication.listar();
    }

    public VagaModels cadastrar(VagaModels vagaModels) {
        return vagaApplication.cadastrar(vagaModels);
    }

    public void deletar(int id) {
        vagaApplication.deletar(id);
    }

    public void atualizar(VagaModels vagaModels) {
        vagaApplication.atualizar(vagaModels);
    }

}
