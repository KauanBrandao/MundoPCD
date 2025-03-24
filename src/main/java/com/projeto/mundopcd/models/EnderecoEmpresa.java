package com.projeto.mundopcd.models;


import jakarta.persistence.*;

@Entity
@Table(name = "enderecos_empresas")
public class EnderecoEmpresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_endereco_empresa")
    private int idEnderecoEmpresa;

    @Column(name = "logradouro")
    private String logradouro;

    @Column(name = "numero")
    private String numero;

    @Column(name = "cidade")
    private String cidade;

    @Column(name = "estado")
    private String estado;

    @Column(name = "cep")
    private String cep;

    public EnderecoEmpresa(int idEnderecoEmpresa, String logradouro, String numero, String cidade, String estado, String cep) {
        this.idEnderecoEmpresa = idEnderecoEmpresa;
        this.logradouro = logradouro;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    public EnderecoEmpresa() {

    }

    public int getIdEnderecoEmpresa() {
        return idEnderecoEmpresa;
    }

    public void setIdEnderecoEmpresa(int idEnderecoEmpresa) {
        this.idEnderecoEmpresa = idEnderecoEmpresa;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLagradouro(String lagradouro) {
        this.logradouro = lagradouro;
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
