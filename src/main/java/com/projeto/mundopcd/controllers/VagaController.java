package com.projeto.mundopcd.controllers;


import com.projeto.mundopcd.facade.VagaFacade;
import com.projeto.mundopcd.models.VagaModels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vagas")
public class VagaController {

    private VagaFacade vagaFacade;

    @Autowired
    public void VagasFacade(VagaFacade vagaFacade) {
        this.vagaFacade = vagaFacade;
    }

    @GetMapping("/listar")
    public List listar() {
        return vagaFacade.listar();
    }

    @DeleteMapping("/deletar/{id}")
    public void deletar(@PathVariable int id) {
        vagaFacade.deletar(id);
    }

    @PostMapping("/cadastrar")
    public VagaModels cadastrar(@RequestBody VagaModels vagaModels) {
        return vagaFacade.cadastrar(vagaModels);
    }

    @PutMapping("/atualizar")
    public void atualizar(@RequestBody VagaModels vagaModels) {
        vagaFacade.atualizar(vagaModels);
    }
}