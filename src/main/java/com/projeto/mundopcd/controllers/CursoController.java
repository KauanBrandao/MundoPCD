package com.projeto.mundopcd.controllers;

import com.projeto.mundopcd.facade.CursoFacade;
import com.projeto.mundopcd.models.CursoModels;
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
    public Object cadastrar(@RequestBody CursoModels cursoModels){
        return cursoFacade.cadastrar(cursoModels);
    }

    @PutMapping("/atualizar")
    public void atualizar(@RequestBody CursoModels cursoModels){
        cursoFacade.atualizar(cursoModels);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletar(@PathVariable int id){
        cursoFacade.deletar(id);
    }


}
