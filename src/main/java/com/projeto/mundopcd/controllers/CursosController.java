package com.projeto.mundopcd.controllers;

import com.projeto.mundopcd.facade.CursosFacade;
import com.projeto.mundopcd.models.Cursos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursosController {

    private CursosFacade cursosFacade;

    @Autowired
    public CursosController(CursosFacade cursosFacade) {
        this.cursosFacade = cursosFacade;
    }

    @GetMapping
    public List listar(){
        return cursosFacade.listar();
    }

    @GetMapping("/buscar/{id}")
    public Object buscarPorId(@PathVariable int id){
        return cursosFacade.buscarPorId(id);
    }

    @PostMapping("/cadastrar")
    public Object cadastrar(@RequestBody Cursos curso){
        return cursosFacade.cadastrar(curso);
    }

    @PutMapping("/atualizar/{id}")
    public void atualizar(@RequestBody Cursos curso, @PathVariable int id){
        cursosFacade.atualizar(curso, id);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletar(@PathVariable int id){
        cursosFacade.deletar(id);
    }


}
