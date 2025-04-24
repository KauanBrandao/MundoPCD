package com.projeto.mundopcd.controllers;

import com.projeto.mundopcd.facade.EnderecoEmpresaFacade;
import com.projeto.mundopcd.models.EnderecoEmpresaModels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enderecos-empresas")
public class EnderecoEmpresaController {

    private EnderecoEmpresaFacade enderecoEmpresaFacade;

    @Autowired
    public EnderecoEmpresaController(EnderecoEmpresaFacade enderecoEmpresaFacade){
        this.enderecoEmpresaFacade = enderecoEmpresaFacade;
    }

    @GetMapping("/listar")
    public List listar(){
        return enderecoEmpresaFacade.listar();
    }

    @DeleteMapping("/deletar/{id}")
    public void deletar(@PathVariable int id){
        enderecoEmpresaFacade.deletar(id);
    }

    @PostMapping("/cadastrar")
    public EnderecoEmpresaModels cadastrar(@RequestBody EnderecoEmpresaModels enderecoEmpresaModels){
        return enderecoEmpresaFacade.cadastrar(enderecoEmpresaModels);
    }

    @PutMapping("/atualizar")
    public void atualizar(@RequestBody EnderecoEmpresaModels enderecoEmpresaModels){
        enderecoEmpresaFacade.atualizar(enderecoEmpresaModels);
    }

}
