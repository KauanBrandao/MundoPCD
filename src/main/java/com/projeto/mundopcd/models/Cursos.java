package com.projeto.mundopcd.models;

public class Cursos {
    private int idCurso;
    private String titulo;
    private String descricao;
    private int cargaHoraria;
    private int idEmpresa;

    public Cursos(int cargaHoraria, String descricao, int idCurso, int idEmpresa, String titulo) {
        this.cargaHoraria = cargaHoraria;
        this.descricao = descricao;
        this.idCurso = idCurso;
        this.idEmpresa = idEmpresa;
        this.titulo = titulo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
