package com.projeto.mundopcd.models;

import jakarta.persistence.*;

@Entity
@Table(name = "empresas")
public class Empresas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empresa")
    private int idEmpresa;

    @Column(name = "nome_empresa")
    private String nomeEmpresa;

    @Column(name = "cnpj")
    private String cnpj;

    @Column(name = "email_contato")
    private String emailContato;

    @Column(name = "telefone_contato")
    private String telefoneContato;

    @Column(name = "setor")
    private String setor;

    @Column(name = "politica_inclusao")
    private String politicaInclusao;

    @Column(name = "id_plano")
    private int idPlano;

    @Column(name = "id_endereco_empresa")
    private int idEnderecoEmpresa;

    public Empresas() {
    }

    public Empresas(int idEmpresa, String nomeEmpresa, String cnpj, String emailContato, String telefoneContato,
                    String setor, String politicaInclusao, int idPlano, int idEnderecoEmpresa) {
        this.idEmpresa = idEmpresa;
        this.nomeEmpresa = nomeEmpresa;
        this.cnpj = cnpj;
        this.emailContato = emailContato;
        this.telefoneContato = telefoneContato;
        this.setor = setor;
        this.politicaInclusao = politicaInclusao;
        this.idPlano = idPlano;
        this.idEnderecoEmpresa = idEnderecoEmpresa;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEmailContato() {
        return emailContato;
    }

    public void setEmailContato(String emailContato) {
        this.emailContato = emailContato;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }

    public String getPoliticaInclusao() {
        return politicaInclusao;
    }

    public void setPoliticaInclusao(String politicaInclusao) {
        this.politicaInclusao = politicaInclusao;
    }

    public int getIdPlano() {
        return idPlano;
    }

    public void setIdPlano(int idPlano) {
        this.idPlano = idPlano;
    }

    public int getIdEnderecoEmpresa() {
        return idEnderecoEmpresa;
    }

    public void setIdEnderecoEmpresa(int idEnderecoEmpresa) {
        this.idEnderecoEmpresa = idEnderecoEmpresa;
    }
}

