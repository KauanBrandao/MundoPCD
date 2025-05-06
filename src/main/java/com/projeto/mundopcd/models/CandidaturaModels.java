package com.projeto.mundopcd.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "candidaturas")
public class CandidaturaModels {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_candidatura")
    private int idCandidatura;

    @ManyToOne
    @JoinColumn(name = "id_candidato", referencedColumnName = "id_candidato", insertable = false, updatable = false)
    private CandidatoModels candidato;

    @Column(name = "id_candidato")
    private Integer idCandidato;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_vaga", referencedColumnName = "id_vaga", insertable = false, updatable = false)
    private VagaModels vaga;

    @Column(name = "id_vaga", nullable = false )
    private Integer idVaga;

    @Column(name = "data_aplicacao")
    private Date dataAplicacao;

    @Column(name = "sts")
    private String status;

    public CandidaturaModels() {}

    public int getIdCandidatura() {
        return idCandidatura;
    }

    public void setIdCandidatura(int idCandidatura) {
        this.idCandidatura = idCandidatura;
    }

    public void setIdVaga(Integer idVaga) {
        this.idVaga = idVaga;
    }

    public void setIdCandidato(Integer idCandidato) {
        this.idCandidato = idCandidato;
    }

//    public CandidatoModels getCandidato() {
//        return candidato;
//    }
//

    @JsonIgnore
    public Integer getIdCandidato() {
        return idCandidato;
    }

//    public void setCandidato(CandidatoModels candidato) {
//        this.candidato = candidato;
//    }

    public VagaModels getVaga() {
        return vaga;
    }

    @JsonIgnore
    public Integer getIdVaga() {
        return idVaga;
    }

    public void setVaga(VagaModels vagaModels) {
        this.vaga = vagaModels;
    }

    public Date getDataAplicacao() {
        return dataAplicacao;
    }

    public void setDataAplicacao(Date dataAplicacao) {
        this.dataAplicacao = dataAplicacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
