package com.projeto.mundopcd.controllers;

import com.projeto.mundopcd.facade.PlanoFacade;
import com.projeto.mundopcd.models.Planos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/planos")
public class PlanosController {

    @Autowired
    private PlanoFacade facade;

    @GetMapping("/listar")
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
    public void atualizar(@RequestBody Planos planos, @PathVariable int id) {
        facade.atualizar(planos, id);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletar(@PathVariable int id) {
        facade.deletar(id);
    }
}
