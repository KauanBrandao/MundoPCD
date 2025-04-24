package com.projeto.mundopcd.application;

import com.projeto.mundopcd.entities.EnderecoCandidato;
import com.projeto.mundopcd.models.EnderecoCandidatoModels;
import com.projeto.mundopcd.repositories.EnderecoCandidatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EnderecoCandidatoApplication {

    @Autowired
    private EnderecoCandidatoRepository enderecoCandidatoRepository;

    public EnderecoCandidatoModels buscarPorId(int id) {
        return enderecoCandidatoRepository.buscarPorId(id);
    }

    public List<EnderecoCandidatoModels> listar() {
        return enderecoCandidatoRepository.listar();
    }

    public EnderecoCandidatoModels cadastrar(EnderecoCandidatoModels enderecoCandidatoModels) {
        EnderecoCandidato enderecoCandidato = EnderecoCandidato.toEnderecoCandidato(enderecoCandidatoModels);
        enderecoCandidato.executarValidacoes();
        return enderecoCandidatoRepository.cadastrar(enderecoCandidatoModels);
    }

    public void deletar(int id) {
        enderecoCandidatoRepository.deletar(id);
    }

    public void atualizar(EnderecoCandidatoModels endereco) {
        enderecoCandidatoRepository.atualizar(endereco);
    }
}
