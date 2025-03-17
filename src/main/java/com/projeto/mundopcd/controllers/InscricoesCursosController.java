package com.projeto.mundopcd.controllers;

import com.projeto.mundopcd.application.InscricoesCursosApplication;
import com.projeto.mundopcd.models.InscricoesCursos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inscricoes-cursos")
public class InscricoesCursosController {

    @Autowired
    private InscricoesCursosApplication application;

    @GetMapping
    public List<InscricoesCursos> listar() {
        return application.listar();
    }

    @GetMapping("/{id}")
    public InscricoesCursos buscarPorId(@PathVariable int id) {
        return application.buscarPorId(id);
    }

    @PostMapping
    public InscricoesCursos cadastrar(@RequestBody InscricoesCursos inscricao) {
        return application.cadastrar(inscricao);
    }

    @PutMapping("/{id}")
    public void atualizar(@PathVariable int id, @RequestBody InscricoesCursos inscricao) {
        inscricao.setIdInscricaoCurso(id);
        application.atualizar(inscricao);
    }

    @DeleteMapping("/{id}")
    public String deletar(@PathVariable int id) {
        return application.deletar(id);
    }
}