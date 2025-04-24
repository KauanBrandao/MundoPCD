package com.projeto.mundopcd.entities;

import com.projeto.mundopcd.models.InscricaoCursoModels;

import java.time.LocalDate;

public class InscricaoCurso {

    private int idInscricao;
    private int idCurso;
    private int id_candidato;
    private String status;
    private LocalDate dataInscricao;

    public InscricaoCurso() {
    }

    public InscricaoCurso(int idInscricao, int idCurso, int id_candidato, String status, LocalDate dataInscricao) {
        this.idInscricao = idInscricao;
        this.idCurso = idCurso;
        this.id_candidato = id_candidato;
        this.status = status;
        this.dataInscricao = dataInscricao;
    }

    public void executarValidacoes() {
        idCursoIsInvalid();
        idUsuarioIsInvalid();
        statusIsInvalid();
        dataInscricaoIsInvalid();
    }

    public static InscricaoCurso toInscricaoCurso(InscricaoCursoModels inscricaoCursoModels) {
        InscricaoCurso inscricaoCurso = new InscricaoCurso();

        inscricaoCurso.setIdInscricao(inscricaoCursoModels.getIdInscricaoCurso());
        inscricaoCurso.setIdCurso(inscricaoCursoModels.getIdCurso());
        inscricaoCurso.setId_candidato(inscricaoCursoModels.getIdCandidato());
        inscricaoCurso.setStatus(inscricaoCursoModels.getStatus());
        inscricaoCurso.setDataInscricao(inscricaoCursoModels.getDataInscricao());
        return inscricaoCurso;
    }

    public void idInscricaoIsInvalid() {
        if (idInscricao <= 0) {
            throw new IllegalArgumentException("O ID da inscrição deve ser maior que zero.");
        }
    }

    public void idCursoIsInvalid() {
        if (idCurso <= 0) {
            throw new IllegalArgumentException("O ID do curso deve ser maior que zero.");
        }
    }

    public void idUsuarioIsInvalid() {
        if (id_candidato <= 0) {
            throw new IllegalArgumentException("O ID do usuário deve ser maior que zero.");
        }
    }

    public void statusIsInvalid() {
        if (status == null || status.trim().isEmpty()) {
            throw new IllegalArgumentException("O status da inscrição é obrigatório.");
        }
    }

    public void dataInscricaoIsInvalid() {
        if (dataInscricao == null || dataInscricao.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("A data de inscrição deve ser válida e não pode ser no futuro.");
        }
    }

    // Getters e Setters
    public int getIdInscricao() {
        return idInscricao;
    }

    public void setIdInscricao(int idInscricao) {
        this.idInscricao = idInscricao;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public int getIdUsuario() {
        return id_candidato;
    }

    public void setId_candidato(int id_candidato) {
        this.id_candidato = id_candidato;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getDataInscricao() {
        return dataInscricao;
    }

    public void setDataInscricao(LocalDate dataInscricao) {
        this.dataInscricao = dataInscricao;
    }
}