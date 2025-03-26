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

    // uma candidatura pode ter apenas um candidato
    @ManyToOne
    @JoinColumn(name = "id_candidato", referencedColumnName = "id_candidato")
    private Candidatos candidato;

    // uma candidatura pode ter apenas uma vaga
    @ManyToOne
    @JoinColumn(name = "id_vaga", referencedColumnName = "id_vaga")
    private Vagas vaga;

    @Column(name = "data_aplicacao")
    private Date dataAplicacao;

    @Column(name = "sts")
    private String status;

    public Candidaturas() {}

    public Date getDataAplicacao() {
        return dataAplicacao;
    }

    public void setDataAplicacao(Date dataAplicacao) {
        this.dataAplicacao = dataAplicacao;
    }

    public Candidatos getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidatos candidato) {
        this.candidato = candidato;
    }

    public int getIdCandidatura() {
        return idCandidatura;
    }

    public void setIdCandidatura(int idCandidatura) {
        this.idCandidatura = idCandidatura;
    }

    public Vagas getVaga() {
        return vaga;
    }

    public void setVaga(Vagas vaga) {
        this.vaga = vaga;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
