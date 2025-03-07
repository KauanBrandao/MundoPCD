package com.projeto.mundopcd.models;

public class EnderecoEmpresa {

    private int idEnderecoEmpresa;
    private String lagradouro;
    private String numero;
    private String cidade;
    private String estado;
    private String cep;

    public EnderecoEmpresa(int idEnderecoEmpresa, String lagradouro, String numero, String cidade, String estado, String cep) {
        this.idEnderecoEmpresa = idEnderecoEmpresa;
        this.lagradouro = lagradouro;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    public int getIdEnderecoEmpresa() {
        return idEnderecoEmpresa;
    }

    public void setIdEnderecoEmpresa(int idEnderecoEmpresa) {
        this.idEnderecoEmpresa = idEnderecoEmpresa;
    }

    public String getLagradouro() {
        return lagradouro;
    }

    public void setLagradouro(String lagradouro) {
        this.lagradouro = lagradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
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
