package com.projeto.mundopcd.models;

import jakarta.persistence.*;

@Entity
@Table(name = "inscricoes_cursos")
public class InscricaoCurso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_inscricao_curso")
    private int idInscricaoCurso;
    
    @ManyToOne
    @JoinColumn(name = "id_curso", referencedColumnName = "id_curso")  // Chave estrangeira fica aqui
    private Curso curso;

    public InscricaoCurso(Candidato candidato, Curso curso) {
        this.candidato = candidato;
        this.curso = curso;
    }

    @ManyToOne
    @JoinColumn(name = "id_candidato", referencedColumnName = "id_candidato")
    private Candidato candidato;

    public InscricaoCurso() {

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

    public int getIdInscricaoCurso() {
        return idInscricaoCurso;
    }

    public void setIdInscricaoCurso(int id) {
        this.idInscricaoCurso = id;
    }
}

