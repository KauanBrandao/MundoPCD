package com.projeto.mundopcd.controllers;

import com.projeto.mundopcd.facade.InscricaoCursoFacade;
import com.projeto.mundopcd.models.InscricaoCursoModels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inscricoes-cursos")
public class InscricaoCursoController {

    @Autowired
    private InscricaoCursoFacade facade;

    @GetMapping("/listar")
    public List<InscricaoCursoModels> listar() {
        return facade.listar();
    }

    @GetMapping("/{id}")
    public InscricaoCursoModels buscarPorId(@PathVariable int id) {
        return facade.buscarPorId(id);
    }

    @PostMapping("/cadastrar")
    public InscricaoCursoModels cadastrar(@RequestBody InscricaoCursoModels inscricao) {
        return facade.cadastrar(inscricao);
    }

    @PutMapping("/atualizar")
    public void atualizar(@RequestBody InscricaoCursoModels inscricao) {
        facade.atualizar(inscricao);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletar(@PathVariable int id) {
        facade.deletar(id);
    }
}