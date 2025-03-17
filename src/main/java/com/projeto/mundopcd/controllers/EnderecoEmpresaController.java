package com.projeto.mundopcd.controllers;

import com.projeto.mundopcd.facade.EnderecoEmpresaFacade;
import com.projeto.mundopcd.models.EnderecoEmpresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enderecosEmpresa")
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
    public EnderecoEmpresa cadastrar(@RequestBody EnderecoEmpresa enderecoEmpresa){
        return enderecoEmpresaFacade.cadastrar(enderecoEmpresa);
    }

    @PutMapping("/atualizar/{id}")
    public void atualizar(@RequestBody EnderecoEmpresa enderecoEmpresa, @PathVariable int id){
        enderecoEmpresaFacade.atualizar(enderecoEmpresa, id);
    }

}
