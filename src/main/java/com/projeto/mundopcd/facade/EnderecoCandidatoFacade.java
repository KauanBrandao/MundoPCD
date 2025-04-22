package com.projeto.mundopcd.facade;

import com.projeto.mundopcd.application.EnderecoCandidatoApplication;
import com.projeto.mundopcd.models.EnderecoCandidatoModels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EnderecoCandidatoFacade {

    @Autowired
    private EnderecoCandidatoApplication enderecoCandidatoApplication;

    public Object buscarPorId(int id) {
        return enderecoCandidatoApplication.buscarPorId(id);
    }

    public List<EnderecoCandidatoModels> listar() {
        return enderecoCandidatoApplication.listar();
    }

    public EnderecoCandidatoModels cadastrar(EnderecoCandidatoModels enderecoCandidatoModels) {
        return enderecoCandidatoApplication.cadastrar(enderecoCandidatoModels);
    }

    public void deletar(int id) {
        enderecoCandidatoApplication.deletar(id);
    }

    public void atualizar(EnderecoCandidatoModels enderecoCandidatoModels) {
        enderecoCandidatoApplication.atualizar(enderecoCandidatoModels);
    }
}
