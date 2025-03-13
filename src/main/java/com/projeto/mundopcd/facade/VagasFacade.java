package com.projeto.mundopcd.facade;

import com.projeto.mundopcd.application.VagasApplication;
import com.projeto.mundopcd.models.Vagas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class VagasFacade {

    @Autowired
    private VagasApplication vagasApplication;

    public Object buscarPorId(int id) {
        return vagasApplication.buscarPorId(id);
    }

    public List<Vagas> listar() {
        return vagasApplication.listar();
    }

    public Vagas cadastrar(Vagas vaga) {
        return vagasApplication.cadastrar(vaga);
    }

    public void deletar(int id) {
        vagasApplication.deletar(id);
    }

    public void atualizar(Vagas vaga) {
        vagasApplication.atualizar(vaga);
    }

}
