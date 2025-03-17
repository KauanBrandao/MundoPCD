package com.projeto.mundopcd.controllers;

import com.projeto.mundopcd.facade.InscricoesCursosFacade;
import com.projeto.mundopcd.models.InscricoesCursos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inscricoes-cursos")
public class InscricoesCursosController {

    @Autowired
    private InscricoesCursosFacade facade;

    @GetMapping
    public List<InscricoesCursos> listar() {
        return facade.listar();
    }

    @GetMapping("/{id}")
    public InscricoesCursos buscarPorId(@PathVariable int id) {
        return facade.buscarPorId(id);
    }

    @PostMapping("/cadastrar")
    public InscricoesCursos cadastrar(@RequestBody InscricoesCursos inscricao) {
        return facade.cadastrar(inscricao);
    }

    @PutMapping("/atualizar/{id}")
    public void atualizar(@PathVariable int id, @RequestBody InscricoesCursos inscricao) {
        inscricao.setIdInscricaoCurso(id);
        facade.atualizar(inscricao, id);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletar(@PathVariable int id) {
        facade.deletar(id);
    }
}