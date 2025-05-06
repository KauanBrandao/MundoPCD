package com.projeto.mundopcd.entities;

import com.projeto.mundopcd.entities.SubEntities.Email;
import com.projeto.mundopcd.entities.SubEntities.Nome;
import com.projeto.mundopcd.models.AdministradorEmpresaModels;
import com.projeto.mundopcd.models.EmpresaModels;

public class AdministradorEmpresa {

    private int idAdmin;
    private Nome nome = new Nome();
    private Email email = new Email();
    private String senha;
    private EmpresaModels empresa;
    private Integer idEmpresa;

    public AdministradorEmpresa() {
    }

    public AdministradorEmpresa(int idAdmin, String nome, String email, String senha, EmpresaModels empresa, Integer idEmpresa) {
        this.idAdmin = idAdmin;
        this.nome.setNome(nome);
        this.email.setEmail(email);
        this.senha = senha;
        this.empresa = empresa;
        this.idEmpresa = idEmpresa;
    }

    public static AdministradorEmpresa toAdministradorEmpresa(AdministradorEmpresaModels administradorEmpresaModels) {
        AdministradorEmpresa administradorEmpresa = new AdministradorEmpresa();
        administradorEmpresa.setIdAdmin(administradorEmpresaModels.getIdAdmin());
        Nome nome = new Nome();
        nome.setNome(administradorEmpresaModels.getNome());
        administradorEmpresa.nome = nome;
        Email email = new Email();
        email.setEmail(administradorEmpresaModels.getEmail());
        administradorEmpresa.email = email;
        administradorEmpresa.setSenha(administradorEmpresaModels.getSenha());
        administradorEmpresa.setEmpresa(administradorEmpresaModels.getEmpresa());
        administradorEmpresa.setIdEmpresa(administradorEmpresaModels.getIdEmpresa());
        return administradorEmpresa;
    }

    public void validarAdministrador() {
        nome.validarNome();
        email.verificaEmail();
        senhaIsValid();
        validarEmpresa();
        validarIdAdmin();
    }



    private void senhaIsValid() {
        if (senha == null || senha.length() < 8) {
            throw new IllegalArgumentException("Senha deve ter no mínimo 8 caracteres.");
        }
        if (!senha.matches(".*[a-zA-Z].*") || !senha.matches(".*\\d.*")) {
            throw new IllegalArgumentException("Senha deve conter letras e números.");
        }
    }

    private void validarEmpresa() {
        if (empresa == null) {
            throw new IllegalArgumentException("Administrador deve estar associado a uma empresa.");
        }

    }

    private void validarIdAdmin() {
        if (idAdmin <= 0) {
            throw new IllegalArgumentException("ID do administrador deve ser positivo.");
        }
    }


    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getNome() {
        return nome.getNome();
    }

    public void setNome(String nome) {
        this.nome.setNome(nome);
    }

    public String getEmail() {
        return email.getEmail();
    }

    public void setEmail(String email) {
        this.email.setEmail(email);
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public EmpresaModels getEmpresa() {
        return empresa;
    }

    public void setEmpresa(EmpresaModels empresa) {
        this.empresa = empresa;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }
}