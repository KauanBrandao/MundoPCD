package com.projeto.mundopcd.models;

import jakarta.persistence.*;

@Entity
@Table(name = "administradores_empresas")
public class AdministradorEmpresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_administrador")
    private int idAdmin;

    @Column(name = "nome")
    private String nome;

    @Column(name = "email")
    private String email;

    @Column(name = "senha")
    private String senha;

    @ManyToOne
    @JoinColumn(name = "id_empresa", referencedColumnName = "id_empresa", insertable = false, updatable = false)
    private EmpresaModels empresaModels;

    @Column(name = "id_empresa")
    private Integer idEmpresa;

    public AdministradorEmpresa() {}

    public AdministradorEmpresa(String nome, String email, String senha, EmpresaModels empresaModels) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.empresaModels = empresaModels;
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

//    public Empresa getEmpresa() {
//        return empresa;
//    }
//
//    public void setEmpresa(Empresa empresa) {
//        this.empresa = empresa;
//    }
}
