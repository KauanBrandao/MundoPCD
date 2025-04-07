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

    // Relacionamento com Candidato (Muitos para Um)
    @ManyToOne
    @JoinColumn(name = "id_candidato", referencedColumnName = "id_candidato")
    @JsonBackReference
    private Candidato candidato;

    // Relacionamento com Vagas (Muitos para Um)
    @ManyToOne
    @JoinColumn(name = "id_vaga", referencedColumnName = "id_vaga")
    private Vaga vaga;

    @Column(name = "data_aplicacao")
    private Date dataAplicacao;

    @Column(name = "sts")
    private String status;

    public Candidatura(Candidato candidato, Date dataAplicacao, String status, Vaga vaga) {
        this.candidato = candidato;
        this.dataAplicacao = dataAplicacao;
        this.status = status;
        this.vaga = vaga;
    }

    public Candidatura() {}

    public int getIdCandidatura() {
        return idCandidatura;
    }

    public void setIdCandidatura(int idCandidatura) {
        this.idCandidatura = idCandidatura;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

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
