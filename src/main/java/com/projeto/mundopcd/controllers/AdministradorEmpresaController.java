/*package com.projeto.mundopcd.controllers;

import com.projeto.mundopcd.facade.AdministradorEmpresaFacade;
import com.projeto.mundopcd.models.AdministradorEmpresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/adiministradorEmpresa")
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
    public AdministradorEmpresa cadastrar(@RequestBody AdministradorEmpresa administradorEmpresa){
        return administradorEmpresaFacade.cadastrar(administradorEmpresa);
    }

    @PutMapping("/atualizar/{id}")
    public void atualizar(@RequestBody AdministradorEmpresa administradorEmpresa, @PathVariable int id){
        administradorEmpresaFacade.atualizar(administradorEmpresa, id);
    }

}


 */