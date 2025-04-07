package com.projeto.mundopcd.controllers;

import com.projeto.mundopcd.facade.CandidatoFacade;
import com.projeto.mundopcd.models.Candidato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/candidatos")
public class CandidatoController {

    private CandidatoFacade candidatoFacade;

    @Autowired
    public CandidatoController(CandidatoFacade candidatoFacade) {
        this.candidatoFacade = candidatoFacade;
    }

    @GetMapping("/listar")
    public List listar(){
        return candidatoFacade.listar();
    }

    @GetMapping("/buscar/{id}")
    public Candidato buscarPorId(@PathVariable int id){
        return candidatoFacade.buscarPorId(id);
    }

    @PostMapping("/cadastrar")
    public Candidato cadastrar(@RequestBody Candidato candidato){
        return candidatoFacade.cadastrar(candidato);
    }

    @PutMapping("/atualizar/{id}")
    public void atualizar(@RequestBody Candidato candidato, @PathVariable int id){
        candidatoFacade.atualizar(candidato, id);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletar(@PathVariable int id){
        candidatoFacade.deletar(id);
    }


}
