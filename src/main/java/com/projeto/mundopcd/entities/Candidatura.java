package com.projeto.mundopcd.entities;

import com.projeto.mundopcd.models.CandidatoModels;
import com.projeto.mundopcd.models.CandidaturaModels;
import com.projeto.mundopcd.models.VagaModels;
import java.util.Date;

public class Candidatura {

    private int idCandidatura;
    private CandidatoModels candidato;
    private VagaModels vaga;
    private Integer idVaga;
    private Date dataAplicacao;
    private String status;

    public Candidatura() {
    }

    public static Candidatura toCandidatura(CandidaturaModels candidaturaModels) {
        Candidatura candidatura = new Candidatura();

        candidatura.setIdCandidatura(candidaturaModels.getIdCandidatura());
        candidatura.setCandidato(candidaturaModels.getCandidato());
        candidatura.setVaga(candidaturaModels.getVaga());
        candidatura.setDataAplicacao(candidaturaModels.getDataAplicacao());
        candidatura.setStatus(candidaturaModels.getStatus());
        return candidatura;
    }

    public void validarCandidatura() {
        validarCandidato();
        validarVaga();
        validarIdVaga();
        validarDataAplicacao();
    }

    private void validarCandidato() {
        if (candidato == null) {
            throw new IllegalArgumentException("Candidato não pode ser nulo.");
        }
    }

    private void validarVaga() {
        if (vaga == null) {
            throw new IllegalArgumentException("Vaga não pode ser nula.");
        }
    }

    private void validarIdVaga() {
        if (idVaga == null || idVaga <= 0) {
            throw new IllegalArgumentException("ID da vaga deve ser positivo.");
        }
    }

    private void validarDataAplicacao() {
        if (dataAplicacao == null) {
            throw new IllegalArgumentException("Data de aplicação não pode ser nula.");
        }
        if (dataAplicacao.after(new Date())) {
            throw new IllegalArgumentException("Data de aplicação não pode ser futura.");
        }
    }

    public CandidatoModels getCandidato() {
        return candidato;
    }

    public void setCandidato(CandidatoModels candidatoModels) {
        this.candidato = candidatoModels;
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
        return vaga;
    }

    public void setVaga(VagaModels vagaModels) {
        this.vaga = vagaModels;
    }
}

