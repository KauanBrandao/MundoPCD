package com.projeto.mundopcd.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "inscricoes_cursos")
public class InscricaoCurso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_inscricao_curso")
    private int idInscricaoCurso;

    @ManyToOne
    @JoinColumn(name = "id_curso", referencedColumnName = "id_curso")
    private Curso curso;

    @ManyToOne
    @JoinColumn(name = "id_candidato", referencedColumnName = "id_candidato")
    private Candidato candidato;

    @OneToMany(mappedBy = "inscricaoCurso")
    private List<Plano> planos;

    public InscricaoCurso() {}

    public InscricaoCurso(Candidato candidato, Curso curso) {
        this.candidato = candidato;
        this.curso = curso;
    }

    public int getIdInscricaoCurso() {
        return idInscricaoCurso;
    }

    public void setIdInscricaoCurso(int idInscricaoCurso) {
        this.idInscricaoCurso = idInscricaoCurso;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public List<Plano> getPlanos() {
        return planos;
    }

    public void setPlanos(List<Plano> planos) {
        this.planos = planos;
    }
}