package com.projeto.mundopcd.controllers;

import com.projeto.mundopcd.application.PlanoApplication;
import com.projeto.mundopcd.models.Plano;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/planos")
public class PlanoController {

    @Autowired
    private PlanoApplication application;

    @GetMapping
    public List<Plano> listar() {
        return application.listar();
    }

    @GetMapping("/{id}")
    public Plano buscarPorId(@PathVariable int id) {
        return application.buscarPorId(id);
    }

    @PostMapping
    public Plano cadastrar(@RequestBody Plano plano) {
        return application.cadastrar(plano);
    }

    @PutMapping("/{id}")
    public void atualizar(@PathVariable int id, @RequestBody Plano plano) {
        plano.setIdPlano(id);
        application.atualizar(plano);
    }

    @DeleteMapping("/{id}")
    public String deletar(@PathVariable int id) {
        return application.deletar(id);
    }
}