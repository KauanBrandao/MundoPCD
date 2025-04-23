package com.projeto.mundopcd.entities;

import com.projeto.mundopcd.models.CandidatoModels;
import com.projeto.mundopcd.models.VagaModels;
import java.util.Date;

public class Candidatura {

    private int idCandidatura;
    private CandidatoModels candidatoModels;
    private VagaModels vagaModels;
    private Integer idVaga;
    private Date dataAplicacao;
    private String status;

    public Candidatura() {
    }

    public CandidatoModels getCandidato() {
        return candidatoModels;
    }

    public void setCandidato(CandidatoModels candidatoModels) {
        this.candidatoModels = candidatoModels;
    }

    public Date getDataAplicacao() {
        return dataAplicacao;
    }

    public void setDataAplicacao(Date dataAplicacao) {
        this.dataAplicacao = dataAplicacao;
    }

    public int getIdCandidatura() {
        return idCandidatura;
    }

    public void setIdCandidatura(int idCandidatura) {
        this.idCandidatura = idCandidatura;
    }

    public Integer getIdVaga() {
        return idVaga;
    }

    public void setIdVaga(Integer idVaga) {
        this.idVaga = idVaga;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public VagaModels getVaga() {
        return vagaModels;
    }

    public void setVaga(VagaModels vagaModels) {
        this.vagaModels = vagaModels;
    }
}

