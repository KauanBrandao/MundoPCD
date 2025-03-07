package com.projeto.mundopcd.models;

import java.util.Date;

public class Candidaturas {
    private int idCandidatura;
    private int idCandidato;
    private int idVaga;
    private Date dataAplicacao;
    private String status;

    public Candidaturas(Date dataAplicacao, int idCandidato, int idCandidatura, int idVaga, String status) {
        this.dataAplicacao = dataAplicacao;
        this.idCandidato = idCandidato;
        this.idCandidatura = idCandidatura;
        this.idVaga = idVaga;
        this.status = status;
    }

    public Date getDataAplicacao() {
        return dataAplicacao;
    }

    public void setDataAplicacao(Date dataAplicacao) {
        this.dataAplicacao = dataAplicacao;
    }

    public int getIdCandidato() {
        return idCandidato;
    }

    public void setIdCandidato(int idCandidato) {
        this.idCandidato = idCandidato;
    }

    public int getIdCandidatura() {
        return idCandidatura;
    }

    public void setIdCandidatura(int idCandidatura) {
        this.idCandidatura = idCandidatura;
    }

    public int getIdVaga() {
        return idVaga;
    }

    public void setIdVaga(int idVaga) {
        this.idVaga = idVaga;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
