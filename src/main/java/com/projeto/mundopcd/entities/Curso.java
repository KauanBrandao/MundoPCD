package com.projeto.mundopcd.entities;

import com.projeto.mundopcd.models.EmpresaCursoModels;
import com.projeto.mundopcd.models.InscricaoCursoModels;
import java.util.List;

public class Curso {
    private int idCurso;
    private String titulo;
    private String descricao;
    private int cargaHoraria;
    private List<EmpresaCursoModels> empresaCurso;
    private List<InscricaoCursoModels> inscricoesCursos;

    public Curso() {
    }

//    public void validar(){
//        validarTitulo();
//        validarDescricao();
//        validarCargaHoraria();
//        validarEmpresaCursos();
//    }

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

    public List<EmpresaCursoModels> getEmpresaCurso() {
        return empresaCurso;
    }

    public void setEmpresaCursos(List<EmpresaCursoModels> empresaCurso) {
        this.empresaCurso = empresaCurso;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public List<InscricaoCursoModels> getInscricoesCursos() {
        return inscricoesCursos;
    }

    public void setInscricoesCursos(List<InscricaoCursoModels> inscricoesCursos) {
        this.inscricoesCursos = inscricoesCursos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void validarCargaHoraria() {
        if (cargaHoraria <= 0) {
            throw new IllegalArgumentException("A carga horária deve ser maior que 0.");
        }
    }

    public void validarDescricao() {
        if (descricao == null || descricao.trim().isEmpty() || descricao.length() < 20 || descricao.length() > 500) {
            throw new IllegalArgumentException("A descrição deve ter entre 20 e 500 caracteres.");
        }
    }

    public void validarEmpresaCursos() {
        if (empresaCurso == null || empresaCurso.isEmpty()) {
            throw new IllegalArgumentException("O curso deve estar associado a pelo menos uma empresa.");
        }
        long distinctCount = empresaCurso.stream().distinct().count();
        if (distinctCount < empresaCurso.size()) {
            throw new IllegalArgumentException("Cada empresa pode ser associada apenas uma vez ao curso.");
        }
    }

    public void validarTitulo() {
        if (titulo == null || titulo.trim().isEmpty() || titulo.length() > 100) {
            throw new IllegalArgumentException("O título é obrigatório e deve ter no máximo 100 caracteres.");
        }
    }

}