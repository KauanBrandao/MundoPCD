package com.projeto.mundopcd.controllers;

import com.projeto.mundopcd.facade.InscricaoCursoFacade;
import com.projeto.mundopcd.models.InscricaoCurso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inscricoes-cursos")
public class InscricaoCursoController {

    @Autowired
    private InscricaoCursoFacade facade;

    @GetMapping("/listar")
    public List<InscricaoCurso> listar() {
        return facade.listar();
    }

    @GetMapping("/{id}")
    public InscricaoCurso buscarPorId(@PathVariable int id) {
        return facade.buscarPorId(id);
    }

    @PostMapping("/cadastrar")
    public InscricaoCurso cadastrar(@RequestBody InscricaoCurso inscricao) {
        return facade.cadastrar(inscricao);
    }

    @PutMapping("/atualizar/{id}")
    public void atualizar(@PathVariable int id, @RequestBody InscricaoCurso inscricao) {
        inscricao.setIdInscricaoCurso(id);
        facade.atualizar(inscricao, id);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletar(@PathVariable int id) {
        facade.deletar(id);
    }
}