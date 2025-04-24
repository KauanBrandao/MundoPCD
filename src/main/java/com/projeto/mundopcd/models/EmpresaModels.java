package com.projeto.mundopcd.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "empresas")
public class EmpresaModels {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empresa")
    private int idEmpresa;

    @Column(name = "nome")
    private String nome;

    @Column(name = "cnpj")
    private String cnpj;

    @Column(name = "email")
    private String email;

    @Column(name = "telefone")
    private String telefone;

    @Column(name = "setor")
    private String setor;

    @Column(name = "politica_inclusao")
    private String politicaInclusao;

    @ManyToOne
    @JoinColumn(name = "id_plano", referencedColumnName = "id_plano", insertable = false, updatable = false)
    private PlanoModels plano;

    @Column(name = "id_plano")
    private Integer idPlano;

    @OneToOne
    @JoinColumn(name = "id_endereco_empresa", referencedColumnName = "id_endereco_empresa", insertable = false, updatable = false)
    private EnderecoEmpresaModels enderecoEmpresa;

    @Column(name = "id_endereco_empresa")
    private Integer idEnderecoEmpresa;

    @OneToMany(mappedBy = "empresa")
    private List<AdministradorEmpresaModels> administradores;

    @OneToMany(mappedBy = "empresa")
    private List<VagaModels> vagas;

    @OneToMany(mappedBy = "empresa", cascade = CascadeType.ALL)
    private List<EmpresaCursoModels> empresaCurso;

    public EmpresaModels() {}

    public List<VagaModels> getVagas() {
        return vagas;
    }

    public void setVagas(List<VagaModels> vagases) {
        this.vagas = vagases;
    }

    public void setIdPlano(Integer idPlano) {
        this.idPlano = idPlano;
    }

    public void setIdEnderecoEmpresa(Integer idEnderecoEmpresa) {
        this.idEnderecoEmpresa = idEnderecoEmpresa;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNome() {
        return nome;
    }

    public void setNomeEmpresa(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
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

    public PlanoModels getPlano() {
        return plano;
    }

    public void setPlano(PlanoModels planoModels) {
        this.plano = planoModels;
    }

    public EnderecoEmpresaModels getEnderecoEmpresa() {
        return enderecoEmpresa;
    }

    public void setEnderecoEmpresa(EnderecoEmpresaModels enderecoEmpresaModels) {
        this.enderecoEmpresa = enderecoEmpresaModels;
    }

    public List<AdministradorEmpresaModels> getAdministradores() {
        return administradores;
    }

    public void setAdministradores(List<AdministradorEmpresaModels> administradores) {
        this.administradores = administradores;
    }
}
