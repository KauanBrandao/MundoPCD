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
    private Plano plano;
    private Integer idPlano;
    private EnderecoEmpresa enderecoEmpresa;
    private Integer idEnderecoEmpresa;
    private List<AdministradorEmpresa> administradores;
    private List<VagaModels> vagases;
    private List<EmpresaCursoModels> empresaCursoModels;

    public Empresa(int idEmpresa, String nome, String cnpj, String email, String telefone, String setor, String politicaInclusao, Plano plano, Integer idPlano, EnderecoEmpresa enderecoEmpresa, Integer idEnderecoEmpresa, List<AdministradorEmpresa> administradores, List<VagaModels> vagases, List<EmpresaCursoModels> empresaCursoModels) {
        this.idEmpresa = idEmpresa;
        this.nome = nome;
        this.cnpj = cnpj;
        this.email = email;
        this.telefone = telefone;
        this.setor = setor;
        this.politicaInclusao = politicaInclusao;
        this.plano = plano;
        this.idPlano = idPlano;
        this.enderecoEmpresa = enderecoEmpresa;
        this.idEnderecoEmpresa = idEnderecoEmpresa;
        this.administradores = administradores;
        this.vagases = vagases;
        this.empresaCursoModels = empresaCursoModels;

    }

    public Empresa() {
    }

    public void validar() {
        validarIdEmpresa();
        validarNome();
        validarCNPJ();
        validarEmail();
        validarTelefone();
        validarSetor();
        validarPoliticaInclusao();
    }

    private void validarIdEmpresa() {
        if (idEmpresa <= 0) {
            throw new IllegalArgumentException("O ID da empresa deve ser maior que zero.");
        }
    }

    private void validarNome() {
        if (nome == null || nome.trim().isEmpty() || nome.length() < 3 || nome.length() > 100) {
            throw new IllegalArgumentException("O nome da empresa deve ter entre 3 e 100 caracteres.");
        }
    }

    private void validarCNPJ() {
        String cnpjNumerico = cnpj.replaceAll("\\D", "");
        if (cnpjNumerico.length() != 14 || !isCNPJValido(cnpjNumerico)) {
            throw new IllegalArgumentException("CNPJ inválido.");
        }
    }

    private boolean isCNPJValido(String cnpj) {
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

    private void validarEmail() {
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        if (email == null || !Pattern.matches(emailRegex, email)) {
            throw new IllegalArgumentException("E-mail inválido.");
        }
    }

    private void validarTelefone() {
        String telefoneRegex = "^\\(\\d{2}\\) \\d{4,5}-\\d{4}$";
        if (telefone == null || !Pattern.matches(telefoneRegex, telefone)) {
            throw new IllegalArgumentException("Telefone inválido.");
        }
    }

    private void validarSetor() {
        if (setor == null || setor.trim().isEmpty()) {
            throw new IllegalArgumentException("O setor é obrigatório.");
        }
    }

    private void validarPoliticaInclusao() {
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

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }

    public Integer getIdPlano() {
        return idPlano;
    }

    public void setIdPlano(Integer idPlano) {
        this.idPlano = idPlano;
    }

    public EnderecoEmpresa getEnderecoEmpresa() {
        return enderecoEmpresa;
    }

    public void setEnderecoEmpresa(EnderecoEmpresa enderecoEmpresa) {
        this.enderecoEmpresa = enderecoEmpresa;
    }

    public Integer getIdEnderecoEmpresa() {
        return idEnderecoEmpresa;
    }

    public void setIdEnderecoEmpresa(Integer idEnderecoEmpresa) {
        this.idEnderecoEmpresa = idEnderecoEmpresa;
    }

    public List<AdministradorEmpresa> getAdministradores() {
        return administradores;
    }

    public void setAdministradores(List<AdministradorEmpresa> administradores) {
        this.administradores = administradores;
    }

    public List<VagaModels> getVagases() {
        return vagases;
    }

    public void setVagases(List<VagaModels> vagases) {
        this.vagases = vagases;
    }

    public List<EmpresaCursoModels> getEmpresaCursoModels() {
        return empresaCursoModels;
    }

    public void setEmpresaCursoModels(List<EmpresaCursoModels> empresaCursoModels) {
        this.empresaCursoModels = empresaCursoModels;
    }
}