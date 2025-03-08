package com.projeto.mundopcd.models;

public class InscricoesCursos {
    private int idInscricaoCurso;
    private String nomeInscricaoCurso;
    private String descricaoInscricaoCurso;

    public InscricoesCursos(int idInscricaoCurso, String nomeInscricaoCurso, String descricaoInscricaoCurso) {
        this.idInscricaoCurso = idInscricaoCurso;
        this.nomeInscricaoCurso = nomeInscricaoCurso;
        this.descricaoInscricaoCurso = descricaoInscricaoCurso;
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
