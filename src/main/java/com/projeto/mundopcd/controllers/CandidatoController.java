package com.projeto.mundopcd.controllers;

import com.projeto.mundopcd.facade.CandidatoFacade;
import com.projeto.mundopcd.models.CandidatoModels;
import org.springframework.beans.factory.annotation.Autowired;
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
    public CandidatoModels buscarPorId(@PathVariable int id){
        return candidatoFacade.buscarPorId(id);
    }

    @PostMapping("/cadastrar")
    public CandidatoModels cadastrar(@RequestBody CandidatoModels candidatoModels){
        return this.candidatoFacade.cadastrar(candidatoModels);
    }

    @PutMapping("/atualizar")
    public void atualizar(@RequestBody CandidatoModels candidatoModels){
        candidatoFacade.atualizar(candidatoModels);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletar(@PathVariable int id){
        candidatoFacade.deletar(id);
    }
}