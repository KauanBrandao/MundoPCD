package com.projeto.mundopcd.models;

import jakarta.persistence.*;

@Entity
@Table(name = "planos")
public class Planos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_plano")
    private int idPlano;

    @Column(name = "id_candidatura")
    private int idCandidatura;

    @Column(name = "id_candidato")
    private int idCandidato;

    @Column(name = "nome_plano")
    private String nomePlano;

    @Column(name = "nome_candidatura")
    private String nomeCandidatura;

    @Column(name = "nome_candidato")
    private String nomeCandidato;

    public Planos(int idPlano, int idCandidatura, int idCandidato, String nomePlano, String nomeCandidatura, String nomeCandidato) {
        this.idPlano = idPlano;
        this.idCandidatura = idCandidatura;
        this.idCandidato = idCandidato;
        this.nomePlano = nomePlano;
        this.nomeCandidatura = nomeCandidatura;
        this.nomeCandidato = nomeCandidato;
    }

    public Planos() {

    }

    public int getIdPlano() {
        return idPlano;
    }

    public void setIdPlano(int idPlano) {
        this.idPlano = idPlano;
    }

    public int getIdCandidatura() {
        return idCandidatura;
    }

    public void setIdCandidatura(int idCandidatura) {
        this.idCandidatura = idCandidatura;
    }

    public int getIdCandidato() {
        return idCandidato;
    }

    public void setIdCandidato(int idCandidato) {
        this.idCandidato = idCandidato;
    }

    public String getNomePlano() {
        return nomePlano;
    }

    public void setNomePlano(String nomePlano) {
        this.nomePlano = nomePlano;
    }

    public String getNomeCandidatura() {
        return nomeCandidatura;
    }

    public void setNomeCandidatura(String nomeCandidatura) {
        this.nomeCandidatura = nomeCandidatura;
    }

    public String getNomeCandidato() {
        return nomeCandidato;
    }

    public void setNomeCandidato(String nomeCandidato) {
        this.nomeCandidato = nomeCandidato;
    }
}
