package com.projeto.mundopcd.entities;

import com.projeto.mundopcd.entities.SubEntities.Email;
import com.projeto.mundopcd.entities.SubEntities.Nome;
import com.projeto.mundopcd.entities.SubEntities.Telefone;
import com.projeto.mundopcd.models.CandidatoModels;
import com.projeto.mundopcd.models.CandidaturaModels;
import com.projeto.mundopcd.models.EnderecoCandidatoModels;
import com.projeto.mundopcd.models.PlanoModels;
import java.util.List;

public class Candidato {
    private int idCandidato;
    private Nome nome = new Nome();
    private Email email = new Email();
    private String cpf;
    private Telefone telefone = new Telefone();
    private String tipoDeficiencia;
    private String formacao;
    private String experiencia;
    private String habilidades;
    private String curriculo;
    private PlanoModels planoModels;
    private EnderecoCandidatoModels endereco;
    private Integer idEnderecoCandidato;
    private List<CandidaturaModels> candidaturaModels;


    public void validar() {
        email.verificaEmail();
        telefone.verificaTelefone();
        isCpfValido();
        nome.validarNome();
        isCurriculoValido();
        isFormacaoValida();
        isTipoDeficienciaValido();
    }

    public static Candidato toCandidato(CandidatoModels candidatoModels) {
        Candidato candidato = new Candidato();
        candidato.setIdCandidato(candidatoModels.getIdCandidato());

        Nome nome = new Nome();
        nome.setNome(candidatoModels.getNome());

        Email email = new Email();
        email.setEmail(candidatoModels.getEmail());

        candidato.setCpf(candidatoModels.getCpf());

        Telefone telefone = new Telefone();
        telefone.setTelefone(candidatoModels.getTelefone());
        candidato.setTipoDeficiencia(candidatoModels.getTipoDeficiencia());
        candidato.setFormacao(candidatoModels.getFormacao());
        candidato.setExperiencia(candidatoModels.getExperiencia());
        candidato.setHabilidades(candidatoModels.getHabilidades());
        candidato.setCurriculo(candidatoModels.getCurriculo());
        candidato.setPlanoModels(candidatoModels.getPlano());
        return candidato;
    }

    public Candidato(String tipoDeficiencia, String telefone, PlanoModels planoModels, String nome, Integer idEnderecoCandidato, int idCandidato, String habilidades, String formacao, String experiencia, EnderecoCandidatoModels endereco, String email, String curriculo, String cpf, List<CandidaturaModels> candidaturaModels) {
        this.tipoDeficiencia = tipoDeficiencia;
        this.telefone.setTelefone(telefone);
        this.planoModels = planoModels;
        this.nome.setNome(nome);
        this.idEnderecoCandidato = idEnderecoCandidato;
        this.idCandidato = idCandidato;
        this.habilidades = habilidades;
        this.formacao = formacao;
        this.experiencia = experiencia;
        this.endereco = endereco;
        this.email.setEmail(email);
        this.curriculo = curriculo;
        this.cpf = cpf;
        this.candidaturaModels = candidaturaModels;
    }

    public Candidato() {
    }

    public boolean isCpfValido() {
        if (cpf == null || cpf.length() != 11 || !cpf.matches("\\d+")) {
            return false;
        }
        int[] peso1 = {10, 9, 8, 7, 6, 5, 4, 3, 2};
        int[] peso2 = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};

        try {
            int soma1 = 0;
            int soma2 = 0;
            for (int i = 0; i < 9; i++) {
                int digito = Character.getNumericValue(cpf.charAt(i));
                soma1 += digito * peso1[i];
                soma2 += digito * peso2[i];
            }

            int digito1 = 11 - (soma1 % 11);
            digito1 = (digito1 > 9) ? 0 : digito1;

            soma2 += digito1 * peso2[9];
            int digito2 = 11 - (soma2 % 11);
            digito2 = (digito2 > 9) ? 0 : digito2;

            return digito1 == Character.getNumericValue(cpf.charAt(9)) &&
                    digito2 == Character.getNumericValue(cpf.charAt(10));
        } catch (NumberFormatException | IndexOutOfBoundsException e) {
            return false;
        }
    }


    public boolean isCurriculoValido() {
        return curriculo != null && curriculo.length() <= 1000;
    }

    public boolean isFormacaoValida() {
        return formacao != null && !formacao.trim().isEmpty();
    }

    public boolean isTipoDeficienciaValido() {
        String[] tiposValidos = {"Física", "Auditiva", "Visual", "Intelectual", "Múltipla"};
        if (tipoDeficiencia == null) return false;
        for (String tipo : tiposValidos) {
            if (tipoDeficiencia.equalsIgnoreCase(tipo)) {
                return true;
            }
        }
        return false;
    }


    public int getIdCandidato() {
        return idCandidato;
    }

    public void setIdCandidato(int idCandidato) {
        this.idCandidato = idCandidato;
    }

    public Nome getNome() {
        return nome;
    }

    public void setNome(Nome nome) {
        this.nome = nome;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public String getTipoDeficiencia() {
        return tipoDeficiencia;
    }

    public void setTipoDeficiencia(String tipoDeficiencia) {
        this.tipoDeficiencia = tipoDeficiencia;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    public String getCurriculo() {
        return curriculo;
    }

    public void setCurriculo(String curriculo) {
        this.curriculo = curriculo;
    }

    public PlanoModels getPlanoModels() {
        return planoModels;
    }

    public void setPlanoModels(PlanoModels planoModels) {
        this.planoModels = planoModels;
    }

    public EnderecoCandidatoModels getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoCandidatoModels endereco) {
        this.endereco = endereco;
    }

    public Integer getIdEnderecoCandidato() {
        return idEnderecoCandidato;
    }

    public void setIdEnderecoCandidato(Integer idEnderecoCandidato) {
        this.idEnderecoCandidato = idEnderecoCandidato;
    }

    public List<CandidaturaModels> getCandidaturaModels() {
        return candidaturaModels;
    }

    public void setCandidaturaModels(List<CandidaturaModels> candidaturaModels) {
        this.candidaturaModels = candidaturaModels;
    }
}