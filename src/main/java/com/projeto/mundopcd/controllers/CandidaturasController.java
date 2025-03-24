package com.projeto.mundopcd.controllers;

import com.projeto.mundopcd.facade.CandidaturasFacade;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/candidaturas")
public class CandidaturasController {

    private CandidaturasFacade candidaturasFacade;

    public CandidaturasController(CandidaturasFacade candidaturasFacade) {
        this.candidaturasFacade = candidaturasFacade;
    }

    @GetMapping("/listar")
    public List listar(){
        return candidaturasFacade.listar();
    }
}
