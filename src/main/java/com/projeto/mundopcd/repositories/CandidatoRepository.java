package com.projeto.mundopcd.repositories;

import com.projeto.mundopcd.models.CandidatoModels;
import com.projeto.mundopcd.repositories.JPA.CandidatoJPA;
import com.projeto.mundopcd.repositories.JPA.EnderecoCandidatoJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class CandidatoRepository {

    private final CandidatoJPA candidatoJpa;
    private final EnderecoCandidatoJPA enderecoJPA;

    @Autowired
    public CandidatoRepository(CandidatoJPA candidatoJpa, EnderecoCandidatoJPA enderecoJPA) {
        this.candidatoJpa = candidatoJpa;
        this.enderecoJPA = enderecoJPA;
    }

    public boolean existsById(int id) {
        return this.candidatoJpa.existsById(id);
    }

    public CandidatoModels buscarPorId(int id) {
        return this.candidatoJpa.findById(id).get();
    }

    public List<CandidatoModels> listar(){
        return this.candidatoJpa.findAll();
    }

    public CandidatoModels cadastrar(CandidatoModels candidatoModels) {
        return this.candidatoJpa.save(candidatoModels);
    }

    public void atualizar(CandidatoModels candidatoModels){
        this.candidatoJpa.save(candidatoModels);
    }

    public void deletar(int id){
        this.candidatoJpa.deleteById(id);
    }

    public ResponseEntity<?> login(CandidatoModels candidatoModels){
        CandidatoModels candidato = candidatoJpa.findByEmail(candidatoModels.getEmail());

        if(candidato == null){
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Usuário ou senha incorretos.");
        }

        if(!candidato.getSenha().equals(candidatoModels.getSenha())){
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Usuário ou senha incorretos.");
        }

        return ResponseEntity.ok(candidato);

    }

}