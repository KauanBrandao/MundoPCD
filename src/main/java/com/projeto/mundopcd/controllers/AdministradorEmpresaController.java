package com.projeto.mundopcd.controllers;

import com.projeto.mundopcd.facade.AdministradorEmpresaFacade;
import com.projeto.mundopcd.models.AdministradorEmpresaModels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/administradores-empresas")
public class AdministradorEmpresaController {

    private AdministradorEmpresaFacade administradorEmpresaFacade;

    @Autowired
    public AdministradorEmpresaController(AdministradorEmpresaFacade administradorEmpresaFacade){
        this.administradorEmpresaFacade = administradorEmpresaFacade;
    }

    @GetMapping("/listar")
    public List listar(){
        return administradorEmpresaFacade.listar();
    }

    @DeleteMapping("/deletar/{id}")
    public void deletar(@PathVariable int id){
        administradorEmpresaFacade.deletar(id);
    }

    @PostMapping("/cadastrar")
    public AdministradorEmpresaModels cadastrar(@RequestBody AdministradorEmpresaModels administradorEmpresaModels){
        return administradorEmpresaFacade.cadastrar(administradorEmpresaModels);
    }

    @PutMapping("/atualizar")
    public void atualizar(@RequestBody AdministradorEmpresaModels administradorEmpresaModels){
        administradorEmpresaFacade.atualizar(administradorEmpresaModels);
    }

}