package com.projeto.mundopcd.entities.SubEntities;

public class Nome {
    private String nome;


    public Nome() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void validarNome() {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio.");
        }
        if (nome.length() < 3) {
            throw new IllegalArgumentException("Nome deve ter pelo menos 3 caracteres.");
        }
        if (!Character.isUpperCase(nome.charAt(0))) {
            throw new IllegalArgumentException("Nome deve começar com letra maiúscula.");
        }
    }
}
