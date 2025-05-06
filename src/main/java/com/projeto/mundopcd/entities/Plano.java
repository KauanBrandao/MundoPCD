package com.projeto.mundopcd.entities;

import com.projeto.mundopcd.models.PlanoModels;

public class Plano {

    private int idPlano;
    private String nome;
    private String tipo;
    private double valor;

    public Plano() {
    }

    public Plano(int idPlano, String nome, String tipo, double valor) {
        this.idPlano = idPlano;
        this.nome = nome;
        this.tipo = tipo;
        this.valor = valor;
    }

    public void executarValidacoes() {
        nomeIsInvalid();
        tipoIsInvalid();
        valorIsInvalid();
    }

    public static Plano toPlano(PlanoModels planoModels) {
        Plano plano = new Plano();

        plano.setIdPlano(planoModels.getIdPlano());
        plano.setNome(planoModels.getNome());
        plano.setTipo(planoModels.getTipo());
        plano.setValor(planoModels.getValor());
        return plano;
    }

    public void idPlanoIsInvalid() {
        if (idPlano <= 0) {
            throw new IllegalArgumentException("O ID do plano deve ser maior que zero.");
        }
    }

    public void nomeIsInvalid() {
        if (nome == null || nome.trim().isEmpty() || nome.length() < 3 || nome.length() > 50) {
            throw new IllegalArgumentException("O nome do plano deve ter entre 3 e 50 caracteres.");
        }
    }

    public void tipoIsInvalid() {
        if (tipo == null || tipo.trim().isEmpty() || tipo.length() < 3) {
            throw new IllegalArgumentException("O tipo do plano deve ter no mínimo 3 caracteres.");
        }
    }

    public void valorIsInvalid() {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do plano deve ser maior que zero.");
        }
    }

    // Getters e Setters
    public int getIdPlano() {
        return idPlano;
    }

    public void setIdPlano(int idPlano) {
        this.idPlano = idPlano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}