package com.projeto.mundopcd.controllers;

import com.projeto.mundopcd.facade.CandidaturaFacade;
import com.projeto.mundopcd.models.CandidaturaModels;
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
    public CandidaturaModels buscarPorId(@PathVariable int id) {
        return candidaturaFacade.buscarPorId(id);
    }

    @PostMapping("/cadastrar")
    public CandidaturaModels cadastrar(@RequestBody CandidaturaModels candidaturaModels){
        return candidaturaFacade.cadastrar(candidaturaModels);
    }

    @PutMapping("/atualizar")
    public void atualizar(@RequestBody CandidaturaModels candidaturaModels){
        candidaturaFacade.atualizar(candidaturaModels);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletar(@PathVariable int id){
        candidaturaFacade.deletar(id);
    }
}
