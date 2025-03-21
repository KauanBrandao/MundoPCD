package com.projeto.mundopcd.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "candidaturas")
public class Candidaturas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_candidatura")
    private int idCandidatura;

    @Column(name = "id_candidato")
    private int idCandidato;

    @Column(name = "id_vaga")
    private int idVaga;

    @Column(name = "data_aplicacao")
    private Date dataAplicacao;

    @Column(name = "status")
    private String status;

    public Candidaturas() {}

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
