package com.projeto.mundopcd.application;

import com.projeto.mundopcd.models.Vagas;
import com.projeto.mundopcd.repositories.VagasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class VagasApplication {

    @Autowired
    private VagasRepository vagasRepository;

    public Object buscarPorId(int id) {
        return vagasRepository.buscarPorId(id);
    }

    public List<Vagas> listar() {
        return vagasRepository.listar();
    }

    public Vagas cadastrar(Vagas vaga) {
        return vagasRepository.cadastrar(vaga);
    }

    public void deletar(int id) {
        vagasRepository.deletar(id);
    }
}
