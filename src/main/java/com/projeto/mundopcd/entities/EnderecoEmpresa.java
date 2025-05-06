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

    public static EnderecoEmpresa toEnderecoEmpresa(EnderecoEmpresaModels enderecoEmpresaModels) {
        EnderecoEmpresa enderecoEmpresa = new EnderecoEmpresa();
        enderecoEmpresa.setCep(enderecoEmpresaModels.getCep());
        enderecoEmpresa.setCidade(enderecoEmpresaModels.getCidade());
        enderecoEmpresa.setEstado(enderecoEmpresaModels.getEstado());
        enderecoEmpresa.setLogradouro(enderecoEmpresaModels.getLogradouro());
        enderecoEmpresa.setNumero(enderecoEmpresaModels.getNumero());
        return enderecoEmpresa;
    }

    public void validarTudo() {
        cepIsInvalid();
        cidadeIsInvalid();
        estadoIsInvalid();
        logradouroIsInvalid();
        numeroIsInvalid();
        empresaIsInvalid();
    }

    public void cepIsInvalid() {
        String cepRegex = "^\\d{8}$";
        if (cep == null || !cep.matches(cepRegex)) {
            throw new IllegalArgumentException("O CEP deve conter exatamente 8 dígitos numéricos.");
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

    public void empresaIsInvalid() {
        if (empresa == null) {
            throw new IllegalArgumentException("Empresa não pode ser nula.");
        }
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public EmpresaModels getEmpresa() {
        return empresa;
    }

    public void setEmpresa(EmpresaModels empresa) {
        this.empresa = empresa;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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

}
