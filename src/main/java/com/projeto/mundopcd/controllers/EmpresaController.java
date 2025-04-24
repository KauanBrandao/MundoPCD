package com.projeto.mundopcd.controllers;

import com.projeto.mundopcd.facade.EmpresaFacade;
import com.projeto.mundopcd.models.EmpresaModels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empresas")
public class EmpresaController {

    private EmpresaFacade empresaFacade;

    @Autowired
    public EmpresaController(EmpresaFacade empresaFacade) {
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
    public EmpresaModels cadastrar(@RequestBody EmpresaModels empresaModels) {
        return empresaFacade.cadastrar(empresaModels);
    }

    @PutMapping("/atualizar")
    public void atualizar (@RequestBody EmpresaModels empresaModels) {
        empresaFacade.atualizar(empresaModels);
    }
}
