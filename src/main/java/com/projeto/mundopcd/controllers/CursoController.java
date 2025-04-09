package com.projeto.mundopcd.controllers;

import com.projeto.mundopcd.facade.CursoFacade;
import com.projeto.mundopcd.models.Curso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    private CursoFacade cursoFacade;

    @Autowired
    public CursoController(CursoFacade cursoFacade) {
        this.cursoFacade = cursoFacade;
    }

    @GetMapping("/listar")
    public List listar(){
        return cursoFacade.listar();
    }

    @GetMapping("/buscar/{id}")
    public Object buscarPorId(@PathVariable int id){
        return cursoFacade.buscarPorId(id);
    }

    @PostMapping("/cadastrar")
    public Object cadastrar(@RequestBody Curso curso){
        return cursoFacade.cadastrar(curso);
    }

    @PutMapping("/atualizar")
    public void atualizar(@RequestBody Curso curso){
        cursoFacade.atualizar(curso);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletar(@PathVariable int id){
        cursoFacade.deletar(id);
    }


}
