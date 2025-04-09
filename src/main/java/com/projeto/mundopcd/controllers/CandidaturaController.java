package com.projeto.mundopcd.controllers;

import com.projeto.mundopcd.facade.CandidaturaFacade;
import com.projeto.mundopcd.models.Candidatura;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/candidaturas")
public class CandidaturaController {

    private CandidaturaFacade candidaturaFacade;

    public CandidaturaController(CandidaturaFacade candidaturaFacade) {
        this.candidaturaFacade = candidaturaFacade;
    }

    @GetMapping("/listar")
    public List listar(){
        return candidaturaFacade.listar();
    }

    @GetMapping("/buscar/{id}")
    public Candidatura buscarPorId(@PathVariable int id) {
        return candidaturaFacade.buscarPorId(id);
    }

    @PostMapping("/cadastrar")
    public Candidatura cadastrar(@RequestBody Candidatura candidatura){
        return candidaturaFacade.cadastrar(candidatura);
    }

    @PutMapping("/atualizar")
    public void atualizar(@RequestBody Candidatura candidatura){
        candidaturaFacade.atualizar(candidatura);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletar(@PathVariable int id){
        candidaturaFacade.deletar(id);
    }
}
