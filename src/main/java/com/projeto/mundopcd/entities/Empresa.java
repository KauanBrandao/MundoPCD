package com.projeto.mundopcd.entities;

import com.projeto.mundopcd.models.*;
import java.util.List;
import java.util.regex.Pattern;

public class Empresa {
    private int idEmpresa;
    private String nome;
    private String cnpj;
    private String email;
    private String telefone;
    private String setor;
    private String politicaInclusao;
    private PlanoModels planoModels;
    private Integer idPlano;
    private EnderecoEmpresaModels enderecoEmpresaModels;
    private Integer idEnderecoEmpresa;
    private List<AdministradorEmpresaModels> administradores;
    private List<VagaModels> vagas;
    private List<EmpresaCursoModels> empresaCursoModels;

    public Empresa(int idEmpresa, String nome, String cnpj, String email, String telefone, String setor, String politicaInclusao, PlanoModels planoModels, Integer idPlano, EnderecoEmpresaModels enderecoEmpresaModels, Integer idEnderecoEmpresa, List<AdministradorEmpresaModels> administradores, List<VagaModels> vagas, List<EmpresaCursoModels> empresaCursoModels) {
        this.idEmpresa = idEmpresa;
        this.nome = nome;
        this.cnpj = cnpj;
        this.email = email;
        this.telefone = telefone;
        this.setor = setor;
        this.politicaInclusao = politicaInclusao;
        this.planoModels = planoModels;
        this.idPlano = idPlano;
        this.enderecoEmpresaModels = enderecoEmpresaModels;
        this.idEnderecoEmpresa = idEnderecoEmpresa;
        this.administradores = administradores;
        this.vagas = vagas;
        this.empresaCursoModels = empresaCursoModels;

    }

    public Empresa() {
    }

    public void executarValidacoes() {
        idEmpresaIsInvalid();
        nomeIsInvalid();
        cnpjIsInvalid();
        emailIsInvalid();
        telefoneIsInvalid();
        setorIsInvalid();
        politicaInclusaoIsInvalid();
    }

    public void idEmpresaIsInvalid() {
        if (idEmpresa <= 0) {
            throw new IllegalArgumentException("O ID da empresa deve ser maior que zero.");
        }
    }

    public void nomeIsInvalid() {
        if (nome == null || nome.trim().isEmpty() || nome.length() < 3 || nome.length() > 100) {
            throw new IllegalArgumentException("O nome da empresa deve ter entre 3 e 100 caracteres.");
        }
    }

    public void cnpjIsInvalid() {
        String cnpjNumerico = cnpj.replaceAll("\\D", "");
        if (cnpjNumerico.length() != 14 || !isCNPJValido(cnpjNumerico)) {
            throw new IllegalArgumentException("CNPJ inválido.");
        }
    }

    public boolean isCNPJValido(String cnpj) {
        int[] peso1 = {5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};
        int[] peso2 = {6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};

        try {
            int soma = 0;
            for (int i = 0; i < 12; i++) {
                soma += Character.getNumericValue(cnpj.charAt(i)) * peso1[i];
            }
            int digito1 = 11 - (soma % 11);
            digito1 = (digito1 >= 10) ? 0 : digito1;

            soma = 0;
            for (int i = 0; i < 13; i++) {
                soma += Character.getNumericValue(cnpj.charAt(i)) * peso2[i];
            }
            int digito2 = 11 - (soma % 11);
            digito2 = (digito2 >= 10) ? 0 : digito2;

            return digito1 == Character.getNumericValue(cnpj.charAt(12)) &&
                    digito2 == Character.getNumericValue(cnpj.charAt(13));
        } catch (NumberFormatException | IndexOutOfBoundsException e) {
            return false;
        }
    }

    public void emailIsInvalid() {
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        if (email == null || !Pattern.matches(emailRegex, email)) {
            throw new IllegalArgumentException("E-mail inválido.");
        }
    }

    public void telefoneIsInvalid() {
        String telefoneRegex = "^\\(\\d{2}\\) \\d{4,5}-\\d{4}$";
        if (telefone == null || !Pattern.matches(telefoneRegex, telefone)) {
            throw new IllegalArgumentException("Telefone inválido.");
        }
    }

    public void setorIsInvalid() {
        if (setor == null || setor.trim().isEmpty()) {
            throw new IllegalArgumentException("O setor é obrigatório.");
        }
    }

    public void politicaInclusaoIsInvalid() {
        if (politicaInclusao == null || politicaInclusao.length() < 10) {
            throw new IllegalArgumentException("A política de inclusão deve ter no mínimo 10 caracteres.");
        }
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getPoliticaInclusao() {
        return politicaInclusao;
    }

    public void setPoliticaInclusao(String politicaInclusao) {
        this.politicaInclusao = politicaInclusao;
    }

    public PlanoModels getPlanoModels() {
        return planoModels;
    }

    public void setPlanoModels(PlanoModels planoModels) {
        this.planoModels = planoModels;
    }

    public Integer getIdPlano() {
        return idPlano;
    }

    public void setIdPlano(Integer idPlano) {
        this.idPlano = idPlano;
    }

    public EnderecoEmpresaModels getEnderecoEmpresaModels() {
        return enderecoEmpresaModels;
    }

    public void setEnderecoEmpresaModels(EnderecoEmpresaModels enderecoEmpresaModels) {
        this.enderecoEmpresaModels = enderecoEmpresaModels;
    }

    public Integer getIdEnderecoEmpresa() {
        return idEnderecoEmpresa;
    }

    public void setIdEnderecoEmpresa(Integer idEnderecoEmpresa) {
        this.idEnderecoEmpresa = idEnderecoEmpresa;
    }

    public List<AdministradorEmpresaModels> getAdministradores() {
        return administradores;
    }

    public void setAdministradores(List<AdministradorEmpresaModels> administradores) {
        this.administradores = administradores;
    }

    public List<VagaModels> getVagas() {
        return vagas;
    }

    public void setVagas(List<VagaModels> vagas) {
        this.vagas = vagas;
    }

    public List<EmpresaCursoModels> getEmpresaCursoModels() {
        return empresaCursoModels;
    }

    public void setEmpresaCursoModels(List<EmpresaCursoModels> empresaCursoModels) {
        this.empresaCursoModels = empresaCursoModels;
    }
}