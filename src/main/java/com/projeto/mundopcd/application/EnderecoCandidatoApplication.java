package com.projeto.mundopcd.application;

import com.projeto.mundopcd.models.EnderecoCandidato;
import com.projeto.mundopcd.repositories.EnderecoCandidatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EnderecoCandidatoApplication {

    @Autowired
    private EnderecoCandidatoRepository enderecoCandidatoRepository;

    public EnderecoCandidato buscarPorId(int id) {
        return enderecoCandidatoRepository.buscarPorId(id);
    }

    public List<EnderecoCandidato> listar() {
        return enderecoCandidatoRepository.listar();
    }

    public EnderecoCandidato cadastrar(EnderecoCandidato endereco) {
        return enderecoCandidatoRepository.cadastrar(endereco);
    }

    public void deletar(int id) {
        enderecoCandidatoRepository.deletar(id);
    }

    public void atualizar(EnderecoCandidato endereco) {
        enderecoCandidatoRepository.atualizar(endereco);
    }
}
