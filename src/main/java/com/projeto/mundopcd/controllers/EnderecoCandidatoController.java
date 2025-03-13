package com.projeto.mundopcd.controllers;

import com.projeto.mundopcd.facade.EnderecoCandidatoFacade;
import com.projeto.mundopcd.models.EnderecoCandidato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enderecos/candidatos")
public class EnderecoCandidatoController {

    private EnderecoCandidatoFacade enderecoCandidatoFacade;

    @Autowired
    public EnderecoCandidatoController(EnderecoCandidatoFacade enderecoFacade) {
        this.enderecoCandidatoFacade = enderecoCandidatoFacade;
    }

    @GetMapping("/listar")
    public List listar() {
        return enderecoCandidatoFacade.listar();
    }

    @PostMapping("/cadastrar")
    public EnderecoCandidato cadastrar(@RequestBody EnderecoCandidato enderecoCandidato) {
        return enderecoCandidatoFacade.cadastrar(enderecoCandidato);
    }


}
