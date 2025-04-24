package com.projeto.mundopcd.controllers;

import com.projeto.mundopcd.facade.PlanoFacade;
import com.projeto.mundopcd.models.PlanoModels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/planos")
public class PlanoController {

    @Autowired
    private PlanoFacade facade;

    @GetMapping("/listar")
    public List<PlanoModels> listar() {
        return facade.listar();
    }

    @GetMapping("/{id}")
    public PlanoModels buscarPorId(@PathVariable int id) {
        return facade.buscarPorId(id);
    }

    @PostMapping("/cadastrar")
    public PlanoModels cadastrar(@RequestBody PlanoModels planoModels) {
        return facade.cadastrar(planoModels);
    }

    @PutMapping("/atualizar")
    public void atualizar(@RequestBody PlanoModels planoModels) {
        facade.atualizar(planoModels);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletar(@PathVariable int id) {
        facade.deletar(id);
    }
}
