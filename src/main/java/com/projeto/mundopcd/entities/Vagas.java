package com.projeto.mundopcd.entities;

import com.projeto.mundopcd.models.Candidatura;
import com.projeto.mundopcd.models.EmpresaModels;

import java.util.List;

public class Vagas {
    private int idVaga;
    private String titulo;
    private String descricao;
    private String requisitos;
    private double salario;
    private String tipoContratacao;
    private String localizacao;
    private EmpresaModels empresaModels;
    private Integer idEmpresa;
    private List<Candidatura> candidaturas;

    public Vagas(int idVaga, String titulo, String descricao, String requisitos, double salario, String tipoContratacao, String localizacao, EmpresaModels empresaModels, Integer idEmpresa, List<Candidatura> candidaturas) {
        this.idVaga = idVaga;
        this.titulo = titulo;
        this.descricao = descricao;
        this.requisitos = requisitos;
        this.salario = salario;
        this.tipoContratacao = tipoContratacao;
        this.localizacao = localizacao;
        this.empresaModels = empresaModels;
        this.idEmpresa = idEmpresa;
        this.candidaturas = candidaturas;

    }

    public void validar() {
        validarIdVaga();
        validarTitulo();
        validarDescricao();
        validarRequisitos();
        validarSalario();
        validarTipoContratacao();
        validarLocalizacao();
        validarEmpresa();
    }

    private void validarIdVaga() {
        if (idVaga <= 0) {
            throw new IllegalArgumentException("O ID da vaga deve ser maior que zero.");
        }
    }

    private void validarTitulo() {
        if (titulo == null || titulo.trim().isEmpty() || titulo.length() < 3 || titulo.length() > 100) {
            throw new IllegalArgumentException("O título deve ter entre 3 e 100 caracteres.");
        }
    }

    private void validarDescricao() {
        if (descricao == null || descricao.trim().isEmpty() || descricao.length() < 10 || descricao.length() > 1000) {
            throw new IllegalArgumentException("A descrição deve ter entre 10 e 1000 caracteres.");
        }
    }

    private void validarRequisitos() {
        if (requisitos == null || requisitos.trim().isEmpty() || requisitos.length() < 5 || requisitos.length() > 500) {
            throw new IllegalArgumentException("Os requisitos devem ter entre 5 e 500 caracteres.");
        }
    }

    private void validarSalario() {
        if (salario <= 0) {
            throw new IllegalArgumentException("O salário deve ser maior que zero.");
        }
    }

    private void validarTipoContratacao() {
        if (tipoContratacao == null || tipoContratacao.trim().isEmpty() || !isTipoContratacaoValido(tipoContratacao)) {
            throw new IllegalArgumentException("O tipo de contratação é inválido.");
        }
    }

    private boolean isTipoContratacaoValido(String tipoContratacao) {
        return tipoContratacao.equalsIgnoreCase("CLT") ||
                tipoContratacao.equalsIgnoreCase("PJ") ||
                tipoContratacao.equalsIgnoreCase("Freelancer");
    }

    private void validarLocalizacao() {
        if (localizacao == null || localizacao.trim().isEmpty()) {
            throw new IllegalArgumentException("A localização é obrigatória.");
        }
    }

    private void validarEmpresa() {
        if (empresaModels == null) {
            throw new IllegalArgumentException("A empresa associada deve ser válida.");
        }
    }
}