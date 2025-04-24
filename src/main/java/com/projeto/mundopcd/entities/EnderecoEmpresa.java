package com.projeto.mundopcd.entities;

import com.projeto.mundopcd.models.EmpresaModels;
import com.projeto.mundopcd.models.EnderecoEmpresaModels;

public class EnderecoEmpresa {

    private String cep;
    private String cidade;
    private EmpresaModels empresa;
    private String estado;
    private String logradouro;
    private String numero;

    public EnderecoEmpresa(String cep, String cidade, EmpresaModels empresa, String estado, String logradouro, String numero) {
        this.cep = cep;
        this.cidade = cidade;
        this.empresa = empresa;
        this.estado = estado;
        this.logradouro = logradouro;
        this.numero = numero;
    }

    public EnderecoEmpresa() {
    }

    public String getCep() {
        return cep;
    }

    public void validarTudo() {
        setCep(this.cep); // Valida o CEP
        setCidade(this.cidade); // Valida a cidade
        setEstado(this.estado); // Valida o estado
        setLogradouro(this.logradouro); // Valida o logradouro
        setNumero(this.numero); // Valida o número
        if (this.empresa == null) {
            throw new IllegalArgumentException("Empresa não pode ser nula.");
        }
    }

    public static EnderecoEmpresa toEnderecoEmpresa(EnderecoEmpresaModels enderecoEmpresaModels) {
        EnderecoEmpresa enderecoEmpresa = new EnderecoEmpresa();
        enderecoEmpresa.setCep(enderecoEmpresaModels.getCep());
        enderecoEmpresa.setCidade(enderecoEmpresaModels.getCidade());
        enderecoEmpresa.setEstado(enderecoEmpresaModels.getEstado());
        enderecoEmpresa.setLogradouro(enderecoEmpresaModels.getLogradouro());
        enderecoEmpresa.setNumero(enderecoEmpresaModels.getNumero());
        return enderecoEmpresa;
    }

    public void setCep(String cep) {
        if (cep == null || cep.isEmpty() || !cep.matches("\\d{5}-\\d{3}")) {
            throw new IllegalArgumentException("CEP inválido. Deve estar no formato 00000-000.");
        }
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        if (cidade == null || cidade.trim().isEmpty()) {
            throw new IllegalArgumentException("Cidade não pode ser nula ou vazia.");
        }
        this.cidade = cidade;
    }

    public EmpresaModels getEmpresa() {
        return empresa;
    }

    public void setEmpresa(EmpresaModels empresa) {
        if (empresa == null) {
            throw new IllegalArgumentException("Empresa não pode ser nula.");
        }
        this.empresa = empresa;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        if (estado == null || estado.trim().isEmpty() || estado.length() != 2) {
            throw new IllegalArgumentException("Estado inválido. Deve conter a sigla de 2 caracteres.");
        }
        this.estado = estado;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        if (logradouro == null || logradouro.trim().isEmpty()) {
            throw new IllegalArgumentException("Logradouro não pode ser nulo ou vazio.");
        }
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        if (numero == null || numero.trim().isEmpty()) {
            throw new IllegalArgumentException("Número não pode ser nulo ou vazio.");
        }
        this.numero = numero;
    }
}