package com.projeto.mundopcd.repositories;

import com.projeto.mundopcd.models.CandidatoModels;
import com.projeto.mundopcd.models.EmpresaModels;
import com.projeto.mundopcd.repositories.JPA.EmpresaJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmpresaRepository {

    private final EmpresaJPA empresaJpa;

    @Autowired
    public EmpresaRepository(EmpresaJPA empresaJpa) {
        this.empresaJpa = empresaJpa;
    }

    public boolean existsById(int id) {
        return this.empresaJpa.existsById(id);
    }

    public EmpresaModels buscarPorId(int id) {
        return this.empresaJpa.findById(id).get();
    }

    public List<EmpresaModels> listar() {
        return this.empresaJpa.findAll();
    }

    public EmpresaModels cadastrar(EmpresaModels empresaModels) {
       return this.empresaJpa.save(empresaModels);
    }

    public void atualizar(EmpresaModels empresaModels) {
        this.empresaJpa.save(empresaModels);
    }

    public void deletar(int id) {
        this.empresaJpa.deleteById(id);
    }

     public ResponseEntity<?> login(EmpresaModels empresaModels){
        EmpresaModels empresa = empresaJpa.findByEmail(empresaModels.getEmail());

        if(empresa == null){
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Email ou senha incorretos.");
        }

        if(!empresa.getSenha().equals(empresaModels.getSenha())){
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Email ou senha incorretos.");
        }

        return ResponseEntity.ok(empresa);

    }


}
