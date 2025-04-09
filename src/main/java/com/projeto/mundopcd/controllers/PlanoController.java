package com.projeto.mundopcd.controllers;

import com.projeto.mundopcd.facade.PlanoFacade;
import com.projeto.mundopcd.models.Plano;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/planos")
public class PlanoController {

    @Autowired
    private PlanoFacade facade;

    @GetMapping("/listar")
    public List<Plano> listar() {
        return facade.listar();
    }

    @GetMapping("/{id}")
    public Plano buscarPorId(@PathVariable int id) {
        return facade.buscarPorId(id);
    }

    @PostMapping("/cadastrar")
    public Plano cadastrar(@RequestBody Plano plano) {
        return facade.cadastrar(plano);
    }

    @PutMapping("/atualizar")
    public void atualizar(@RequestBody Plano plano) {
        facade.atualizar(plano);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletar(@PathVariable int id) {
        facade.deletar(id);
    }
}
