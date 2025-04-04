package com.projeto.mundopcd.models;

import jakarta.persistence.*;

@Entity
@Table(name = "inscricoes_cursos")
public class InscricoesCursos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_inscricao_curso")
    private int idInscricaoCurso;

    @Column(name = "nome_inscricao_curso")
    private String nomeInscricaoCurso;

    @Column(name = "descricao_inscricao_curso")
    private String descricaoInscricaoCurso;

    public InscricoesCursos(int idInscricaoCurso, String nomeInscricaoCurso, String descricaoInscricaoCurso) {
        this.idInscricaoCurso = idInscricaoCurso;
        this.nomeInscricaoCurso = nomeInscricaoCurso;
        this.descricaoInscricaoCurso = descricaoInscricaoCurso;
    }

    public InscricoesCursos() {

    }

    public int getIdInscricaoCurso() {
        return idInscricaoCurso;
    }

    public void setIdInscricaoCurso(int idInscricaoCurso) {
        this.idInscricaoCurso = idInscricaoCurso;
    }

    public String getNomeInscricaoCurso() {
        return nomeInscricaoCurso;
    }

    public void setNomeInscricaoCurso(String nomeInscricaoCurso) {
        this.nomeInscricaoCurso = nomeInscricaoCurso;
    }

    public String getDescricaoInscricaoCurso() {
        return descricaoInscricaoCurso;
    }

    public void setDescricaoInscricaoCurso(String descricaoInscricaoCurso) {
        this.descricaoInscricaoCurso = descricaoInscricaoCurso;
    }
}
