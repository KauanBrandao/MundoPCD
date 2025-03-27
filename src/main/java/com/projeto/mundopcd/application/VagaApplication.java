package com.projeto.mundopcd.application;

import com.projeto.mundopcd.models.Vaga;
import com.projeto.mundopcd.repositories.VagaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class VagaApplication {

    @Autowired
    private VagaRepository vagaRepository;

    public Vaga buscarPorId(int id) {
        return vagaRepository.buscarPorId(id);
    }

    public List<Vaga> listar() {
        return vagaRepository.listar();
    }

    public Vaga cadastrar(Vaga vaga) {
        return vagaRepository.cadastrar(vaga);
    }

    public void deletar(int id) {
        vagaRepository.deletar(id);
    }

    public void atualizar(Vaga vaga, int id) {
        vagaRepository.atualizar(vaga, id);
    }
}
