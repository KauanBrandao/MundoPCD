package com.projeto.mundopcd.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "planos")
public class Plano {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_plano")
    private int idPlano;

    @Column(name = "nome")
    private String nome;

    @Column(name = "valor")
    private Double valor;

    @Column(name = "tipo")
    private String tipo;

    @OneToMany(mappedBy = "plano", cascade = CascadeType.ALL)
    private List<EmpresaModels> empresaModels;

    @OneToMany(mappedBy = "plano", cascade = CascadeType.ALL)
    private List<Candidato> candidatos;

    public Plano(List<Candidato> candidatos, List<EmpresaModels> empresaModels, String nome, Double valor, String tipo) {
        this.candidatos = candidatos;
        this.empresaModels = empresaModels;
        this.nome = nome;
        this.valor = valor;
        this.tipo = tipo;
    }

    public Plano() {

    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public int getIdPlano() {
        return idPlano;
    }

    public void setIdPlano(int idPlano) {
        this.idPlano = idPlano;
    }

//    public List<Candidato> getCandidatos() {
//        return candidatoes;
//    }
//
//    public void setCandidatos(List<Candidato> candidatoes) {
//        this.candidatoes = candidatoes;
//    }

//    public List<Empresa> getEmpresas() {
//        return empresas;
//    }
//
//    public void setEmpresas(List<Empresa> empresas) {
//        this.empresas = empresas;
//    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
