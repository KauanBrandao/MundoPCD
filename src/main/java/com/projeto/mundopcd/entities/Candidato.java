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
    private String curriculo;
    private PlanoModels plano;
    private Integer idPlano;

    private EnderecoCandidatoModels enderecoCandidato;

    private List<CandidaturaModels> candidaturas;

    public Candidato() {}

    public Candidato(String tipoDeficiencia, String telefone, PlanoModels plano, String nome, Integer enderecoCandidato,
                     int idCandidato, String curriculo, String email, String cpf,
                     List<CandidaturaModels> candidaturas) {
        this.tipoDeficiencia = tipoDeficiencia;
        this.telefone.setTelefone(telefone);
        this.plano = plano;
        this.nome.setNome(nome);
        this.idCandidato = idCandidato;
        this.email.setEmail(email);
        this.curriculo = curriculo;
        this.cpf = cpf;
        this.candidaturas = candidaturas;
    }

    public static Candidato toCandidato(CandidatoModels candidatoModels) {
        Candidato candidato = new Candidato();

        candidato.setIdCandidato(candidatoModels.getIdCandidato());

        Nome nome = new Nome();
        nome.setNome(candidatoModels.getNome());
        candidato.setNome(nome);

        Email email = new Email();
        email.setEmail(candidatoModels.getEmail());
        candidato.setEmail(email);

        Telefone telefone = new Telefone();
        telefone.setTelefone(candidatoModels.getTelefone());
        candidato.setTelefone(telefone);

        candidato.setCpf(candidatoModels.getCpf());
        candidato.setCurriculo(candidatoModels.getCurriculo());
        candidato.setTipoDeficiencia(candidatoModels.getTipoDeficiencia());

        candidato.setPlano(candidatoModels.getPlano());

        candidato.setEnderecoCandidato(candidatoModels.getEnderecoCandidato());

        candidato.setCandidaturas(candidatoModels.getCandidaturas());

        return candidato;
    }

    public void validar() {
        email.verificaEmail();
        telefone.verificaTelefone();
        if (!isCpfValido()) throw new IllegalArgumentException("CPF inválido.");
        nome.validarNome();
        if (!isCurriculoValido()) throw new IllegalArgumentException("Currículo inválido.");
        if (!isTipoDeficienciaValido()) throw new IllegalArgumentException("Tipo de deficiência inválido.");
    }

    public boolean isCpfValido() {
        if (cpf == null || cpf.length() != 11 || !cpf.matches("\\d+")) {
            return false;
        }
        int[] peso1 = {10, 9, 8, 7, 6, 5, 4, 3, 2};
        int[] peso2 = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};

        try {
            int soma1 = 0, soma2 = 0;
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
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isCurriculoValido() {
        return curriculo != null && curriculo.length() <= 1000;
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

    // Getters e Setters
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

    public String getCurriculo() {
        return curriculo;
    }

    public void setCurriculo(String curriculo) {
        this.curriculo = curriculo;
    }

    public PlanoModels getPlano() {
        return plano;
    }

    public void setPlano(PlanoModels plano) {
        this.plano = plano;
    }

    public Integer getIdPlano() {
        return idPlano;
    }

    public void setIdPlano(Integer idPlano) {
        this.idPlano = idPlano;
    }

    public EnderecoCandidatoModels getEnderecoCandidato() {
        return enderecoCandidato;
    }

    public void setEnderecoCandidato(EnderecoCandidatoModels enderecoCandidato) {
        this.enderecoCandidato = enderecoCandidato;
    }


    public List<CandidaturaModels> getCandidaturas() {
        return candidaturas;
    }

    public void setCandidaturas(List<CandidaturaModels> candidaturas) {
        this.candidaturas = candidaturas;
    }
}
