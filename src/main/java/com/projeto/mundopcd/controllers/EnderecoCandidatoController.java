package com.projeto.mundopcd.controllers;

import com.projeto.mundopcd.facade.EnderecoCandidatoFacade;
import com.projeto.mundopcd.models.EnderecoCandidatoModels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enderecos-candidatos")
@CrossOrigin(origins = "*")
public class EnderecoCandidatoController {

    private EnderecoCandidatoFacade enderecoCandidatoFacade;

    @Autowired
    public EnderecoCandidatoController(EnderecoCandidatoFacade enderecoCandidatoFacade) {
        this.enderecoCandidatoFacade = enderecoCandidatoFacade;
    }

    @GetMapping("/listar")
    public List listar() {
        return enderecoCandidatoFacade.listar();
    }

    @PostMapping("/cadastrar")
    public EnderecoCandidatoModels cadastrar(@RequestBody EnderecoCandidatoModels enderecoCandidatoModels) {
        return enderecoCandidatoFacade.cadastrar(enderecoCandidatoModels);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletar(@PathVariable int id) {
         enderecoCandidatoFacade.deletar(id);
    }

    @PutMapping("/atualizar")
    public void atualizar(@RequestBody EnderecoCandidatoModels enderecoCandidatoModels) {
        enderecoCandidatoFacade.atualizar(enderecoCandidatoModels);
    }

}
