package com.projeto.mundopcd.controllers.requests;

public class UsuarioRequest {
    private String usuario;
    private String senha;
    private String papel;

    public UsuarioRequest(String usuario, String senha, String papel) {
        this.usuario = usuario;
        this.senha = senha;
        this.papel = papel;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPapel() {
        return papel;
    }

    public void setPapel(String papel) {
        this.papel = papel;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
