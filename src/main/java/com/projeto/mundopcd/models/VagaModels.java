package com.projeto.mundopcd.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @Column(name = "modalidade")
    private String modalidade;

    @ManyToOne
    @JoinColumn(name = "id_empresa", referencedColumnName = "id_empresa", insertable = false, updatable = false)
    private EmpresaModels empresa;

    @Column(name = "id_empresa")
    private Integer idEmpresa;

    @OneToMany(mappedBy = "vaga")
    private List<CandidaturaModels> candidatura;

    public VagaModels(List<CandidaturaModels> candidatura, String descricao, EmpresaModels empresa, String localizacao, String requisitos, double salario, String tipoContratacao, String titulo) {
        this.candidatura = candidatura;
        this.descricao = descricao;
        this.empresa = empresa;
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

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
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

//    public EmpresaModels getEmpresa() {
//        return empresa;
//    }

    public void setEmpresa(EmpresaModels empresaModels) {
       this.empresa = empresaModels;
   }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public List<CandidaturaModels> getCandidaturaModels() {
        return candidatura;
    }
}