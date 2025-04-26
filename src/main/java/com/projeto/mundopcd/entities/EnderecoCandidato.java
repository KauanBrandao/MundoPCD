package com.projeto.mundopcd.entities;

import com.projeto.mundopcd.models.CandidatoModels;
import com.projeto.mundopcd.models.EnderecoCandidatoModels;

public class EnderecoCandidato {
    private int idEnderecoCandidato;
    private String logradouro;
    private String numero;
    private String cidade;
    private String estado;
    private String cep;
    private int idCandidato;

    public EnderecoCandidato(int idEnderecoCandidato, String logradouro, String numero, String cidade, String estado, String cep, CandidatoModels candidatoModels, Integer idCandidato) {
        this.idEnderecoCandidato = idEnderecoCandidato;
        this.logradouro = logradouro;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.idCandidato = idCandidato;

    }

    public EnderecoCandidato() {
    }
    public static EnderecoCandidato toEnderecoCandidato(EnderecoCandidatoModels enderecoCandidatoModels) {
        EnderecoCandidato enderecoCandidato = new EnderecoCandidato();
        enderecoCandidato.setIdEnderecoCandidato(enderecoCandidatoModels.getIdEnderecoCandidato());
        enderecoCandidato.setLogradouro(enderecoCandidatoModels.getLogradouro());
        enderecoCandidato.setNumero(enderecoCandidatoModels.getNumero());
        enderecoCandidato.setCidade(enderecoCandidatoModels.getCidade());
        enderecoCandidato.setEstado(enderecoCandidatoModels.getEstado());
        enderecoCandidato.setCep(enderecoCandidatoModels.getCep());

        enderecoCandidato.setIdCandidato(enderecoCandidatoModels.getIdCandidato());
        return enderecoCandidato;
    }
    public void executarValidacoes() {
        logradouroIsInvalid();
        numeroIsInvalid();
        cidadeIsInvalid();
        estadoIsInvalid();
        cepIsInvalid();
    }

    public void idEnderecoCandidatoIsInvalid() {
        if (idEnderecoCandidato <= 0) {
            throw new IllegalArgumentException("O ID do endereço do candidato deve ser maior que zero.");
        }
    }

    public void logradouroIsInvalid() {
        if (logradouro == null || logradouro.trim().isEmpty() || logradouro.length() < 3 || logradouro.length() > 255) {
            throw new IllegalArgumentException("O logradouro deve ter entre 3 e 255 caracteres.");
        }
    }

    public void numeroIsInvalid() {
        if (numero == null || numero.trim().isEmpty()) {
            throw new IllegalArgumentException("O número do endereço é obrigatório.");
        }
    }

    public void cidadeIsInvalid() {
        if (cidade == null || cidade.trim().isEmpty() || cidade.length() < 2 || cidade.length() > 100) {
            throw new IllegalArgumentException("A cidade deve ter entre 2 e 100 caracteres.");
        }
    }

    public void estadoIsInvalid() {
        if (estado == null || estado.trim().isEmpty() || estado.length() != 2) {
            throw new IllegalArgumentException("O estado deve ser uma sigla válida de 2 caracteres.");
        }
    }

    public void cepIsInvalid() {
        String cepRegex = "^\\d{8}$";
        if (cep == null || !cep.matches(cepRegex)) {
            throw new IllegalArgumentException("O CEP deve conter exatamente 8 dígitos numéricos, sem hífen.");
        }
    }

    public int getIdEnderecoCandidato() {
        return idEnderecoCandidato;
    }

    public void setIdEnderecoCandidato(int idEnderecoCandidato) {
        this.idEnderecoCandidato = idEnderecoCandidato;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Integer getIdCandidato() {
        return idCandidato;
    }

    public void setIdCandidato(int idCandidato) {
        this.idCandidato = idCandidato;
    }
}