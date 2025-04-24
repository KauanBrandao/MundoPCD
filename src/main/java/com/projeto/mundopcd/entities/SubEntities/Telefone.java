package com.projeto.mundopcd.entities.SubEntities;

public class Telefone {
    private String telefone;

  public Telefone () {
  }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void verificaTelefone() {
        if (telefone == null || telefone.trim().isEmpty()) {
            throw new IllegalArgumentException("O campo 'telefone' é obrigatório e não pode estar vazio.");
        }
        if (!telefone.matches("^\\(?\\d{2}\\)?[-.\\s]?\\d{4,5}[-.\\s]?\\d{4}$")) {
            throw new IllegalArgumentException("O telefone deve estar no formato válido, como (XX)XXXXX-XXXX ou XX-XXXXX-XXXX.");
        }
    }
}
