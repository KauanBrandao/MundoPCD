package com.projeto.mundopcd.models;


import jakarta.persistence.*;

@Entity
@Table(name = "vagas")
public class Vagas {
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
    @JoinColumn(name = "id_empresa", referencedColumnName = "id_empresa")
    private Empresas empresa;

    public Vagas() {
    }

    public Vagas(String titulo, String descricao, String requisitos, double salario,
                String tipoContratacao, String localizacao, Empresas empresa) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.requisitos = requisitos;
        this.salario = salario;
        this.tipoContratacao = tipoContratacao;
        this.localizacao = localizacao;
        this.empresa = empresa;
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

    public Empresas getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresas empresa) {
        this.empresa = empresa;
    }
}
