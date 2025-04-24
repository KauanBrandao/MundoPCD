package com.projeto.mundopcd.entities;

import com.projeto.mundopcd.entities.SubEntities.Email;
import com.projeto.mundopcd.entities.SubEntities.Nome;
import com.projeto.mundopcd.entities.SubEntities.Telefone;
import com.projeto.mundopcd.models.*;

import java.util.List;

public class Empresa {
    private int idEmpresa;
    private Nome nome = new Nome();
    private String cnpj;
    private Email email = new Email();
    private Telefone telefone = new Telefone();
    private String setor;
    private String politicaInclusao;
    private PlanoModels planoModels;
    private Integer idPlano;
    private EnderecoEmpresaModels enderecoEmpresaModels;
    private Integer idEnderecoEmpresa;
    private List<AdministradorEmpresaModels> administradores;
    private List<VagaModels> vagas;
    private List<EmpresaCursoModels> empresaCursoModels;

    public Empresa() {}

    public Empresa(int idEmpresa, String nome, String cnpj, String email, String telefone, String setor, String politicaInclusao, PlanoModels planoModels, Integer idPlano, EnderecoEmpresaModels enderecoEmpresaModels, Integer idEnderecoEmpresa, List<AdministradorEmpresaModels> administradores, List<VagaModels> vagas) {
        this.idEmpresa = idEmpresa;
        this.nome.setNome(nome);
        this.cnpj = cnpj;
        this.email.setEmail(email);
        this.telefone.setTelefone(telefone);
        this.setor = setor;
        this.politicaInclusao = politicaInclusao;
        this.planoModels = planoModels;
        this.enderecoEmpresaModels = enderecoEmpresaModels;
        this.administradores = administradores;
        this.vagas = vagas;
    }

    // ------------------- 1. CNPJ válido -------------------
    public boolean validarCNPJ() {
        if (cnpj == null) return false;
        String cnpjNum = cnpj.replaceAll("[^\\d]", "");
        if (cnpjNum.length() != 14 || cnpjNum.matches("(\\d)\\1{13}")) return false;

        try {
            char dig13 = calcularDigitoVerificador(cnpjNum, 12);
            char dig14 = calcularDigitoVerificador(cnpjNum, 13);
            return cnpjNum.charAt(12) == dig13 && cnpjNum.charAt(13) == dig14;
        } catch (Exception e) {
            return false;
        }
    }

    private char calcularDigitoVerificador(String cnpj, int posicao) {
        int peso = posicao - 7;
        int soma = 0;
        for (int i = 0; i < posicao; i++) {
            int num = cnpj.charAt(i) - '0';
            soma += num * peso;
            peso = (peso - 1 < 2) ? 9 : peso - 1;
        }
        int resto = soma % 11;
        return (resto < 2) ? '0' : (char) ((11 - resto) + '0');
    }


     boolean validarSetor() {
        return setor != null && !setor.trim().isEmpty();
    }

    public boolean validarPoliticaInclusao() {
        return politicaInclusao != null && politicaInclusao.trim().length() >= 10;
    }






    public void validarTudo() {
        if (!validarCNPJ()) throw new IllegalArgumentException("CNPJ inválido.");
        nome.validarNome();
        email.verificaEmail();
        telefone.verificaTelefone();
        if (!validarSetor()) throw new IllegalArgumentException("Setor obrigatório.");
        if (!validarPoliticaInclusao()) throw new IllegalArgumentException("Política de inclusão deve ter no mínimo 10 caracteres.");

    }


    public static Empresa toEmpresa(EmpresaModels empresaModels) {
        Empresa empresa = new Empresa();
        empresa.setIdEmpresa(empresaModels.getIdEmpresa());

        Nome nome = new Nome();
        nome.setNome(empresaModels.getNome());
        empresa.nome = nome; // <-- Faltava isso aqui

        Email email = new Email();
        email.setEmail(empresaModels.getEmail());
        empresa.email = email;

        Telefone telefone = new Telefone();
        telefone.setTelefone(empresaModels.getTelefone());
        empresa.telefone = telefone;

        empresa.setCnpj(empresaModels.getCnpj());
        empresa.setSetor(empresaModels.getSetor());
        empresa.setPoliticaInclusao(empresaModels.getPoliticaInclusao());

        empresa.setPlanoModels(empresaModels.getPlano());
        empresa.setEnderecoEmpresaModels(empresaModels.getEnderecoEmpresa());

        empresa.setAdministradores(empresaModels.getAdministradores());
        empresa.setVagas(empresaModels.getVagas());
        empresa.setAdministradores(empresaModels.getAdministradores());
        empresa.setVagas(empresaModels.getVagas());

        return empresa;
    }


    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNome() {
        return nome.getNome();
    }

    public void setNome(String nome) {
        this.nome.setNome(nome);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEmail() {
        return email.getEmail();
    }

    public void setEmail(String email) {
        this.email.setEmail(email);
    }

    public String getTelefone() {
        return telefone.getTelefone();
    }

    public void setTelefone(String telefone) {
        this.telefone.setTelefone(telefone);
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
