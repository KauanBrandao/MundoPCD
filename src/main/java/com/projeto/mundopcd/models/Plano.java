package com.projeto.mundopcd.models;

public class Plano {
    private int idPlano;
    private int idCandidatura;
    private int idCandidato;
    private String nomePlano;
    private String nomeCandidatura;
    private String nomeCandidato;

    public Plano(int idPlano, int idCandidatura, int idCandidato, String nomePlano, String nomeCandidatura, String nomeCandidato) {
        this.idPlano = idPlano;
        this.idCandidatura = idCandidatura;
        this.idCandidato = idCandidato;
        this.nomePlano = nomePlano;
        this.nomeCandidatura = nomeCandidatura;
        this.nomeCandidato = nomeCandidato;
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
