package com.projeto.mundopcd.entities;

import com.projeto.mundopcd.models.CandidatoModels;

public class EnderecoCandidato {
    private int idEnderecoCandidato;
    private String logradouro;
    private String numero;
    private String cidade;
    private String estado;
    private String cep;
    private CandidatoModels candidatoModels;
    private Integer idCandidato;

    public EnderecoCandidato(int idEnderecoCandidato, String logradouro, String numero, String cidade, String estado, String cep, CandidatoModels candidatoModels, Integer idCandidato) {
        this.idEnderecoCandidato = idEnderecoCandidato;
        this.logradouro = logradouro;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.candidatoModels = candidatoModels;
        this.idCandidato = idCandidato;

    }

    public EnderecoCandidato() {
    }

    public void validar() {
        validarIdEnderecoCandidato();
        validarLogradouro();
        validarNumero();
        validarCidade();
        validarEstado();
        validarCep();
        validarCandidato();
    }

    private void validarIdEnderecoCandidato() {
        if (idEnderecoCandidato <= 0) {
            throw new IllegalArgumentException("O ID do endereço do candidato deve ser maior que zero.");
        }
    }

    private void validarLogradouro() {
        if (logradouro == null || logradouro.trim().isEmpty() || logradouro.length() < 3 || logradouro.length() > 255) {
            throw new IllegalArgumentException("O logradouro deve ter entre 3 e 255 caracteres.");
        }
    }

    private void validarNumero() {
        if (numero == null || numero.trim().isEmpty()) {
            throw new IllegalArgumentException("O número do endereço é obrigatório.");
        }
    }

    private void validarCidade() {
        if (cidade == null || cidade.trim().isEmpty() || cidade.length() < 2 || cidade.length() > 100) {
            throw new IllegalArgumentException("A cidade deve ter entre 2 e 100 caracteres.");
        }
    }

    private void validarEstado() {
        if (estado == null || estado.trim().isEmpty() || estado.length() != 2) {
            throw new IllegalArgumentException("O estado deve ser uma sigla válida de 2 caracteres.");
        }
    }

    private void validarCep() {
        String cepRegex = "^\\d{5}-\\d{3}$";
        if (cep == null || !cep.matches(cepRegex)) {
            throw new IllegalArgumentException("O CEP deve estar no formato 12345-678.");
        }
    }

    private void validarCandidato() {
        if (candidatoModels == null) {
            throw new IllegalArgumentException("O candidato associado ao endereço deve ser válido.");
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

    public CandidatoModels getCandidato() {
        return candidatoModels;
    }

    public void setCandidato(CandidatoModels candidatoModels) {
        this.candidatoModels = candidatoModels;
    }

    public Integer getIdCandidato() {
        return idCandidato;
    }

    public void setIdCandidato(Integer idCandidato) {
        this.idCandidato = idCandidato;
    }


}