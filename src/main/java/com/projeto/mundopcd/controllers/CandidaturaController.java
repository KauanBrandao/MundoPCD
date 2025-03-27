package com.projeto.mundopcd.controllers;

import com.projeto.mundopcd.facade.CandidaturaFacade;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/candidaturas")
public class CandidaturaController {

    private CandidaturaFacade candidaturaFacade;

    public CandidaturaController(CandidaturaFacade candidaturaFacade) {
        this.candidaturaFacade = candidaturaFacade;
    }

    @GetMapping("/listar")
    public List listar(){
        return candidaturaFacade.listar();
    }
}
