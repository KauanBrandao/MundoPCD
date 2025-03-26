package com.projeto.mundopcd.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "planos")
public class Planos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_plano")
    private int idPlano;

    @Column(name = "nome_plano")
    private String nomePlano;

    @OneToMany(mappedBy = "plano")
    private List<Empresas> empresas;

    @OneToMany(mappedBy = "plano")
    private List<Candidatos> candidatos;


    public Planos(String nomePlano) {
        this.nomePlano = nomePlano;
    }

    public Planos() {}

    public int getIdPlano() {
        return idPlano;
    }

    public void setIdPlano(int idPlano) {
        this.idPlano = idPlano;
    }


    public List<Candidatos> getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(List<Candidatos> candidatos) {
        this.candidatos = candidatos;
    }

    public List<Empresas> getEmpresas() {
        return empresas;
    }

    public void setEmpresas(List<Empresas> empresas) {
        this.empresas = empresas;
    }

    public String getNomePlano() {
        return nomePlano;
    }

    public void setNomePlano(String nomePlano) {
        this.nomePlano = nomePlano;
    }


}
