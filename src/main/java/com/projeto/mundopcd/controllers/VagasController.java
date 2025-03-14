package com.projeto.mundopcd.controllers;


import com.projeto.mundopcd.facade.VagasFacade;
import com.projeto.mundopcd.models.Vagas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vagas")
public class VagasController {

    private VagasFacade vagasFacade;

    @Autowired
    public void VagasFacade(VagasFacade vagasFacade) {
        this.vagasFacade = vagasFacade;
    }

    @GetMapping("/listar")
    public List listar() {
        return vagasFacade.listar();
    }

    @DeleteMapping("/deletar/{id}")
    public void deletar(@PathVariable int id) {
        vagasFacade.deletar(id);
    }

    @PostMapping("/cadastrar")
    public Vagas cadastrar(@RequestBody Vagas vaga) {
        return vagasFacade.cadastrar(vaga);
    }

    @PutMapping("/atualizar/{id}")
    public void atualizar(@RequestBody Vagas vaga, @PathVariable int id) {
        vagasFacade.atualizar(vaga, id);
    }
}