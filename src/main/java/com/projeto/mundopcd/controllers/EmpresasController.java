package com.projeto.mundopcd.controllers;

import com.projeto.mundopcd.facade.EmpresasFacade;
import com.projeto.mundopcd.models.Empresas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empresas")
public class EmpresasController {

    private EmpresasFacade empresaFacade;

    @Autowired
    public EmpresasController(EmpresasFacade empresaFacade) {
        this.empresaFacade = empresaFacade;
    }

    @GetMapping("/listar")
    public List listar () {
        return empresaFacade.listar();
    }

    @DeleteMapping("/deletar/{id}")
    public void deletar (@PathVariable int id) {
       empresaFacade.deletar(id);
    }

    @PostMapping("/cadastrar")
    public Empresas cadastrar(@RequestBody Empresas empresa) {
        return empresaFacade.cadastrar(empresa);
    }

    @PutMapping("/atualizar/{id}")
    public void atualizar (@RequestBody Empresas empresa, @PathVariable int id) {
        empresaFacade.atualizar(empresa, id);
    }
}
