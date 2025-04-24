package com.projeto.mundopcd.models;

import jakarta.persistence.*;

@Entity
@Table(name = "inscricoes_cursos")
public class InscricaoCursoModels {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_inscricao_curso")
    private int idInscricaoCurso;

    @ManyToOne
    @JoinColumn(name = "id_curso", referencedColumnName = "id_curso", insertable = false, updatable = false)
    private CursoModels curso;

    @Column(name = "id_curso")
    private Integer idCurso;

    @ManyToOne
    @JoinColumn(name = "id_candidato", referencedColumnName = "id_candidato", insertable = false, updatable = false)
    private CandidatoModels candidato;

    @Column(name = "id_candidato")
    private Integer idCandidato;

    @Column(name = "status")
    private String status;

    @Column(name = "data_inscricao")
    private java.time.LocalDate dataInscricao;

    public InscricaoCursoModels() {}

    // Getters e Setters
    public int getIdInscricaoCurso() {
        return idInscricaoCurso;
    }

    public void setIdInscricaoCurso(int idInscricaoCurso) {
        this.idInscricaoCurso = idInscricaoCurso;
    }

    public CursoModels getCurso() {
        return curso;
    }

    public void setCurso(CursoModels curso) {
        this.curso = curso;
    }

    public Integer getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Integer idCurso) {
        this.idCurso = idCurso;
    }

    public CandidatoModels getCandidato() {
        return candidato;
    }

    public void setCandidato(CandidatoModels candidato) {
        this.candidato = candidato;
    }

    public Integer getIdCandidato() {
        return idCandidato;
    }

    public void setIdCandidato(Integer idCandidato) {
        this.idCandidato = idCandidato;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public java.time.LocalDate getDataInscricao() {
        return dataInscricao;
    }

    public void setDataInscricao(java.time.LocalDate dataInscricao) {
        this.dataInscricao = dataInscricao;
    }
}
