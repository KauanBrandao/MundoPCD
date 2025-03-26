package com.projeto.mundopcd.models;

import jakarta.persistence.*;

@Entity
@Table(name = "administradores_empresas")
public class AdministradorEmpresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_administrador")
    private int idAdmin;

    @Column(name = "nome_admin")
    private String nomeAdmin;

    @Column(name = "email")
    private String email;

    @Column(name = "senha")
    private String senha;

    // Relacionamento Muitos-para-Um (vários administradores pertencem a uma empresa)
    @ManyToOne
    @JoinColumn(name = "id_empresa", referencedColumnName = "id_empresa")
    private Empresas empresa;

    public AdministradorEmpresa() {}

    public AdministradorEmpresa(String nomeAdmin, String email, String senha, Empresas empresa) {
        this.nomeAdmin = nomeAdmin;
        this.email = email;
        this.senha = senha;
        this.empresa = empresa;
    }

    // Getters e Setters
    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getNomeAdmin() {
        return nomeAdmin;
    }

    public void setNomeAdmin(String nomeAdmin) {
        this.nomeAdmin = nomeAdmin;
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

    public Empresas getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresas empresa) {
        this.empresa = empresa;
    }
}
