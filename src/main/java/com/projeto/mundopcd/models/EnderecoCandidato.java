package com.projeto.mundopcd.models;

public class EnderecoCandidato {
    private int idEnderecoCandidato;
    private String logradouro;
    private int numero;
    private String cidade;
    private String estado;
    private String cep;

    public EnderecoCandidato() {
    }

    public EnderecoCandidato(int idEnderecoCandidato, String logradouro, int numero, String cidade, String estado, String cep) {
        this.idEnderecoCandidato = idEnderecoCandidato;
        this.logradouro = logradouro;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }


    public int getIdEnderecoCandidato() {
        return idEnderecoCandidato;
    }

    public void setIdEnderecoCandidato(int idEnderecoCandidato) {
        this.idEnderecoCandidato = idEnderecoCandidato;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
