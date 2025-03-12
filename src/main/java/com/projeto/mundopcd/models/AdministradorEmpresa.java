package com.projeto.mundopcd.models;

public class AdministradorEmpresa {

    private int idAdmin;
    private  Empresas idEmpresa;
    private String nomeEmpresa;
    private String email;
    private String senha;

    public AdministradorEmpresa(int idAdmin, Empresas idEmpresa, String nomeEmpresa, String email, String senha) {
        this.idAdmin = idAdmin;
        this.idEmpresa = idEmpresa;
        this.nomeEmpresa = nomeEmpresa;
        this.email = email;
        this.senha = senha;
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public Empresas getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Empresas idEmpresa) {
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
