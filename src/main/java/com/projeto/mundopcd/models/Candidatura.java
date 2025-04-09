package com.projeto.mundopcd.models;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "candidaturas")
public class Candidatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_candidatura")
    private int idCandidatura;

    @ManyToOne
    @JoinColumn(name = "id_candidato", referencedColumnName = "id_candidato", insertable = false, updatable = false)
    private Candidato candidato;

    @Column(name = "id_candidato")
    private Integer idCandidato;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_vaga", referencedColumnName = "id_vaga", insertable = false, updatable = false)
    private Vaga vaga;

    @Column(name = "id_vaga")
    private Integer idVaga;

    @Column(name = "data_aplicacao")
    private Date dataAplicacao;

    @Column(name = "sts")
    private String status;

    public Candidatura() {}

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

//    public Candidato getCandidato() {
//        return candidato;
//    }
//
//    public void setCandidato(Candidato candidato) {
//        this.candidato = candidato;
//    }

    public Vaga getVaga() {
        return vaga;
    }

    public void setVaga(Vaga vaga) {
        this.vaga = vaga;
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
