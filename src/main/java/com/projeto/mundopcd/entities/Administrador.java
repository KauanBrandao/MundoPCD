package com.projeto.mundopcd.entities;

import com.projeto.mundopcd.entities.SubEntities.Email;
import com.projeto.mundopcd.entities.SubEntities.Nome;
import com.projeto.mundopcd.models.AdministradorModels;

public class Administrador {

    private int idAdmin;
    private Nome nome = new Nome();
    private Email email = new Email();
    private String senha;

    public Administrador() {
    }

    public Administrador(int idAdmin, String nome, String email, String senha) {
        this.idAdmin = idAdmin;
        this.nome.setNome(nome);
        this.email.setEmail(email);
        this.senha = senha;
    }

    public static Administrador toAdministradorEmpresa(AdministradorModels administradorModels) {
        Administrador administrador = new Administrador();
        administrador.setIdAdmin(administradorModels.getIdAdmin());
        Nome nome = new Nome();
        nome.setNome(administradorModels.getNome());
        administrador.nome = nome;
        Email email = new Email();
        email.setEmail(administradorModels.getEmail());
        administrador.email = email;
        administrador.setSenha(administradorModels.getSenha());
        return administrador;
    }

    public void validarAdministrador() {
        nome.validarNome();
        email.verificaEmail();
        senhaIsValid();
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
}