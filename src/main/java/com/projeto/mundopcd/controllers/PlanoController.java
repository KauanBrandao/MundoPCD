package com.projeto.mundopcd.controllers;

import com.projeto.mundopcd.facade.PlanoFacade;
import com.projeto.mundopcd.models.Planos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/planos")
public class PlanoController {

    @Autowired
    private PlanoFacade facade;

    @GetMapping
    public List<Planos> listar() {
        return facade.listar();
    }

    @GetMapping("/{id}")
    public Planos buscarPorId(@PathVariable int id) {
        return facade.buscarPorId(id);
    }

    @PostMapping("/cadastrar")
    public Planos cadastrar(@RequestBody Planos planos) {
        return facade.cadastrar(planos);
    }

    @PutMapping("/atualizar/{id}")
    public void atualizar(@PathVariable int id, @RequestBody Planos planos) {
        planos.setIdPlano(id);
        facade.atualizar(planos);
    }

    @DeleteMapping("/deletar/{id}")
    public String deletar(@PathVariable int id) {
        return facade.deletar(id);
    }
}