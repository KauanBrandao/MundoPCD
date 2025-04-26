package com.projeto.mundopcd.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "planos")
public class PlanoModels {
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
    @JsonManagedReference
    private List<EmpresaModels> empresas;

    @OneToMany(mappedBy = "plano", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<CandidatoModels> candidatos;

    public PlanoModels(List<CandidatoModels> candidatos, List<EmpresaModels> empresas, String nome, Double valor, String tipo) {
        this.candidatos = candidatos;
        this.empresas = empresas;
        this.nome = nome;
        this.valor = valor;
        this.tipo = tipo;
    }

    public PlanoModels() {

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

    public List<CandidatoModels> getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(List<CandidatoModels> candidatoes) {
        this.candidatos = candidatoes;
    }

    public List<EmpresaModels> getEmpresas() {
        return empresas;
    }

    public void setEmpresas(List<EmpresaModels> empresas) {
        this.empresas = empresas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
