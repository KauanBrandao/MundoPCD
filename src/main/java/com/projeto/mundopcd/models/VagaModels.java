package com.projeto.mundopcd.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "vagas")
public class VagaModels {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vaga")
    private int idVaga;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "requisitos")
    private String requisitos;

    @Column(name = "salario")
    private double salario;

    @Column(name = "tipo_contratacao")
    private String tipoContratacao;

    @Column(name = "localizacao")
    private String localizacao;

    @ManyToOne
    @JoinColumn(name = "id_empresa", referencedColumnName = "id_empresa", insertable = false, updatable = false)
    private EmpresaModels empresaModels;

    @Column(name = "id_empresa")
    private Integer idEmpresa;

    @OneToMany(mappedBy = "vaga")
    private List<CandidaturaModels> candidaturaModels;

    public VagaModels(List<CandidaturaModels> candidaturaModels, String descricao, EmpresaModels empresaModels, String localizacao, String requisitos, double salario, String tipoContratacao, String titulo) {
        this.candidaturaModels = candidaturaModels;
        this.descricao = descricao;
        this.empresaModels = empresaModels;
        this.localizacao = localizacao;
        this.requisitos = requisitos;
        this.salario = salario;
        this.tipoContratacao = tipoContratacao;
        this.titulo = titulo;
    }

    public VagaModels() {
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

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
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

//    public Empresa getEmpresa() {
//        return empresa;
//    }
//
//    public void setEmpresa(Empresa empresa) {
//        this.empresa = empresa;
//    }

//    public List<Candidatura> getCandidaturas() {
//        return candidaturas;
//    }

//    public void setCandidaturas(List<Candidatura> candidaturas) {
//        this.candidaturas = candidaturas;
//    }
}