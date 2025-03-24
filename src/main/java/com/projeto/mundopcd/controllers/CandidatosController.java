package com.projeto.mundopcd.controllers;

import com.projeto.mundopcd.facade.CandidatosFacade;
import com.projeto.mundopcd.models.Candidatos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/candidatos")
public class CandidatosController {

    private CandidatosFacade candidatoFacade;

    @Autowired
    public CandidatosController(CandidatosFacade candidatoFacade) {
        this.candidatoFacade = candidatoFacade;
    }

    @GetMapping("/listar")
    public List listar(){
        return candidatoFacade.listar();
    }

    @GetMapping("/buscar/{id}")
    public Object buscarPorId(@PathVariable int id){
        return candidatoFacade.buscarPorId(id);
    }

    @PostMapping("/cadastrar")
    public Object cadastrar(@RequestBody Candidatos candidato){
        return candidatoFacade.cadastrar(candidato);
    }

    @PutMapping("/atualizar/{id}")
    public void atualizar(@RequestBody Candidatos candidato, @PathVariable int id){
        candidatoFacade.atualizar(candidato, id);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletar(@PathVariable int id){
        candidatoFacade.deletar(id);
    }


}
