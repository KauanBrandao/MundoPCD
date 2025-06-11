package com.projeto.mundopcd.controllers;

import com.projeto.mundopcd.facade.AdministradorFacade;
import com.projeto.mundopcd.models.AdministradorModels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/administradores-empresas")
public class AdministradorController {

    private AdministradorFacade administradorFacade;

    @Autowired
    public AdministradorController(AdministradorFacade administradorFacade){
        this.administradorFacade = administradorFacade;
    }

    @GetMapping("/listar")
    public List listar(){
        return administradorFacade.listar();
    }

    @DeleteMapping("/deletar/{id}")
    public void deletar(@PathVariable int id){
        administradorFacade.deletar(id);
    }

    @PostMapping("/cadastrar")
    public AdministradorModels cadastrar(@RequestBody AdministradorModels administradorModels){
        return administradorFacade.cadastrar(administradorModels);
    }

    @PutMapping("/atualizar")
    public void atualizar(@RequestBody AdministradorModels administradorModels){
        administradorFacade.atualizar(administradorModels);
    }

}