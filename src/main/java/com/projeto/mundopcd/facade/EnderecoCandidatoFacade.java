package com.projeto.mundopcd.facade;

import com.projeto.mundopcd.application.EnderecoCandidatoApplication;
import com.projeto.mundopcd.models.EnderecoCandidato;
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

    public List<EnderecoCandidato> listar() {
        return enderecoCandidatoApplication.listar();
    }

    public EnderecoCandidato cadastrar(EnderecoCandidato endereco) {
        return enderecoCandidatoApplication.cadastrar(endereco);
    }

    public void deletar(int id) {
        enderecoCandidatoApplication.deletar(id);
    }

    public void atualizar(EnderecoCandidato endereco, int id) {
        enderecoCandidatoApplication.atualizar(endereco, id);
    }
}
