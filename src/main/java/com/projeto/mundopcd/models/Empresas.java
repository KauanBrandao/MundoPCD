package com.projeto.mundopcd.models;

import jakarta.persistence.*;
import java.util.List;

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

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_plano", referencedColumnName = "id_plano")
    private Planos plano;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_empresa", referencedColumnName = "id_empresa")
    private EnderecoEmpresa enderecoEmpresa;


    // Relacionamento One-to-Many: Uma empresa pode ter vários administradores
    @OneToMany(mappedBy = "empresa", cascade = CascadeType.ALL)
    private List<AdministradorEmpresa> administradores;


    @OneToMany(mappedBy = "empresa", cascade = CascadeType.ALL)
    private List<Vagas> vagas;

    public Empresas() {}

    public Empresas(String nomeEmpresa, String cnpj, String emailContato, String telefoneContato,
                    String setor, String politicaInclusao, Planos plano, EnderecoEmpresa enderecoEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
        this.cnpj = cnpj;
        this.emailContato = emailContato;
        this.telefoneContato = telefoneContato;
        this.setor = setor;
        this.politicaInclusao = politicaInclusao;
        this.plano = plano;
        this.enderecoEmpresa = enderecoEmpresa;
    }

    // Getters e Setters

    public List<Vagas> getVagas() {
        return vagas;
    }



    public void setVagas(List<Vagas> vagas) {
        this.vagas = vagas;
    }


    public int getIdEmpresa() {
        return idEmpresa;
    }


    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
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

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getPoliticaInclusao() {
        return politicaInclusao;
    }

    public void setPoliticaInclusao(String politicaInclusao) {
        this.politicaInclusao = politicaInclusao;
    }

    public Planos getPlano() {
        return plano;
    }

    public void setPlano(Planos plano) {
        this.plano = plano;
    }

    public EnderecoEmpresa getEnderecoEmpresa() {
        return enderecoEmpresa;
    }

    public void setEnderecoEmpresa(EnderecoEmpresa enderecoEmpresa) {
        this.enderecoEmpresa = enderecoEmpresa;
    }

    public List<AdministradorEmpresa> getAdministradores() {
        return administradores;
    }

    public void setAdministradores(List<AdministradorEmpresa> administradores) {
        this.administradores = administradores;
    }
}
