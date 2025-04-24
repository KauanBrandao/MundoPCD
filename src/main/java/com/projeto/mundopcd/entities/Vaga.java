package com.projeto.mundopcd.entities;

import com.projeto.mundopcd.models.CandidaturaModels;
import com.projeto.mundopcd.models.EmpresaModels;
import com.projeto.mundopcd.models.VagaModels;

import java.util.List;

public class Vaga {
    private int idVaga;
    private String titulo;
    private String descricao;
    private String requisitos;
    private double salario;
    private String tipoContratacao;
    private String localizacao;
    private EmpresaModels empresaModels;
    private Integer idEmpresa;
    private List<CandidaturaModels> candidaturaModels;

    public Vaga(int idVaga, String titulo, String descricao, String requisitos, double salario, String tipoContratacao, String localizacao, EmpresaModels empresaModels, Integer idEmpresa, List<CandidaturaModels> candidaturaModels) {
        this.idVaga = idVaga;
        this.titulo = titulo;
        this.descricao = descricao;
        this.requisitos = requisitos;
        this.salario = salario;
        this.tipoContratacao = tipoContratacao;
        this.localizacao = localizacao;
        this.empresaModels = empresaModels;
        this.idEmpresa = idEmpresa;
        this.candidaturaModels = candidaturaModels;

    }

    public Vaga() {
    }

    public static Vaga toVaga(VagaModels vagaModels) {
        Vaga vaga = new Vaga();
        vaga.setIdVaga(vagaModels.getIdVaga());
        vaga.setTitulo(vagaModels.getTitulo());
        vaga.setDescricao(vagaModels.getDescricao());
        vaga.setRequisitos(vagaModels.getRequisitos());
        vaga.setSalario(vagaModels.getSalario());
        vaga.setTipoContratacao(vagaModels.getTipoContratacao());
        vaga.setLocalizacao(vagaModels.getLocalizacao());
        vaga.setIdEmpresa(vagaModels.getIdEmpresa());
        vaga.setCandidaturaModels(vagaModels.getCandidaturaModels());
        return vaga;
    }

    public void executarValidacoes() {
        tituloIsInvalid();
        descricaoIsInvalid();
        requisitosIsInvalid();
        salarioIsNotPositive();
        tipoContratacaoIsInvalid();
        localizacaoIsInvalid();
        empresaIsNull();
    }

    public void idVagaIsInvalid() {
        if (idVaga <= 0) {
            throw new IllegalArgumentException("O ID da vaga deve ser maior que zero.");
        }
    }

    public void tituloIsInvalid() {
        if (titulo == null || titulo.trim().isEmpty() || titulo.length() < 3 || titulo.length() > 100) {
            throw new IllegalArgumentException("O título deve ter entre 3 e 100 caracteres.");
        }
    }

    public void descricaoIsInvalid() {
        if (descricao == null || descricao.trim().isEmpty() || descricao.length() < 10 || descricao.length() > 1000) {
            throw new IllegalArgumentException("A descrição deve ter entre 10 e 1000 caracteres.");
        }
    }

    public void requisitosIsInvalid() {
        if (requisitos == null || requisitos.trim().isEmpty() || requisitos.length() < 5 || requisitos.length() > 500) {
            throw new IllegalArgumentException("Os requisitos devem ter entre 5 e 500 caracteres.");
        }
    }

    public void salarioIsNotPositive() {
        if (salario <= 0) {
            throw new IllegalArgumentException("O salário deve ser maior que zero.");
        }
    }

    public void tipoContratacaoIsInvalid() {
        if (tipoContratacao == null || tipoContratacao.trim().isEmpty() || !tipoContratacaoIsValido(tipoContratacao)) {
            throw new IllegalArgumentException("O tipo de contratação é inválido.");
        }
    }

    public boolean tipoContratacaoIsValido(String tipoContratacao) {
        return tipoContratacao.equalsIgnoreCase("CLT") ||
                tipoContratacao.equalsIgnoreCase("PJ") ||
                tipoContratacao.equalsIgnoreCase("Freelancer");
    }

    public void empresaIsNull() {
        if (empresaModels == null) {
            throw new IllegalArgumentException("A empresa associada deve ser válida.");
        }
    }

    public void localizacaoIsInvalid() {
        if (localizacao == null || localizacao.trim().isEmpty()) {
            throw new IllegalArgumentException("A localização é obrigatória.");
        }
    }

    public int getIdVaga() {
        return idVaga;
    }

    public void setIdVaga(int idVaga) {
        this.idVaga = idVaga;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTipoContratacao() {
        return tipoContratacao;
    }

    public void setTipoContratacao(String tipoContratacao) {
        this.tipoContratacao = tipoContratacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public EmpresaModels getEmpresaModels() {
        return empresaModels;
    }

    public void setEmpresaModels(EmpresaModels empresaModels) {
        this.empresaModels = empresaModels;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public List<CandidaturaModels> getCandidaturaModels() {
        return candidaturaModels;
    }

    public void setCandidaturaModels(List<CandidaturaModels> candidaturaModels) {
        this.candidaturaModels = candidaturaModels;
    }
}