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
    private CursoModels cursoModels;

    @Column(name = "id_curso")
    private Integer idCurso;

    @ManyToOne
    @JoinColumn(name = "id_candidato", referencedColumnName = "id_candidato", insertable = false, updatable = false)
    private CandidatoModels candidatoModels;

    @Column(name = "id_candidato")
    private Integer idCandidato;

    public InscricaoCursoModels() {

    }

    public CursoModels getCurso() {
        return cursoModels;
    }

    public void setCurso(CursoModels cursoModels) {
        this.cursoModels = cursoModels;
    }

    public CandidatoModels getCandidato() {
        return candidatoModels;
    }

    public void setIdCandidato(Integer idCandidato) {
        this.idCandidato = idCandidato;
    }

    public void setIdCurso(Integer idCurso) {
        this.idCurso = idCurso;
    }

    public void setCandidato(CandidatoModels candidatoModels) {
        this.candidatoModels = candidatoModels;
    }

    public int getIdInscricaoCurso() {
        return idInscricaoCurso;
    }

    public void setIdInscricaoCurso(int idInscricaoCurso) {
        this.idInscricaoCurso = idInscricaoCurso;
    }
}