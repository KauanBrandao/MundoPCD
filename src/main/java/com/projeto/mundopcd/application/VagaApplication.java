package com.projeto.mundopcd.application;

import com.projeto.mundopcd.models.VagaModels;
import com.projeto.mundopcd.repositories.VagaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class VagaApplication {

    @Autowired
    private VagaRepository vagaRepository;

    public VagaModels buscarPorId(int id) {
        return vagaRepository.buscarPorId(id);
    }

    public List<VagaModels> listar() {
        return vagaRepository.listar();
    }

    public VagaModels cadastrar(VagaModels vagaModels) {
        return vagaRepository.cadastrar(vagaModels);
    }

    public void deletar(int id) {
        vagaRepository.deletar(id);
    }

    public void atualizar(VagaModels vagaModels) {
        vagaRepository.atualizar(vagaModels);
    }
}
