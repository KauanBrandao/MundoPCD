package com.projeto.mundopcd.models;

import jakarta.persistence.*;

@Entity
@Table(name = "administradores_empresas")
public class AdministradorEmpresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_administrador")
    private int idAdmin;

    @Column(name = "id_empresa")
    private int idEmpresa;

    @Column(name = "nome_empresa")
    private String nomeEmpresa;

    @Column(name = "email")
    private String email;

    @Column(name = "senha")
    private String senha;

    public AdministradorEmpresa(int idAdmin, int idEmpresa, String nomeEmpresa, String email, String senha) {
        this.idAdmin = idAdmin;
        this.idEmpresa = idEmpresa;
        this.nomeEmpresa = nomeEmpresa;
        this.email = email;
        this.senha = senha;
    }

    public AdministradorEmpresa() {

    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
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
}
